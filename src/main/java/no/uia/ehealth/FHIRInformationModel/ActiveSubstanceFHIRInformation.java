package no.uia.ehealth.FHIRInformationModel;

import org.hl7.fhir.dstu3.model.StringType;

import no.uia.ehealth.workflow.*;;

public class ActiveSubstanceFHIRInformation extends Virkestoff 
{
	protected String activeSubstanceID;
	protected String activeSubstansNavn; 
	protected String activeSubstansEngelskNavn;
			    
    
	
	
	public String getActiveSubstansEngelskNavn() {
		if(activeSubstansEngelskNavn == null)
    	{
			activeSubstansEngelskNavn = new String();
    	}
		return activeSubstansEngelskNavn;
	}

	public void setActiveSubstansEngelskNavn(String activeSubstansEngelskNavn) {
		this.activeSubstansEngelskNavn = activeSubstansEngelskNavn;
	}

	public String getActiveSubstanceID() {
		if(activeSubstanceID == null)
    	{
			activeSubstanceID = new String();
    	}
		return activeSubstanceID;
	}

	public void setActiveSubstanceID(String activeSubstanceID) {
		this.activeSubstanceID = activeSubstanceID;
	}

	public String getActiveSubstansNavn() 
    {
		if(activeSubstansNavn == null)
    	{
			activeSubstansNavn = new String();
    	}
		return activeSubstansNavn;
    }
    
    public void setActiveSubstansNavn(String value) 
    {
        this.activeSubstansNavn = value;
        
    }
	
   public  ActiveSubstanceFHIRInformation(String id, String navn, String navnEngelsk)
   {
	  
	   this.activeSubstanceID = id;
	   this.activeSubstansNavn = navn;
	   this.activeSubstansEngelskNavn = navnEngelsk;
   }
    
}
