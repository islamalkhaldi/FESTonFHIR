package no.uia.ehealth.FHIRInformationModel;
import no.uia.ehealth.workflow.*;
import no.uia.ehealth.workflow.KatLegemiddelMerkevare.OppfLegemiddelMerkevare;

import java.util.ArrayList;
import java.util.List;



public class MedicationFHIRInformation  extends LegemiddelMerkevare 
{
	
	    protected String legemiddelID; // in Legemiddelmerkevare.id
	    protected String legeMiddelVarenavn; //in Legemiddelmerkevare.varenavn, OppfLegemiddelMerkevare.legemiddelmerkevare.varenavn ( can be used as identifier in FHIR resource instance)
	    
	    // used together to identify  a medicine, for example  <Atc V="P01AB03" S="2.16.578.1.12.4.1.1.7180" DN="Ornidazol" />
	    protected String atcV ; //OppfLegemiddelMerkevare.legemiddelmerkevare.atc v attribute ( atc code for active substance)
	    protected String atcS ; //OppfLegemiddelMerkevare.legemiddelmerkevare.atc s attribute  ( no display on web app)
	    protected String atcDN ;//OppfLegemiddelMerkevare.legemiddelmerkevare.atc dn attribute  ( name of active substance)
	    
	    protected String legemiddelNavnFormStyrke; // in TypeLegemiddel get navnFormStyrke() method //OppfLegemiddelMerkevare.legemiddelmerkevare.NavnFormStyrke
	    protected String legemiddelProdusent;      // in Legemiddelmerkevare getProduktInfo() method // OppfLegemiddelMerkevare.legemiddelmerkevare.produktInfo.produsent
	    protected boolean legemiddelVarselTrekant; //in Legemiddelmerkevare getProduktInfo() method // OppfLegemiddelMerkevare.legemiddelmerkevare.produktInfo.varselTerkant true/false
	    
	    
	    
	    protected String legemiddelAdministrasjonsveiDN; //in TypeLegemiddel getAdminstreringLegeMiddel() method// OppfLegemiddelMerkevare.legemiddelmerkevare.Adminstrasjonvei dn attribute
	    protected String legemiddelEnhetsdoseringDN;   //in TypeLegemiddel getAdminstreringLegeMiddel() method //OppfLegemiddelMerkevare.legemiddelmerkevare.AdminstreringLAdminstreringLegeMiddel.Adminstrasjonvei.Enhetsdosering  dn attribute
	    protected String legemiddelKortDoseDN; // in TypeLegemiddel getAdminstreringLegeMiddel() method//OOppfLegemiddelMerkevare.legemiddelmerkevare.AdminstreringLegeMiddel.Adminstrasjonvei.Kortdose  dn attribute
	    
	    protected ActiveSubstanceFHIRInformation activeSubstanceFHIRInformation;
	    protected String legemiddelTypeSoknadV; // in medicine.getTypeSoknadSlv().getV(), if value == 1, then  isOverCounter false
	    
	    
	    
	    
	    
	    public String getLegemiddelTypeSoknadV() {
	    	if(legemiddelTypeSoknadV == null)
	    		{
	    		this.legemiddelTypeSoknadV = legemiddelTypeSoknadV;
	    		}
			return legemiddelTypeSoknadV;
		}

		public void setLegemiddelTypeSoknadV(String legemiddelTypeSoknadV) {
			this.legemiddelTypeSoknadV = legemiddelTypeSoknadV;
		}

		public String getLegemiddelID() 
	    {
	    	if(legemiddelID == null)
	    	{
	    		legemiddelID = new String();
	    	}
	    	return legemiddelID;
	    }
	    
	    public void setLegemiddelID(String value) // legemiddelMerkevare.id
	    {	        
	    	this.legemiddelID = value;
	    }
	    
	    
	    public String getLegemiddelVarenavn() 
	    {
	    	if(legeMiddelVarenavn == null)
	    	{
	    		legeMiddelVarenavn = new String();
	    	}
	    	return legeMiddelVarenavn;
	    }
	    
	    public void setLegemiddelVarenavn(String value) //legemiddelMerkevare.varenavn
	    {
	        this.legeMiddelVarenavn = value;
	    }
	    
	    
	    public String getATCV() 
	    {
	    	if( atcV == null)
	    	{
	    		atcV = new String();
	    	}
	    	return atcV;
	    }
	    
	    public void setatcV(String value)  // legemiddelMerkevare.atc.getV();
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
	    
	    public void setatcS(String value) // legemiddelMerkevare.atc.getS();
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
	    
	    public void setatcDN(String value) // legemiddelMerkevare.atc.getDN();
	    {
	        this.atcDN = value;
	    }
	    
	    public String getLegemiddelNavnFormStyrke() 
	    {
	    	if(legemiddelNavnFormStyrke == null)
	    	{
	    		legemiddelNavnFormStyrke = new String();
	    	}
	    	return legemiddelNavnFormStyrke;
	    }
	    
	    public void setLegemiddelNavnFormStyrke(String value) // legemiddelMerkevare.navnFormStyrke
	    {
	    	this.legemiddelNavnFormStyrke = value;
	    	
	    }
	    
	    public String getLegemiddelProdusent() 
	    {
	    	if(legemiddelProdusent == null)
	    	{
	    		legemiddelProdusent = new String();
	    	}
	    	return legemiddelProdusent;
	    }
	    
	    public void setLegemiddelProdusent(String value) // legemiddelMerkevare.produktInfo.getProdusent()
	    {
	    	this.legemiddelProdusent = value;
	    		    	
	    }
	    
	    
	    public Boolean getLegemiddelVarselTrekant() 
	    {
	    	
	    	return legemiddelVarselTrekant;
	    }
	    
	    public void setLegemiddelVarselTrekant(Boolean value) // legemiddelMerkevare.produktInfo.getVarseltrekant()
	    {
	    	this.legemiddelVarselTrekant = value;
	    		    		    	
	    }
	    
	    public String getLegemiddelAdministrasjonsveiDN() 
	    {
	    	if(legemiddelAdministrasjonsveiDN == null)
	    	{
	    		legemiddelAdministrasjonsveiDN = new String();
	    	}
	    	return legemiddelAdministrasjonsveiDN;
	    }
	    
	    public void setLegemiddelAdministrasjonsveiDN(String value) // legemiddelMerkevare.getAdministreringLegemiddel().getAdministrasjonsvei().get(0).getDN()  or legemiddelMerkevare.administreringLegemiddel.getAdministrasjonsvei().get(0).getDN()
	    {
	    	this.legemiddelAdministrasjonsveiDN = value;
	    	    	
	    }
	    
	    
	    public String getLegemiddelEnhetsdoseringDN() 
	    {
	    	if(legemiddelEnhetsdoseringDN == null)
	    	{
	    		legemiddelEnhetsdoseringDN = new String();
	    	}
	    	return legemiddelEnhetsdoseringDN;
	    }
	    
	    public void setLegemiddelEnhetsdoseringDN(String value) // legemiddelMerkevare.getAdministreringLegemiddel().getEnhetDosering().get(0).getDN()  or legemiddelMerkevare.administreringLegemiddel.getEnhetDosering().get(0).getDN()
	    {
	    	this.legemiddelEnhetsdoseringDN = value;
	     }
	    
	    public String getLegemiddelKortDoseDN() 
	    {
	    	if(legemiddelKortDoseDN == null)
	    	{
	    		legemiddelKortDoseDN = new String();
	    	}
	    	return legemiddelKortDoseDN;
	    }
	    
	    public void setLlegemiddelKortDoseDN(String value) //  legemiddelMerkevare.administreringLegemiddel.getKortdose().get(0).getDN()
	    {
	    	this.legemiddelKortDoseDN = value;
	    	
	    		    	
	    		    	    	    	
	    }

		public ActiveSubstanceFHIRInformation getActiveSubstanceFHIRInformation() {
			if(activeSubstanceFHIRInformation == null)
	    	{
				activeSubstanceFHIRInformation = new ActiveSubstanceFHIRInformation("","","");
	    	}
			return activeSubstanceFHIRInformation;
		}

		public void setActiveSubstanceFHIRInformation(ActiveSubstanceFHIRInformation activeSubstanceFHIRInformation) {
			this.activeSubstanceFHIRInformation = activeSubstanceFHIRInformation;
		}
	    
	
	
	

		
		
		 	    
	    	    
}
