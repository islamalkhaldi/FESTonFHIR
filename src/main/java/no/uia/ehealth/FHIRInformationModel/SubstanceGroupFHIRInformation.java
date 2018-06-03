package no.uia.ehealth.FHIRInformationModel;
import no.uia.ehealth.workflow.*;

import java.util.ArrayList;
import java.util.List;
public class SubstanceGroupFHIRInformation extends Substansgruppe

{
	
	protected List<SubstanceFHIRInformation> interactionFHIRSubstanceList;
	
	 public List<SubstanceFHIRInformation> getSubstanceFHIRInformation()
	    {
	        if (interactionFHIRSubstanceList == null) {
	        	interactionFHIRSubstanceList = new ArrayList<SubstanceFHIRInformation>();
	        }
	        return this.interactionFHIRSubstanceList;
	    }

	    public void setSubstanceFHIRInformation(List<SubstanceFHIRInformation> list) //this.substans
	    {
	       
	         this.interactionFHIRSubstanceList = list;
	         
	         
	    }

}
