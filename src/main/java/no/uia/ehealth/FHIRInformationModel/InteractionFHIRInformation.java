package no.uia.ehealth.FHIRInformationModel;
import no.uia.ehealth.workflow.*;

import java.util.ArrayList;
import java.util.List;

public class InteractionFHIRInformation extends Interaksjon 
{
      protected String interactionFHIRID;
      protected String interactionFHIRRelevansV;
      protected String interactionFHIRRelevansDN;
      protected String interactionFHIRKliniskKonsekvens;
      protected String interactionFHIRHandtering;
      protected List<SubstanceGroupFHIRInformation> interactionFHIRSubstanceGroupList;
      
       public String getInteractionFHIRID() 
	    {
    	   if(interactionFHIRID == null)
	       	{
    		   interactionFHIRID = new String();
	       	}
	    	return interactionFHIRID;
	    }
	    
	    public void setInteractionFHIRID(String value) // this.id
	    {	        
	    	this.interactionFHIRID = value;
	    }
	    
	    public String getInteractionFHIRRelevansV() 
	    {
	    	if(interactionFHIRRelevansV == null)
	       	{
	    		interactionFHIRRelevansV = new String();
	       	}
	    	return interactionFHIRRelevansV;
	    }
	    
	    public void setIinteractionFHIRRelevansV(String value) // this.relevans.getV()
	    {	        
	    	this.interactionFHIRRelevansV = value;
	    }
	    
	    
	    public String getInteractionFHIRRelevansDN() 
	    {
	    	if(interactionFHIRRelevansDN == null)
	       	{
	    		interactionFHIRRelevansDN = new String();
	       	}
	    	return interactionFHIRRelevansDN;
	    }
	    
	    public void setInteractionFHIRRelevansDN(String value) // this.relevans.getDN()
	    {	        
	    	this.interactionFHIRRelevansDN = value;
	    	
	    }
	    
	    public String getInteractionFHIRKliniskKonsekvens() 
	    {
	    	if(interactionFHIRKliniskKonsekvens == null)
	       	{
	    		interactionFHIRKliniskKonsekvens = new String();
	       	}
	    	return interactionFHIRKliniskKonsekvens;
	    }
	    
	    public void setInteractionFHIRKliniskKonsekvens(String value) // this.kliniskKonsekvens
	    {	        
	    	this.interactionFHIRKliniskKonsekvens = value;
	    	
	    	
	    }


	    public String getInteractionFHIRHandtering() 
	    {
	    	if(interactionFHIRHandtering == null)
	       	{
	    		interactionFHIRHandtering = new String();
	       	}
	    	return interactionFHIRHandtering;
	    }
	    
	    public void setInteractionFHIRHandtering(String value) // this.handtering
	    {	        
	    	this.interactionFHIRHandtering = value;
	    	
	    	
	    }
	    
	  
	    
	    public List<SubstanceGroupFHIRInformation> getSubstanceGroupFHIRInformation()
	    {
	        if (interactionFHIRSubstanceGroupList == null) {
	        	interactionFHIRSubstanceGroupList = new ArrayList<SubstanceGroupFHIRInformation>();
	        }
	        return this.interactionFHIRSubstanceGroupList;
	    }

	    public void setSubstanceGroupFHIRInformation(List<SubstanceGroupFHIRInformation> list) //this.substansgruppe
	    {
	       
	         this.interactionFHIRSubstanceGroupList = list;
	         
	    }
	    


}
