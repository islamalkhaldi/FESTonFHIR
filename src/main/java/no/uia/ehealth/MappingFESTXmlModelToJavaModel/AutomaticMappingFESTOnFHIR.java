package no.uia.ehealth.MappingFESTXmlModelToJavaModel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.method.SearchParameter;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.FESTonHapiFHIRController.*;

import no.uia.ehealth.workflow.*;

public class AutomaticMappingFESTOnFHIR {
	// private static final String XML_FILE = "miniFest.xml";
	private static final String XML_FILE = "fest251.xml";
	private static List<MedicationFHIRInformation> medicationFHIRInformationList = new ArrayList<MedicationFHIRInformation>();
	private static List<InteractionFHIRInformation> interactionFHIRInformationList = new ArrayList<InteractionFHIRInformation>();
	private static final String baseURL = "http://localhost:8081/fest/baseDstu3"; // to be replaced with url of production web server
	private static FhirContext ctx = FhirContext.forDstu3();

	public static void main(String[] args) throws JAXBException, FileNotFoundException {

		// **************************Generate FEST java class model***************************************
		// For more details about the Apache Maven configuration behind FEST java model
		// generation  please refer to the "pom.xml" file of this project. A lot of setup, testing,
		// installation and  re-installation efforts have been paid to get the model mapped into java
		// classes model.
		// ***********************************************************************************************

		// create JAXB context and generate FEST information model java classes
		JAXBContext context = JAXBContext.newInstance("no.uia.ehealth.workflow");
		Unmarshaller um = context.createUnmarshaller();
		// read FEST 2.5.1 xml file
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(XML_FILE)));

		try {

			FEST fest = (FEST) um.unmarshal(bis);// End of Generate java classes for FEST  information model 

			// ***************************Get FEST catalogues information************************************
			
			/*Here we loop through FEST information java model and select the information
			 * we are going to represent in our FHIR server. 
			 * Corresponding classes has been created for this purpose under package no.uia.ehealth.FHIRInformationModel
			 */
			
			
			if (fest != null) {

				// *******************************************************************************************
				// LegemiddelMerkevare Catalogue
				// ********************************************************************************************

				LegemiddelMerkevareCatalogueMapper lm = new LegemiddelMerkevareCatalogueMapper(fest);
				medicationFHIRInformationList = lm.getMedicationFHIRInformationList();

				// *******************************************************************************************
				// Interaksjoner Catalogue
				// *********************************************************************************************

				InteraksjonCatalogueMapper im = new InteraksjonCatalogueMapper(fest);
				interactionFHIRInformationList = im.getInteractionFHIRInformationListt(); // End of Get FEST catalogues information
				
				
				
				// Send FEST catalogues data to Hapi Fhir Controller
				if (medicationFHIRInformationList != null && medicationFHIRInformationList.size() != 0) {

				 /* FESTMedicationHapiFHIRController fESTMedicationHapiFHIRController = new
				   FESTMedicationHapiFHIRController(ctx,medicationFHIRInformationList,baseURL);*/
					
					System.out.print("finished medications");
				}
				
				if (interactionFHIRInformationList != null && interactionFHIRInformationList.size() != 0) {

					/*FESTInteractionHapiFHIRController fESTInteractionHapiFHIRController = new
					FESTInteractionHapiFHIRController(ctx,interactionFHIRInformationList,baseURL);*/
					System.out.print("finished interactions");
									
				}

				/*
				 * Check for interaction
				 * At this stage: I get drugA and drugB from the console  H02AB02    N03AA02
				 * 
				 */
				//TODO : Practitioner Web Application send drug A and drug B for durg-drug interaction
								
				
								System.out.println("Drug-drug interaction checkup:");
								System.out.println("");
								System.out.println("Enter drugA");
								Scanner scannerA = new Scanner(System.in);
								String drugA = scannerA.nextLine();
								System.out.println("drugA : " + drugA);
								System.out.println("");
								System.out.println("Enter drugB");
								Scanner scannerB = new Scanner(System.in);
								String drugB = scannerB.nextLine();
								System.out.println("drugB : " + drugB);
								System.out.println("");
								if (medicationFHIRInformationList != null && medicationFHIRInformationList.size() != 0)
								{
									System.out.println("Before check");
									CheckForInteraction interactionCheckup = new CheckForInteraction(ctx, drugA, drugB, baseURL);
									System.out.println("After check");
									if(interactionCheckup.getIsInteraction())
									{
										
										System.out.println("Interaction found!");
										System.out.println("Severity level" + interactionCheckup.getInteraction().getRelevansV());
										System.out.println("Severity description" + interactionCheckup.getInteraction().getRelevansDN());
										System.out.println("Clinical consequences" + interactionCheckup.getInteraction().getKliniskKonsekvens());
										System.out.println("Guideance" + interactionCheckup.getInteraction().getHandtering());
										
									}
									
									
								}
			}

		} finally {
			// validateFESTMapping();

		}

	}

	private static void validateFESTMapping() {
		System.out.println(medicationFHIRInformationList.size());
		System.out.println("Finished Parsing FEST xml file.");
		System.out.println("-------------------------------------");
		System.out.println("Please select ATC v attribute for any medicine in FEST xml file");
		Scanner scanner = new Scanner(System.in);
		String atc = scanner.nextLine();
		System.out.println("You select ATC code: " + atc);
		System.out.println("Check our mapping");
		System.out.println("The following medicines have the same ATC code:");
		List<String> medicineName = new ArrayList<String>();

		for (MedicationFHIRInformation m : medicationFHIRInformationList) {
			String atcCodeV = m.getATCV();
			if (atc.equals(atcCodeV)) {
				medicineName.add(m.getLegemiddelNavnFormStyrke());

			}
		}

		for (String s : medicineName) {
			System.out.println(s);
		}

		System.out.println("------------------------------");

		System.out.println("Total:" + medicineName.size());
		System.out.println("------------------------------");
		System.out.println("Please select one of the mdicine names in the above list and check FEXT xml file");
		System.out.println("to see its <Atc V attribute value");
		System.out.println("If the Atc V attribute value match your select, then mapping is passed! ");
		System.out.println("------------------------------");
		System.out.println("Interaction validation will be done by comparing our solution interaction result");
		System.out.println("with the result of http://interaksjoner.no site");

	}
	
	

}
