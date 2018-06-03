package no.uia.ehealth.MappingFESTXmlModelToJavaModel;

import java.util.ArrayList;
import java.util.List;

import no.uia.ehealth.FHIRInformationModel.ActiveSubstanceFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.MedicationFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceGroupFHIRInformation;
import no.uia.ehealth.workflow.*;

import no.uia.ehealth.workflow.KatLegemiddelMerkevare.OppfLegemiddelMerkevare;

public class LegemiddelMerkevareCatalogueMapper 
{
	

	protected List<ActiveSubstanceFHIRInformation> virkestoffListFHIR = new ArrayList<ActiveSubstanceFHIRInformation>(); 
	
	protected List<MedicationFHIRInformation> medicationFHIRInformationList = new ArrayList<MedicationFHIRInformation>();
	public LegemiddelMerkevareCatalogueMapper (FEST fest)
	{
		List<OppfLegemiddelMerkevare> oppfLegemiddelMerkevareList = new ArrayList<OppfLegemiddelMerkevare>();
		oppfLegemiddelMerkevareList = fest.getKatLegemiddelMerkevare().getOppfLegemiddelMerkevare();
		for ( OppfLegemiddelMerkevare element : oppfLegemiddelMerkevareList) 
		{
		    LegemiddelMerkevare medicine = element.getLegemiddelMerkevare();
		   
		    MedicationFHIRInformation medicationFHIR = new MedicationFHIRInformation();
		    //gathering required FHIR information for each medicine in FEST
		    if(medicine.getId() != null && !medicine.getId().isEmpty())
		    	medicationFHIR.setLegemiddelID(medicine.getId());
		    if(medicine.getVarenavn() != null && !medicine.getVarenavn().isEmpty())	
		    	medicationFHIR.setLegemiddelVarenavn(medicine.getVarenavn());
		    if(medicine.getAtc() != null)
		    {
				if(medicine.getAtc().getV() != null && !medicine.getAtc().getV().isEmpty())		
					medicationFHIR.setatcV(medicine.getAtc().getV());
				if(medicine.getAtc().getS() != null && !medicine.getAtc().getS().isEmpty())		
					medicationFHIR.setatcS(medicine.getAtc().getS());
				if(medicine.getAtc().getDN() != null && !medicine.getAtc().getDN().isEmpty())		
					medicationFHIR.setatcDN(medicine.getAtc().getDN());
		    }
			
		    if(medicine.getTypeSoknadSlv() != null)
		    {
		    	if(medicine.getTypeSoknadSlv().getV() != null && !medicine.getTypeSoknadSlv().getV().isEmpty())		
					medicationFHIR.setLegemiddelTypeSoknadV(medicine.getTypeSoknadSlv().getV());
		    }
		    
		    if(medicine.getNavnFormStyrke() != null && !medicine.getNavnFormStyrke().isEmpty())		
		    	medicationFHIR.setLegemiddelNavnFormStyrke(medicine.getNavnFormStyrke());
		    if(medicine.getProduktInfo() != null)
		    {
		    	 if(medicine.getProduktInfo().getProdusent() != null && !medicine.getProduktInfo().getProdusent().isEmpty())		
		    		 medicationFHIR.setLegemiddelProdusent(medicine.getProduktInfo().getProdusent());
				 if(medicine.getProduktInfo().getVarseltrekant() != null)		
					 medicationFHIR.setLegemiddelVarselTrekant(medicine.getProduktInfo().getVarseltrekant());
		    }
		   
		    if(medicine.getAdministreringLegemiddel() != null)
		    {
		    	 if( medicine.getAdministreringLegemiddel().getAdministrasjonsvei().size()!= 0 && !medicine.getAdministreringLegemiddel().getAdministrasjonsvei().get(0).getDN().isEmpty())		
				    medicationFHIR.setLegemiddelAdministrasjonsveiDN(medicine.getAdministreringLegemiddel().getAdministrasjonsvei().get(0).getDN());
				 if(medicine.getAdministreringLegemiddel().getEnhetDosering().size() != 0 && !medicine.getAdministreringLegemiddel().getEnhetDosering().get(0).getDN().isEmpty())		
				    medicationFHIR.setLegemiddelEnhetsdoseringDN(medicine.getAdministreringLegemiddel().getEnhetDosering().get(0).getDN());
				 if( medicine.getAdministreringLegemiddel().getKortdose().size() != 0 && !medicine.getAdministreringLegemiddel().getKortdose().get(0).getDN().isEmpty())		
				    medicationFHIR.setLlegemiddelKortDoseDN(medicine.getAdministreringLegemiddel().getKortdose().get(0).getDN());
				    
		    }
		    
		    
		    
		    //logic to get the related active substances of this medicine.
			
		    if((medicine.getSortertVirkestoffMedStyrke() != null)&&(!medicine.getSortertVirkestoffMedStyrke().isEmpty()))
		    {
		    			    	 
		    	 VirkestoffMedStyrke e =  (VirkestoffMedStyrke)medicine.getSortertVirkestoffMedStyrke().get(0).getRefVirkestoffMedStyrke();
		    	 Virkestoff v = (Virkestoff)e.getRefVirkestoff();
		    	 String id = v.getId();
		    	 String navn = v.getNavn();
		    	 String navnEngelsk = v.getNavnEngelsk();
		    	 ActiveSubstanceFHIRInformation n = new ActiveSubstanceFHIRInformation(id,navn,navnEngelsk);
		    	 medicationFHIR.setActiveSubstanceFHIRInformation(n);
		    }
		
		   		
		
		    medicationFHIRInformationList.add(medicationFHIR);
		    
		}
	 
	 
	}
	
	
	
	
	public List<MedicationFHIRInformation> getMedicationFHIRInformationList() 
	    {
	    	return medicationFHIRInformationList;
	    }
	 
	
	 
}
