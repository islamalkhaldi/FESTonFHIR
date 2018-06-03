package no.uia.ehealth.FESTonHapiFHIRController;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.Group.GroupMemberComponent;

import ca.uhn.fhir.context.FhirContext;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import no.uia.ehealth.FESTonHapiFHIRResources.FESTMedicationResource;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceFHIRInformation;

public class CheckForInteraction {

	protected FhirContext ctx = FhirContext.forDstu3();
	protected String drugA;
	protected String drugB;
	protected String baseURL;

	protected Boolean flagATCCodeA = false;
	protected Boolean flagVareNavnA = false;
	protected Boolean flagSubsNameA = false;

	protected Boolean flagATCCodeB = false;
	protected Boolean flagVareNavnB = false;
	protected Boolean flagSubsNameB = false;

	protected String aTC_CODE_A = "";
	private String drugA_ID = "";

	protected String aTC_CODE_B = "";
	private String drugB_ID = "";

	private DrugID_ATC_CODEPair drugID_atc_CODE_pair_drugA;
	private DrugID_ATC_CODEPair drugID_atc_CODE_pair_drugB;

	protected InteractionDetails interaction;

	private Boolean isInteraction = false;

	public CheckForInteraction(FhirContext ctx, String drugA, String drugB, String baseURL) {
		this.ctx = ctx;
		this.drugA = drugA;
		this.drugB = drugB;
		this.baseURL = baseURL;

		// 1. we need to get the ATC-CODE of drugA and drugB.

		// The practitioner can search by ATC-CODE, vareNavn, or active substance name.
		// 1.1 Check whether drugA search keyword is ATC-CODE, product name (vareNavn) ,
		// or active substance name
		this.drugID_atc_CODE_pair_drugA = inputCheckerA(drugA);

		// 1.2 Check whether drugB search keyword is ATC-CODE, product name (vareNavn) ,
		// or active substance name
		this.drugID_atc_CODE_pair_drugB = inputCheckerB(drugB);

		// 2. Search for all FESTGroup instances which include Medication reference
		// entries for drugA
		// store IDs of interactions and groups for drug A
		List<InteractionGroupPair> interaction_group_drugA = drugGroups(this.drugID_atc_CODE_pair_drugA); 
		
		// 3. Search for all FESTGroup instances which include Medication reference
		// entries for drugB
		// store IDs of interactions and groups for drug B
		List<InteractionGroupPair> interaction_group_drugB = drugGroups(this.drugID_atc_CODE_pair_drugB); 

		// 4. Compare both lists detect interaction, if any.

		Iterator itrA = interaction_group_drugA.iterator();
		Iterator itrB = interaction_group_drugB.iterator();

		while (itrA.hasNext()) {
			InteractionGroupPair pairDrugA = (InteractionGroupPair) itrA.next();

			while (itrB.hasNext()) {
				InteractionGroupPair pairDrugB = (InteractionGroupPair) itrB.next();
				// FEST interaction business logic
				// find the two different groups which have the same interaction id
			    	if (!(pairDrugA.getGroup_ID().equals(pairDrugB.getGroup_ID()))
						&& (pairDrugA.getInteraction_ID().equals(pairDrugB.getInteraction_ID()))) {
					// get interaction details for this group id
					String id = "";
					String relevansV = "";
					String relevansDN = "";
					String kliniskKonsekvens = "";
					String handtering = "";

					IGenericClient client = ctx.newRestfulGenericClient(baseURL);
					Group theOne = client.read().resource(Group.class).withId(pairDrugA.getGroup_ID()).execute();
					// get interaction ID
					List<Extension> resourceExtsInteractionID = theOne
							.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/interactionID");
					if (resourceExtsInteractionID != null) {
						Extension interactionID = resourceExtsInteractionID.get(0);
						id = interactionID.getValue().toString();
					}

					// get Interaction Relevans V attribute
					List<Extension> resourceExtsInteractionRelevansV = theOne
							.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/interactionRelevansV");
					if (resourceExtsInteractionRelevansV != null) {
						Extension interactionRelevansV = resourceExtsInteractionRelevansV.get(0);
						relevansV = interactionRelevansV.getValue().toString();
					}
					// get Interaction Relevans DN attribute
					List<Extension> resourceExtsInteractionRelevansDN = theOne
							.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/interactionRelevansDN");
					if (resourceExtsInteractionRelevansDN != null) {
						Extension interactionRelevansDN = resourceExtsInteractionRelevansDN.get(0);
						relevansDN = interactionRelevansDN.getValue().toString();
					}
					// get Interaction KliniskKonsekvens
					List<Extension> resourceExtsInteractionKliniskKonsekvens = theOne.getExtensionsByUrl(
							"http://ehealth.uia.no/StructureDefinition/interactionKliniskKonsekvens");
					if (resourceExtsInteractionKliniskKonsekvens != null) {
						Extension interactionKliniskKonsekvens = resourceExtsInteractionKliniskKonsekvens.get(0);
						kliniskKonsekvens = interactionKliniskKonsekvens.getValue().toString();
					}
					// get Interaction Handtering
					List<Extension> resourceExtsInteractionHandtering = theOne
							.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/interactionHandtering");
					if (resourceExtsInteractionHandtering != null) {
						Extension interactionHandtering = resourceExtsInteractionHandtering.get(0);
						handtering = interactionHandtering.getValue().toString();
					}

					// set interaction details
					this.interaction = new InteractionDetails(id, relevansV, relevansDN, kliniskKonsekvens, handtering);
					this.isInteraction = true;
					break;
				}
			}
		}

	}

	private List<InteractionGroupPair> drugGroups(DrugID_ATC_CODEPair pair) {
		List<InteractionGroupPair> interaction_group_for_drug = new ArrayList<InteractionGroupPair>();
		IGenericClient clientDrugAGroupIDs = ctx.newRestfulGenericClient(baseURL);

		Bundle resultGroups = clientDrugAGroupIDs.search().forResource(Group.class)
				.where(Group.MEMBER.hasId(pair.getDRUG_ID())).returnBundle(org.hl7.fhir.dstu3.model.Bundle.class)
				.execute();
		if (resultGroups != null) {

			if (resultGroups.getTotal() > 0) {
				for (BundleEntryComponent e : resultGroups.getEntry()) {
					String groupID = "";
					String interactionID = "";

					if (e.getResource() instanceof Group) {
						// get group id
						Group g = (Group) e.getResource();
						groupID = g.getId();

						// get interaction id
						List<Extension> resourceExts = g
								.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/interactionID");
						Extension exti = resourceExts.get(0);
						interactionID = exti.getValue().toString();

						InteractionGroupPair p = new InteractionGroupPair(interactionID, groupID);
						interaction_group_for_drug.add(p);
					}
				}

			}

		}

		return interaction_group_for_drug;
	}

	private DrugID_ATC_CODEPair inputCheckerA(String drug) {

		// 1.1.1 ATC-CODE checker
		IGenericClient clientATCV = ctx.newRestfulGenericClient(baseURL);
		Bundle resultATCV = clientATCV.search().forResource(Medication.class)
				.where(Medication.CODE.exactly().code(drug)).returnBundle(org.hl7.fhir.dstu3.model.Bundle.class)
				.execute();
		if (resultATCV != null) {
			if (resultATCV.getTotal() == 0) {
				this.flagATCCodeA = false;
			} else {
				this.flagATCCodeA = true;
				if (resultATCV.getEntry().get(0).getResource() != null) {
					if (resultATCV.getEntry().get(0).getResource() instanceof Medication) {
						Medication m = (Medication) resultATCV.getEntry().get(0).getResource();
						this.aTC_CODE_A = drug;
						this.drugA_ID = m.getId();
						this.drugID_atc_CODE_pair_drugA = new DrugID_ATC_CODEPair(m.getId(), drug);
					}

				}
			}

			
		}

		if (!flagATCCodeA) {
			// 1.1.2 Legemiddel varenavn checker
			// Note that we have defined the search parameter legemiddelVarenavn in
			// FESTMedicationHapiFHIRController.java
			// use the added search parameter
			IGenericClient clientVareNavn = ctx.newRestfulGenericClient(baseURL);
			Bundle resultVareNavn = clientVareNavn.search().forResource(Medication.class)
					.where(new TokenClientParam("legemiddelVarenavn").exactly().code(drug)).returnBundle(Bundle.class)
					.execute();

			if (resultVareNavn != null) {

				if (resultVareNavn.getTotal() == 0) {
					this.flagVareNavnA = false;
				} else {
					this.flagVareNavnA = true;
					if (resultVareNavn.getEntry().get(0).getResource() != null) {
						if (resultVareNavn.getEntry().get(0).getResource() instanceof Medication) {
							Medication m =  (Medication)resultVareNavn.getEntry().get(0)
									.getResource();
							this.drugA_ID = m.getId();
							this.aTC_CODE_A = m.getCode().getCoding().get(0).getCode();

							this.drugID_atc_CODE_pair_drugA = new DrugID_ATC_CODEPair(m.getId(),
									m.getCode().getCoding().get(0).getCode());
						}

					}

				}
			}

		}

		

		if (!this.flagATCCodeA && !this.flagVareNavnA) {
			// 1.1.3 active substance name checker
			// Note that we have defined the search parameter atcNavn in
			// FESTMedicationHapiFHIRController.java
			// use the added search parameter
			IGenericClient clientATCDN = ctx.newRestfulGenericClient(baseURL);
			Bundle resultSubstanceName = clientATCDN.search().forResource(Medication.class)
					.where(new TokenClientParam("atcNavn").exactly().code(drug)).returnBundle(Bundle.class).execute();

			if (resultSubstanceName != null) {

				if (resultSubstanceName.getTotal() == 0) {
					this.flagSubsNameA = false;
				} else {
					this.flagSubsNameA = true;
					if (resultSubstanceName.getEntry().get(0).getResource() != null) {
						if (resultSubstanceName.getEntry().get(0).getResource() instanceof Medication) {
							Medication m = (Medication) resultSubstanceName.getEntry().get(0)
									.getResource();
							this.drugA_ID = m.getId();
							this.aTC_CODE_A = m.getCode().getCoding().get(0).getCode();
							this.drugID_atc_CODE_pair_drugA = new DrugID_ATC_CODEPair(m.getId(),
									m.getCode().getCoding().get(0).getCode());
						}

					}

				}
			}

		}

		return drugID_atc_CODE_pair_drugA;
	}

	private DrugID_ATC_CODEPair inputCheckerB(String drug) {

		// 1.1.1 ATC-CODE checker
		IGenericClient clientATCV = ctx.newRestfulGenericClient(baseURL);
		Bundle resultATCV = clientATCV.search().forResource(Medication.class)
				.where(Medication.CODE.exactly().code(drug)).returnBundle(org.hl7.fhir.dstu3.model.Bundle.class)
				.execute();
		if (resultATCV != null) {
			if (resultATCV.getTotal() == 0) {
				this.flagATCCodeB = false;
			} else {
				this.flagATCCodeB = true;
				if (resultATCV.getEntry().get(0).getResource() != null) {
					if (resultATCV.getEntry().get(0).getResource() instanceof Medication) {
						Medication m = (Medication) resultATCV.getEntry().get(0).getResource();
						this.aTC_CODE_B = drug;
						this.drugB_ID = m.getId();
						this.drugID_atc_CODE_pair_drugB = new DrugID_ATC_CODEPair(m.getId(), drug);
					}

				}
			}

			// 1.1.2 Legemiddel varenavn checker
			// Note that we have defined the search parameter legemiddelVarenavn in
			// FESTMedicationHapiFHIRController.java
			// use the added search parameter
		}

		if (!flagATCCodeB) {
			IGenericClient clientVareNavn = ctx.newRestfulGenericClient(baseURL);
			Bundle resultVareNavn = clientVareNavn.search().forResource(Medication.class)
					.where(new TokenClientParam("legemiddelVarenavn").exactly().code(drug)).returnBundle(Bundle.class)
					.execute();

			if (resultVareNavn != null) {

				if (resultVareNavn.getTotal() == 0) {
					this.flagVareNavnB = false;
				} else {
					this.flagVareNavnB = true;
					if (resultVareNavn.getEntry().get(0).getResource() != null) {
						if (resultVareNavn.getEntry().get(0).getResource() instanceof Medication) {
							Medication m = (Medication) resultVareNavn.getEntry().get(0)
									.getResource();
							this.drugB_ID = m.getId();
							this.aTC_CODE_B = m.getCode().getCoding().get(0).getCode();

							this.drugID_atc_CODE_pair_drugB = new DrugID_ATC_CODEPair(m.getId(),
									m.getCode().getCoding().get(0).getCode());
						}

					}

				}
			}

		}

		// 1.1.3 active substance name checker
		// Note that we have defined the search parameter atcNavn in
		// FESTMedicationHapiFHIRController.java
		// use the added search parameter

		if (!this.flagATCCodeB && !this.flagVareNavnB) {
			IGenericClient clientATCDN = ctx.newRestfulGenericClient(baseURL);
			Bundle resultSubstanceName = clientATCDN.search().forResource(Medication.class)
					.where(new TokenClientParam("atcNavn").exactly().code(drug)).returnBundle(Bundle.class).execute();

			if (resultSubstanceName != null) {

				if (resultSubstanceName.getTotal() == 0) {
					this.flagSubsNameB = false;
				} else {
					this.flagSubsNameB = true;
					if (resultSubstanceName.getEntry().get(0).getResource() != null) {
						if (resultSubstanceName.getEntry().get(0).getResource() instanceof Medication) {
							Medication m = (Medication) resultSubstanceName.getEntry().get(0)
									.getResource();
							this.drugB_ID = m.getId();
							this.aTC_CODE_B = m.getCode().getCoding().get(0).getCode();
							this.drugID_atc_CODE_pair_drugB = new DrugID_ATC_CODEPair(m.getId(),
									m.getCode().getCoding().get(0).getCode());
						}

					}

				}
			}

		}

		return drugID_atc_CODE_pair_drugB;
	}

	public String getATC_CODE_A() {
		if (aTC_CODE_A == null) {
			aTC_CODE_A = new String();
		}

		return aTC_CODE_A;
	}

	public void setATC_CODE_A(String aTC_CODE_A) {
		this.aTC_CODE_A = aTC_CODE_A;
	}

	public String getATC_CODE_B() {
		if (aTC_CODE_B == null) {
			aTC_CODE_B = new String();
		}

		return aTC_CODE_B;
	}

	public void setATC_CODE_B(String aTC_CODE_B) {
		this.aTC_CODE_B = aTC_CODE_B;
	}

	public Boolean getFlagATCCodeA() {
		if (flagATCCodeA == null) {
			flagATCCodeA = false;
		}
		return flagATCCodeA;
	}

	public void setFlagATCCodeA(Boolean flagATCCodeA) {
		this.flagATCCodeA = flagATCCodeA;
	}

	public Boolean getFlagVareNavnA() {
		if (flagVareNavnA == null) {
			flagVareNavnA = false;
		}
		return flagVareNavnA;
	}

	public void setFlagVareNavnA(Boolean flagVareNavnA) {
		this.flagVareNavnA = flagVareNavnA;
	}

	public Boolean getFlagSubsNameA() {
		if (flagSubsNameA == null) {
			flagSubsNameA = false;
		}
		return flagSubsNameA;
	}

	public void setFlagSubsNameA(Boolean flagSubsNameA) {
		this.flagSubsNameA = flagSubsNameA;
	}

	public Boolean getFlagATCCodeB() {
		if (flagATCCodeB == null) {
			flagATCCodeB = false;
		}
		return flagATCCodeB;
	}

	public void setFlagATCCodeB(Boolean flagATCCodeB) {
		this.flagATCCodeB = flagATCCodeB;
	}

	public Boolean getFlagVareNavnB() {
		if (flagVareNavnB == null) {
			flagVareNavnB = false;
		}
		return flagVareNavnB;
	}

	public void setFlagVareNavnB(Boolean flagVareNavnB) {
		this.flagVareNavnB = flagVareNavnB;
	}

	public Boolean getFlagSubsNameB() {
		if (flagSubsNameB) {
			flagSubsNameB = false;
		}
		return flagSubsNameB;
	}

	public void setFlagSubsNameB(Boolean flagSubsNameB) {
		this.flagSubsNameB = flagSubsNameB;
	}

	public InteractionDetails getInteraction() {

		return interaction;
	}

	public void setInteraction(InteractionDetails interaction) {
		this.interaction = interaction;
	}

	public Boolean getIsInteraction() {
		if (isInteraction == null) {
			isInteraction = false;
		}
		return isInteraction;
	}

	public void setIsInteraction(Boolean isInteraction) {
		this.isInteraction = isInteraction;
	}

}
