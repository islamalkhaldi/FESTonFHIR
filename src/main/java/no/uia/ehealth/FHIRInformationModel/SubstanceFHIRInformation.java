package no.uia.ehealth.FHIRInformationModel;
import no.uia.ehealth.workflow.*;
import java.util.List;


public class SubstanceFHIRInformation extends Substansgruppe.Substans
{
	protected String substansNavn; 
	protected String atcV ; 
	protected String atcS ; 
	protected String atcDN ;
		    
   public String getSubstansNavn() 
    {
    	if(substansNavn == null)
    	{
    		substansNavn = new String();
    	}
	   return substansNavn;
    }
    
    public void setSubstansNavn(String value) //this.substans
    {
        this.substansNavn = value;
        
    }
	
    public String getatcV() 
    {
    	if(atcV == null)
    	{
    		atcV = new String();
    	}
    	return atcV;
    	
    }
    
    public void setatcV(String value)  // this.atc.getV();
    {
        this.atcV = value;
    }
    
    public String getatcS() {
    	if(atcS == null)
    	{
    		atcS = new String();
    	}
    	return atcS;
    }
    
    public void setatcS(String value) // this.atc.getS();
    {
       this.atcS = value;
    }
    
    
    public String getatcDN() 
    {
    	if(atcDN == null)
    	{
    		atcDN = new String();
    	}
    	return atcDN;
    }
    
    public void setatcDN(String value) // this.atc.getDN();
    {
        this.atcDN = value;
    }
    


}
