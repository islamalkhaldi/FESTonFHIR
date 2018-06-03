package no.uia.ehealth.FESTonHapiFHIRResources;

import org.hl7.fhir.dstu3.model.*;
import java.util.ArrayList;
import java.util.List;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;
import japa.parser.ast.type.ReferenceType;


	/**
	 * Definition class for adding extensions to the built-in
	 * Substance resource type.
	 */
	@ResourceDef(name="Substance", profile="http://ehealth.uia.no/StructureDefinition/FESTSubstance")
	public class FESTSubstanceResource extends Substance 
	{
	 
	   private static final long serialVersionUID = 1L;
	 
	// FESTSubstanceResource stores the following values about virkestoff
	// 1. virkestoff id  Substance.code.coding.display   Substance.code.coding.userSelected true
	// 2. navn  Substance.identifier.value
	// 3. engelskNavn    slice extension on Substance.code.text
	 
	
	
	//Slicing start
	 
	   @Child(name="engelskNavn") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/engelskNavn", definedLocally=false, isModifier=false)
	   @Description(shortDefinition="The english name of the active substance in FEST M30 2.5.1")
	   private StringType engelskNavn;
	   
   
	 //Slicing end
	   
	

	    
	  

		/**
	     * adding isEmpty() check for  newly added extensions.
	     */
	    @Override
	    public boolean isEmpty() {
	        return super.isEmpty() && ElementUtil.isEmpty(engelskNavn);
	    }
	     
	    public StringType getEngelskNavn() 
	    {
	    	if(engelskNavn == null)
	    	{
	    		engelskNavn = new StringType();
	    	}
			return engelskNavn;
		}


		public void setEngelskNavn(StringType engelskNavn) {
			this.engelskNavn = engelskNavn;
		}


	/*
	 * Code to create instances of FESTSubstanceResource in FESTMedicatonHapiFHIRController
	 * 
	 */
		//*************************START********************************************************
		/*
		 * Here we first create a FESTSubstanceResource instance
		 */
		
				// TODO
				// fix implementation problem of itemReference in FESTMedicationReference to active substance.
				//Start of create a FESTSubstanceResource instance
				// 1. navn  Substance.identifier.value
				// 2. virkestoff id  Substance.code.coding.display   Substance.code.coding.userSelected true
				// 3. engelskNavn    slice extension on Substance.code.text
			/*	FESTSubstanceResource fESTSubstanceResource = new FESTSubstanceResource();
			
				String activeSubstansNavn = m.getActiveSubstanceFHIRInformation().getActiveSubstansNavn();
				fESTSubstanceResource.addIdentifier().setSystem("http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01").setValue(activeSubstansNavn);
				
				String virkestoffID = m.getActiveSubstanceFHIRInformation().getActiveSubstanceID();
				fESTSubstanceResource.getCode().addCoding().setSystem("Internal ID from FEST M30").setCode(virkestoffID).setDisplay("Virkestoff ID");
				
				
				String eName = m.getActiveSubstanceFHIRInformation().getActiveSubstansEngelskNavn();
				fESTSubstanceResource.setEngelskNavn(new StringType(eName));*/
				
				
				//End of create a FESTSubstanceResource instance
				
		/*
		 * Here we Send the FESTSubstanceResource instance to hapi-fhir server
		 */
				//client.create().resource(fESTSubstanceResource).execute();
				
				/*FESTSubstanceResource t = client.read().resource(FESTSubstanceResource.class).withId("10").execute();
				System.out.println(t.getIdentifier().get(0).getValue());*/ 
		        /*
		         * connect medication to a substance
		         * 
		         */
		       
		        //fESTMedicationResource.setItemReference(fESTSubstanceResource);
		       /* MedicationIngredientComponent mc = new MedicationIngredientComponent();
		        fESTMedicationResource.addIngredient(mc);
		        mc.setId(fESTSubstanceResource.getId());*/
		    
		//*************************END********************************************************

}

