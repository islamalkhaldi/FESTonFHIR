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
	 * Group resource type.
	 */
	@ResourceDef(name="Group", profile="http://ehealth.uia.no/StructureDefinition/FESTGroup")
	public class FESTGroupResource extends Group 
	{
	 
	   private static final long serialVersionUID = 1L;
	 
	// FESTGroup reference store information about a group of medicines which are part of drug-drug interaction
	// with another group.
	// The point is, to represent an interaction, two FESTGroup instances must have the same interaction id
	// The structure of the reference reflects the structure of interaction catalogue in FEST M30 2.5.1
	// Interaction information stored along with a group of this interaction
	
	// FESTGroup have the following elements which represents data elements from FEST
	// Group.type : Medication
	// Group.actual: true which means the group refers to to a specific group of real individuals/instances.
	
	   
	//interactionID
	//Extensions start
	// Group.extension:interactionID
	   @Child(name="interactionID") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/interactionID", definedLocally=true, isModifier=false)
	   @Description(shortDefinition="The given interaction ID  in FEST M30 2.5.1")
	   private StringType interactionID;
		   
	 //interactionRelevansV
	
	// Group.extension:interactionRelevansV
	   @Child(name="interactionRelevansV") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/interactionRelevansV", definedLocally=true, isModifier=false)
	   @Description(shortDefinition="The severity level of the interaction")
	   private StringType interactionRelevansV;
	   
	 //interactionRelevansDN

	// Group.extension:interactionRelevansDN
	   @Child(name="interactionRelevansDN") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/interactionRelevansDN", definedLocally=true, isModifier=false)
	   @Description(shortDefinition="Severity short description of the interaction")
	   private StringType interactionRelevansDN;
	   
	 //interactionKliniskKonsekvens
	
	// Group.extension:interactionKliniskKonsekvens
	   @Child(name="interactionKliniskKonsekvens") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/interactionKliniskKonsekvens", definedLocally=true, isModifier=false)
	   @Description(shortDefinition="Interaction clinical consequences.")
	   private StringType interactionKliniskKonsekvens;
	   
	 //interactionID
	
	// Group.extension:interactionHandtering
	   @Child(name="interactionHandtering") 
	   @Extension(url="http://ehealth.uia.no/StructureDefinition/interactionHandtering", definedLocally=true, isModifier=false)
	   @Description(shortDefinition="Interaction guidance")
	   private StringType interactionHandtering;
						   
	   
	 //Extensions end
	   
	

	    
	  

		/**
	     * adding isEmpty() check for  newly added extensions.
	     */
	    @Override
	    public boolean isEmpty() {
	        return super.isEmpty() && ElementUtil.isEmpty(interactionID,interactionRelevansV,interactionRelevansDN,interactionKliniskKonsekvens,interactionHandtering);
	    }


	  
	    
		public StringType getInteractionID() {
			if(interactionID == null)
			{
				
			}
			return interactionID;
		}


		public void setInteractionID(StringType interactionID) {
			this.interactionID = interactionID;
		}


		public StringType getInteractionRelevansV() {
			if(interactionRelevansV == null)
			{
				
			}
			return interactionRelevansV;
		}


		public void setInteractionRelevansV(StringType interactionRelevansV) {
			this.interactionRelevansV = interactionRelevansV;
		}


		public StringType getInteractionRelevansDN() {
			if(interactionRelevansDN == null)
			{
				
			}
			return interactionRelevansDN;
		}


		public void setInteractionRelevansDN(StringType interactionRelevansDN) {
			this.interactionRelevansDN = interactionRelevansDN;
		}


		public StringType getInteractionKliniskKonsekvens() {
			if(interactionKliniskKonsekvens == null)
			{
				
			}
			return interactionKliniskKonsekvens;
		}


		public void setInteractionKliniskKonsekvens(StringType interactionKliniskKonsekvens) {
			this.interactionKliniskKonsekvens = interactionKliniskKonsekvens;
		}


		public StringType getInteractionHandtering() {
			if(interactionHandtering == null)
			{
				
			}
			return interactionHandtering;
		}


		public void setInteractionHandtering(StringType interactionHandtering) {
			this.interactionHandtering = interactionHandtering;
		}
	     
	   
	

}

