package no.uia.ehealth.FESTonHapiFHIRController;

import java.security.Principal;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.DetectedIssue;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Identifier.IdentifierUse;
import org.hl7.fhir.dstu3.model.ListResource;
import org.hl7.fhir.dstu3.model.ListResource.ListEntryComponent;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.codesystems.GroupType;
import org.hl7.fhir.dstu3.model.codesystems.GroupTypeEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseOperationOutcome;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.Group.GroupMemberComponent;
import org.hl7.fhir.dstu3.model.HumanName;
 
import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import no.uia.ehealth.FESTonHapiFHIRResources.*;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceGroupFHIRInformation;
import no.uia.ehealth.MappingFESTXmlModelToJavaModel.AutomaticMappingFESTOnFHIR;
public class FESTInteractionHapiFHIRController
{
   
	        
		
		protected FhirContext ctx = FhirContext.forDstu3(); // very expensive object, create as less as we can!
		protected List<InteractionFHIRInformation> interactionFHIRInformationList;
		protected String baseURL; 
		
		
		public FESTInteractionHapiFHIRController(FhirContext ctx,List<InteractionFHIRInformation> interactionFHIRInformationList,String baseURL)
		{
			this.ctx = ctx;
			this.interactionFHIRInformationList = interactionFHIRInformationList;
			this.setBaseUrl(baseURL);
			
			
			
			// logic for creating resources and populating data
			
			for(InteractionFHIRInformation interaction : interactionFHIRInformationList)
			{
				String interactionID = "";
				String interactionFHIRRelevansV = "";
				String interactionFHIRRelevansDN = "";
				String interactionFHIRHandtering = "";
				String interactionFHIRKliniskKonsekvens = "";
				
				if(interaction.getInteractionFHIRID() != null)
				{
					interactionID = interaction.getInteractionFHIRID();
				}
				
				if(interaction.getInteractionFHIRRelevansV() != null)
				{
					interactionFHIRRelevansV =  interaction.getInteractionFHIRRelevansV();
				}
				
				if(interaction.getInteractionFHIRRelevansDN() != null)
				{
					interactionFHIRRelevansDN = interaction.getInteractionFHIRRelevansDN();
				}
				
				if(interaction.getInteractionFHIRHandtering() != null)
				{
					interactionFHIRHandtering = interaction.getInteractionFHIRHandtering();
				}
				
				if(interaction.getInteractionFHIRKliniskKonsekvens() != null)
				{
					interactionFHIRKliniskKonsekvens = interaction.getInteractionFHIRKliniskKonsekvens();
				}
				
				
				//each interaction has two medication groups, so we loop and process each group
				List <SubstanceGroupFHIRInformation> interactionRelatedGroups = interaction.getSubstanceGroupFHIRInformation();
				
				for(SubstanceGroupFHIRInformation medicationsGroup : interactionRelatedGroups)
				{
					/*
					 * Here we create the FESTGroupResource instance
					 */
					//Start of create a FESTGroupResource instance
					FESTGroupResource fESTGroupResource = new FESTGroupResource();
					// Add interaction details.
					fESTGroupResource.setInteractionID(new StringType(interactionID));
					fESTGroupResource.setInteractionRelevansV(new StringType(interactionFHIRRelevansV));
					fESTGroupResource.setInteractionRelevansDN(new StringType(interactionFHIRRelevansDN));
					fESTGroupResource.setInteractionHandtering(new StringType(interactionFHIRHandtering));
					fESTGroupResource.setInteractionKliniskKonsekvens(new StringType(interactionFHIRKliniskKonsekvens));
					
					
					fESTGroupResource.setActual(true); // means the group refers to specific group of real medication instances
					fESTGroupResource.setActive(true); // means the group refers to specific group of real medication instances
					
					//GroupType.MEDICATION
					fESTGroupResource.setType(FESTGroupResource.GroupType.valueOf("MEDICATION"));  
					
					
					
					/* FESTGroup.member
					 * Here we populate FESTGroupResource.member by adding entity reference for each 
					 * FESTMedicationResource/ Medication instance we stored previously
					 */
					
					//each group has a list of medication entities
					List<SubstanceFHIRInformation>medicationsList = new ArrayList<SubstanceFHIRInformation>();
					if(medicationsGroup.getSubstanceFHIRInformation() != null)
					medicationsList = medicationsGroup.getSubstanceFHIRInformation();
					
					for(SubstanceFHIRInformation medication : medicationsList)
					{
								
						//get a reference to an instance of FESTMedicationResource
						// which has the same atc-v and atc-dn values.
						String atcV = "";
						if(medication.getatcV() != null)
						{
							atcV = medication.getatcV();
						}
						
						
						IGenericClient client = ctx.newRestfulGenericClient(baseURL);
						Bundle result = client
							      .search()
							      .forResource(Medication.class)
							      .where(Medication.CODE.exactly().code(atcV))
							      .returnBundle(org.hl7.fhir.dstu3.model.Bundle.class)
							      .execute();
						
						if(result.getEntry() != null && result.getEntry().size() != 0)
						{
							for (BundleEntryComponent entry : result.getEntry())
							{
					            Medication drug = (Medication) entry.getResource();
					            GroupMemberComponent member = new GroupMemberComponent();
					            member.getEntity().setReference(drug.getId());
					            member.setEntityTarget(drug);
					            member.setEntity(member.getEntity().setReference(drug.getId()));
					            fESTGroupResource.addMember(member);
							}
						}
						
						
						
					}//End of create a FESTGroupResource instance
					
									
					
					//Send the FESTGroupResource instance to hapi-fhir server
					IGenericClient clientSender = ctx.newRestfulGenericClient(baseURL);
					clientSender.create().resource(fESTGroupResource).execute();
				}
				
				
				
			}
			
			//read/query some of the instances for testing purpose
			
			
			//****************************************************************************
	/*		
			   //--------------------------------------------------------------------------------------------------------
	        // SNIPPET YOU MAY NEED
	        //------------------------------------------
	        /*org.hl7.fhir.dstu3.model.ListResource lr = new ListResource();
	        ListEntryComponent lem = new ListEntryComponent();
	        Patient patient = new Patient();
	        lem.setItemTarget(patient);
	        lr.addEntry(lem);
	         
	         
	         org.hl7.fhir.dstu3.model.Group g = new  org.hl7.fhir.dstu3.model.Group();
	         org.hl7.fhir.dstu3.model.Group.GroupMemberComponent gm = new  org.hl7.fhir.dstu3.model.Group.GroupMemberComponent();
	         gm.setEntityTarget(patient);
	         
	         
//	      // Give the observation a code (what kind of observation is this)
//	      CodingDt coding = observation.getCode().addCoding();
//	      coding.setCode("29463-7").setSystem("http://loinc.org").setDisplay("Body Weight");
	//--------------------------------------------------------------------------------------------------------
	        //FESTMedication fm = new FESTMedication();
	       // fm.setAtcNavn(new StringType("Fido"));
	         
	         
	             // Create instance of a resource and populate it with some information
	             Patient patient = new Patient();
	           HumanName t = patient.addName();
	           Medication m = new Medication();
	            
	            
	             patient.addIdentifier()
	                     .setSystem("http://localhost:8080/fest/")
	                     .setValue(String.valueOf(8888));
	                  patient.addName()
	                     .setFamily("Nordmann")
	                     .addGiven(" ")
	                     .addGiven("Ole.");
	                   
	                     
	                  patient.addIdentifier().setUse(IdentifierUse.OFFICIAL).setSystem("urn:example").setValue("7000135");
	                              //test 
	                           // Create an example patient
	                              FESTMedicationResource custPatient = new FESTMedicationResource();
	                             // custPatient.addName().setFamily("Smith").addGiven("John");
	                            //  custPatient.setPetName(new StringType("Grimstad")); // populate the extension
	                                
	                              // Create the resource like normal
	                              client.create().resource(custPatient).execute();
	                                
	                              // You can also read the resource back like normal
	                             // custPatient = client.read().resource(MyPatient.class).withId("123").execute();
	                               
	                               
	                              //test
	                    
	                 //***************EXTENSION START*************
	                  // Create an extension
	                  Extension ext = new Extension();
	                  // Populate extension with information
	                  ext.setUrl("http://localhost:8081/fest/extensions#test");
	                  ext.setValue(new DateTimeType("2011-01-02T11:13:15"));
	                  // Add the extension to the resource instance
	                  patient.addExtension(ext);
	                  //***************EXTENSION END*************   
	               
	                  // Create a bundle that will be used as a transaction
	                  Bundle bundle = new Bundle();
	                  bundle.setType(Bundle.BundleType.TRANSACTION);
	                  bundle.addEntry()
	                     .setFullUrl(patient.getName().toString())
	                     .setResource(patient)
	                     .getRequest()
	                     .setUrl("Patient")
	                     .setMethod(Bundle.HTTPVerb.POST);
	                 // Execute the transaction
	                 Bundle resp = client.transaction().withBundle(bundle).execute();
	                  
	                 //Consolsre display for testing purpose
	                 System.out.println(ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(bundle));
	                  
	                 // Delete some instances from hapi-fhir server
	                  for(int i=1; i<6; i++)
	                  {
	                      IBaseOperationOutcome tte = client.delete().resourceById(new IdDt("Patient", String.valueOf(i))).execute();
	                  }
	                   
			  
			  
			 */		
			
		   //****************************************************************************
			
		}


		



	
		public List<InteractionFHIRInformation> getInteractionFHIRInformationList() {
			if(interactionFHIRInformationList == null)
			{
				interactionFHIRInformationList = new ArrayList<InteractionFHIRInformation>();
			}
			return interactionFHIRInformationList;
		}







		public void setInteractionFHIRInformationList(List<InteractionFHIRInformation> interactionFHIRInformationList) {
			this.interactionFHIRInformationList = interactionFHIRInformationList;
		}







		public FhirContext getCtx() {
			if(ctx == null)
			{
				ctx = FhirContext.forDstu3();
			}
			return ctx;
		}






		public void setCtx(FhirContext ctx) {
			this.ctx = ctx;
		}






		public String getBaseUrl() {
			 if (baseURL == null) 
			 {
				 baseURL = new String();
		     }
			return baseURL;
		}


		public void setBaseUrl(String value) {
			this.baseURL = value;
		}
			
	}
	
	
	

