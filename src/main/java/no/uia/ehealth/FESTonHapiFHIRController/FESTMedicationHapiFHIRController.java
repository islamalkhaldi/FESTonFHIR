package no.uia.ehealth.FESTonHapiFHIRController;
 
import java.security.Principal;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.DetectedIssue;
import org.hl7.fhir.dstu3.model.Identifier.IdentifierUse;
import org.hl7.fhir.dstu3.model.ListResource;
import org.hl7.fhir.dstu3.model.ListResource.ListEntryComponent;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.Medication.MedicationIngredientComponent;
import org.hl7.fhir.dstu3.model.MedicationStatement;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Substance;
import org.hl7.fhir.instance.model.api.IBaseOperationOutcome;
import org.hl7.fhir.dstu3.model.Extension;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.Enumerations;
import ca.uhn.fhir.context.FhirContext;
//import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import no.uia.ehealth.FESTonHapiFHIRResources.FESTMedicationResource;
import no.uia.ehealth.FESTonHapiFHIRResources.FESTSubstanceResource;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.MappingFESTXmlModelToJavaModel.AutomaticMappingFESTOnFHIR;


public class FESTMedicationHapiFHIRController 
{
      
        
	protected FhirContext ctx ; // very expensive object, create as less as we can! this is why we get it in as an argument in the constructor.
	protected List<MedicationFHIRInformation> medicationFHIRInformationList;
	protected String baseURL; 
	
	
	public FESTMedicationHapiFHIRController(FhirContext ctx,List<MedicationFHIRInformation> medicationFHIRInformationList,String baseURL)
	{
		this.ctx = ctx;
		this.medicationFHIRInformationList = medicationFHIRInformationList;
		this.setBaseUrl(baseURL);
		IGenericClient client = ctx.newRestfulGenericClient(baseURL);
		int counter = 1; // to control the number of created instances ( for testing purpose)
		
		/*
		*  ************************************VERY IMPORTANT NOTE: ************************************************************
		* WE DEFINE OUR SEARCH PARAMETERS FOR ADDED EXTENSIONS TO OUR RESOURCES BEFORE WE CREATE INSTANCES OF THE CUSTOM RESOURCE 
		* ***************************************************************************** ****************************************
		* i.e : in FESTMedicationHapiFHIRController.java we define search parameters for vare navn and atcDN (substance name)
		*/
		
		// Start varenavn Search Parameter Definition & Creation
		
					// Start definition
					org.hl7.fhir.dstu3.model.SearchParameter vareNavnSP = new org.hl7.fhir.dstu3.model.SearchParameter();
					vareNavnSP.addBase("Medication");
					vareNavnSP.setCode("legemiddelVarenavn");
					vareNavnSP.setType(org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.TOKEN);
					vareNavnSP.setTitle("Bruk legemiddel varenavn");
					vareNavnSP.setDescription("FEST:Søk med legemiddel varenavn");
					vareNavnSP.setExpression("Medication.extension('http://ehealth.uia.no/StructureDefinition/legemiddelVarenavn')");
					vareNavnSP.setXpathUsage(org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NORMAL);
					vareNavnSP.setStatus(org.hl7.fhir.dstu3.model.Enumerations.PublicationStatus.ACTIVE);// End definition
					
					IGenericClient clientVareNavnSP = ctx.newRestfulGenericClient(baseURL); 
					// Start Creation
					// Upload it to the server
					clientVareNavnSP
						.create()
						.resource(vareNavnSP)
						.execute(); // End creation
		// End vareNavn Search Parameters Definition & Creation
		
		
					//delete
					/*IGenericClient clientVareNavnSP = ctx.newRestfulGenericClient(baseURL);
					clientVareNavnSP.delete().resourceById(new IdDt("SearchParameter", "19332")).execute();
					IGenericClient clientVareNavnSP1 = ctx.newRestfulGenericClient(baseURL);
					clientVareNavnSP1.delete().resourceById(new IdDt("SearchParameter", "19352")).execute();
					IGenericClient clientVareNavnSP2 = ctx.newRestfulGenericClient(baseURL);
					clientVareNavnSP2.delete().resourceById(new IdDt("SearchParameter", "19353")).execute();*/
		
		// Start atcNavn Search Parameter Definition & Creation
					
					// Start definition
					org.hl7.fhir.dstu3.model.SearchParameter atcNavnSP = new org.hl7.fhir.dstu3.model.SearchParameter();
					atcNavnSP.addBase("Medication");
					atcNavnSP.setCode("atcNavn");
					atcNavnSP.setType(org.hl7.fhir.dstu3.model.Enumerations.SearchParamType.TOKEN);
					atcNavnSP.setTitle("Bruk legemiddel virkestoff navn");
					atcNavnSP.setDescription("FEST: Søk med ATC-navn (DN-verdi i ATC-kode)");
					atcNavnSP.setExpression("Medication.extension('http://ehealth.uia.no/StructureDefinition/atcNavn')");
					atcNavnSP.setXpathUsage(org.hl7.fhir.dstu3.model.SearchParameter.XPathUsageType.NORMAL);
					atcNavnSP.setStatus(org.hl7.fhir.dstu3.model.Enumerations.PublicationStatus.ACTIVE);// End definition
					
					IGenericClient clientATCDNSP = ctx.newRestfulGenericClient(baseURL); 
					
					// Start Creation
					// Upload it to the server
					clientATCDNSP
						.create()
						.resource(atcNavnSP)
						.execute(); // End creation
		// End atcNavn Search Parameters Definition & Creation
			
		// logic for creating resources and populating data
		for(MedicationFHIRInformation m : medicationFHIRInformationList)
		{
			
		 // Here we  create a FESTMedicationResource instance
			 
			
					FESTMedicationResource fESTMedicationResource = new FESTMedicationResource();
					String ATC_CODE = "";
					if(m.getATCV() != null)
					{
						ATC_CODE = m.getATCV();
						
					}
					fESTMedicationResource.getCode().addCoding().setSystem("http://www.whocc.no/atc").setVersion("7180").setCode(ATC_CODE).setDisplay("ATC code");
					
					String ATC_NAME = "";
					if(m.getatcDN() != null)
					{
						ATC_NAME = m.getatcDN();
					}
					
					fESTMedicationResource.setAtcNavn(new StringType(ATC_NAME));
					
									
					fESTMedicationResource.setIsBrand(true);
					
					if((m.getLegemiddelVarselTrekant() != null) && (m.getLegemiddelVarselTrekant()))
					{
						fESTMedicationResource.setLegemiddelVarselTrekant(new BooleanType(true));
					}
					else
					{
						fESTMedicationResource.setLegemiddelVarselTrekant(new BooleanType(false));
					}
					
					if(m.getLegemiddelTypeSoknadV() != null)
					{
						if(m.getLegemiddelTypeSoknadV().equals("1"))
						{
							fESTMedicationResource.setIsOverTheCounter(false);
						}
						
						else
						{
							fESTMedicationResource.setIsOverTheCounter(true);
						}
						
					}
					
					
					
					 String producer = "";
					 if(m.getLegemiddelProdusent() !=null)
					 {
						 producer = m.getLegemiddelProdusent(); 
					 }
									         
			        fESTMedicationResource.getManufacturer().setDisplay(producer);
			        
			        String legemiddelFESTID = "";
			        if(m.getLegemiddelID() != null)
			        {
			        	legemiddelFESTID = m.getLegemiddelID();
			        }
			        
			        fESTMedicationResource.setLegemiddelFESTID(new StringType(legemiddelFESTID));
			        
			        String legemiddelVarenavn ="";
			        if(m.getLegemiddelVarenavn() != null)
			        {
			        	legemiddelVarenavn = m.getLegemiddelVarenavn();
			        }
			        
			        fESTMedicationResource.setLegemiddelVarenavn(new StringType(legemiddelVarenavn));
			        String legemiddelNavnFormStyrke = "";
			        if(m.getLegemiddelNavnFormStyrke() != null)
			        {
			        	
			        }
			        legemiddelNavnFormStyrke = m.getLegemiddelNavnFormStyrke();
			        fESTMedicationResource.setLegemiddelNavnFormStyrke(new StringType(legemiddelNavnFormStyrke));
			        
			        String legemiddelAdministrasjonsvei = "";
			        if(m.getLegemiddelAdministrasjonsveiDN() != null)
			        { 
			        	legemiddelAdministrasjonsvei = m.getLegemiddelAdministrasjonsveiDN();
			        }
			        
			        fESTMedicationResource.setLegemiddelAdministrasjonsvei(new StringType(legemiddelAdministrasjonsvei));
			        
			        String legemiddelEnhetsdosering = "";
			        if(m.getLegemiddelEnhetsdoseringDN() != null)
			        {
			        	legemiddelEnhetsdosering = m.getLegemiddelEnhetsdoseringDN();
			        }
			       
			        fESTMedicationResource.setLegemiddelEnhetsdosering(new StringType(legemiddelEnhetsdosering));
			        
			        String legemiddelKortDose = "";
			        if(m.getLegemiddelKortDoseDN() != null)
			        {
			        	legemiddelKortDose = m.getLegemiddelKortDoseDN();	
			        }
			        			        
			        fESTMedicationResource.setLegemiddelKortDose(new StringType(legemiddelKortDose));
			      
			  client.create().resource(fESTMedicationResource).execute();
			
			//End of create a FESTMedicationResource instance
			
			
			 //  try to read the created resource instance
			 
			
			
			/*Medication fm =  client.read().resource(Medication.class).withId(String.valueOf(counter)).execute();
			List<Extension> resourceExts = fm.getExtensionsByUrl("http://ehealth.uia.no/StructureDefinition/legemiddelVarenavn");
			Extension e = resourceExts.get(0);
			
			System.out.println("Legemiddel "+ e.getValue() + " made by "+fm.getManufacturer().getDisplay() + "atc code" + fm.getCode().getCoding().get(0).getCode());
			*/
			
			System.out.println(counter++);
			System.out.println();
			
			
		}
		
		//read/query some of the instances for testing purpose
			
				
				
		
		/*
		 * CODE to get extension values of a resource
		 *      // Get all extensions (modifier or not) for a given URL
				List<Extension> resourceExts = patient.getExtensionsByUrl("http://fooextensions.com#exts");
				 
				// Get all non-modifier extensions regardless of URL
				List<Extension> nonModExts = patient.getExtension();
				 
				//Get all non-modifier extensions regardless of URL
				List<Extension> modExts = patient.getModifierExtension();
	    */
		//Code create a patient
					
					
		//generatePatientMedicationSt();			
		
			
		 
	}


	
   /* private void generatePatientMedicationSt()
    {
    	// create patient
    	//IGenericClient clientPatient = ctx.newRestfulGenericClient(baseURL);
		/*Patient p = new Patient();
		p.setId("9091978");
		p.addName().setFamily("Nordmann").addGiven("Ole");
		Date bdate = new Date();
		bdate.setYear(1978);
		bdate.setMonth(9);
		bdate.setTime(9);
		p.setBirthDate(bdate);
		p.setGender(Enumerations.AdministrativeGender.MALE);
		clientPatient.create().resource(p).execute();
	
		// create MedicationStatements
		for(int i = 1; i<4; i++)
		{
			IGenericClient clientMedication = ctx.newRestfulGenericClient(baseURL);
			MedicationStatement ms = new MedicationStatement();
		    
			clientMedication.create().resource(ms).execute();
			//ms.getMedicationReference().getDisplay();
		}*/
    /*	//clientPatient.delete().resourceById(new IdDt("Patient", "24403")).execute();
    	
    	//resource(Medication.class).withId(String.valueOf(counter)).execute();
				
				
    } */


	public List<MedicationFHIRInformation> getMedicationFHIRInformationList() {
		if(medicationFHIRInformationList == null)
		{
			medicationFHIRInformationList = new ArrayList<MedicationFHIRInformation>();
		}
		return medicationFHIRInformationList;
	}


	public void setMedicationFHIRInformationList(List<MedicationFHIRInformation> medicationFHIRInformationList) {
		this.medicationFHIRInformationList = medicationFHIRInformationList;
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