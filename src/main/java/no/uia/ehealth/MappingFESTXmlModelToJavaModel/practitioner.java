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

import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.MedicationStatement;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.instance.model.api.IBaseBundle;

import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.method.SearchParameter;
import ca.uhn.fhir.rest.gclient.ReferenceClientParam;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.FESTonHapiFHIRController.*;

import no.uia.ehealth.workflow.*;

public class practitioner {
	
	
	/*private static FhirContext ctx = FhirContext.forDstu3();
	private static final String baseURL = "http://localhost:8081/fest/baseDstu3";
	// if the practitioner use active substance name, for example Ketokonazol
	IGenericClient clientATCDN = ctx.newRestfulGenericClient(baseURL);
	Bundle resultSubstanceName = clientATCDN.search().forResource(Medication.class)
			.where(new TokenClientParam("atcNavn").exactly().code("Ketokonazol")).returnBundle(Bundle.class).execute();*/
	
	
	
	
	
	/*private static FhirContext ctx = FhirContext.forDstu3();
	private static final String baseURL = "http://localhost:8081/fest/baseDstu3";
	clientMedication.create().resource(ms).execute();
	//ms.getMedicationReference().getDisplay();
	
	
	
	// if the practitioner use varenavn, for example Ketoconazole HRA
	IGenericClient clientVareNavn = ctx.newRestfulGenericClient(baseURL);
	Bundle resultVareNavn = clientVareNavn.search().forResource(Medication.class)
			.where(new TokenClientParam("legemiddelVarenavn").exactly().code("Ketoconazole HRA")).returnBundle(Bundle.class)
			.execute();
			
			
	
	// if the practitioner use ATC CODE, for example J02AB02
	Bundle resultATCV = clientATCV.search().forResource(Medication.class)
			.where(Medication.CODE.exactly().code("J02AB02")).returnBundle(org.hl7.fhir.dstu3.model.Bundle.class)
			.execute();
	
	
	
	/*
	private static FhirContext ctx = FhirContext.forDstu3();
	private static final String baseURL = "http://localhost:8081/fest/baseDstu3";
	// Assume the practitioner check for drug-drug interactin between a medication with ATC-code J02AB02
	// and another medication with varenavn "Esmya"
	CheckForInteraction interactionCheckup = new CheckForInteraction(ctx, "J02AB02", "Esmya", baseURL);
	
	
	
	// assume we know the id of the current patient is for example 19352
	IBaseBundle bundle = client.search().forResource(MedicationStatement.class)
			.where(new ReferenceClientParam("patient").hasId("19352"))
			.prettyPrint()
			.execute();
	
	// assume we know the id of the current patient is for example 19352	
		Patient patient = client.read().resource(Patient.class).withId(String.valueOf("19352")).execute();

		
		
	*/	
	
	
		

}
