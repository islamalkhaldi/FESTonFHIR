package no.uia.ehealth.MappingFESTXmlModelToJavaModel;

import java.util.ArrayList;
import java.util.List;
import no.uia.ehealth.FHIRInformationModel.InteractionFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceFHIRInformation;
import no.uia.ehealth.FHIRInformationModel.SubstanceGroupFHIRInformation;
import no.uia.ehealth.workflow.*;
import no.uia.ehealth.workflow.KatInteraksjon.OppfInteraksjon;


public class InteraksjonCatalogueMapper 
{
	protected List<InteractionFHIRInformation> interactionFHIRInformationList = new ArrayList<InteractionFHIRInformation>();
	
	public InteraksjonCatalogueMapper (FEST fest)
	{
		List<OppfInteraksjon> oppfInteraksjonList = new ArrayList<OppfInteraksjon>();
		oppfInteraksjonList = fest.getKatInteraksjon().getOppfInteraksjon();
		for ( OppfInteraksjon element : oppfInteraksjonList) 
		{
			if(element != null)
			{
				
				if (element.getInteraksjon() != null)
				{
					Interaksjon interaction = element.getInteraksjon();
					InteractionFHIRInformation interactionFHIR = new InteractionFHIRInformation();
					
					//gathering  required FHIR information for each interaction in FEST
					if(interaction.getId() != null && !interaction.getId().isEmpty())
						interactionFHIR.setInteractionFHIRID(interaction.getId());
					if(interaction.getRelevans() != null)
					{
						if(interaction.getRelevans().getV() != null && !interaction.getRelevans().getV().isEmpty())
							interactionFHIR.setIinteractionFHIRRelevansV(interaction.getRelevans().getV());
						if(interaction.getRelevans().getDN() != null && !interaction.getRelevans().getDN().isEmpty())
							interactionFHIR.setInteractionFHIRRelevansDN(interaction.getRelevans().getDN());
						interactionFHIR.setInteractionFHIRRelevansDN(interaction.getRelevans().getDN());
					}
					
					if(interaction.getKliniskKonsekvens() != null && !interaction.getKliniskKonsekvens().isEmpty())
						interactionFHIR.setInteractionFHIRKliniskKonsekvens(interaction.getKliniskKonsekvens());
					if(interaction.getHandtering() != null && !interaction.getHandtering().isEmpty())
						interactionFHIR.setInteractionFHIRHandtering(interaction.getHandtering());
						
					// gathering required FHIR information for all substance groups in each interaction
					List<SubstanceGroupFHIRInformation> substanceGroupFHIRInformationList = new ArrayList<SubstanceGroupFHIRInformation>();
					
					List<Substansgruppe> interaksjonSubstansgruppeList = new ArrayList<Substansgruppe>();
					if(interaction.getSubstansgruppe() != null)
					{
						interaksjonSubstansgruppeList = interaction.getSubstansgruppe();
						for (Substansgruppe sg : interaksjonSubstansgruppeList )
							{
								// gathering required FHIR information for each substance group in the current interaction
								SubstanceGroupFHIRInformation substanceGroupFHIRInformation = new SubstanceGroupFHIRInformation();
								List<SubstanceFHIRInformation> substanceFHIRInformationList = new ArrayList<SubstanceFHIRInformation>();
								
								List<Substansgruppe.Substans> sgList = new ArrayList<Substansgruppe.Substans>();
								if(sg.getSubstans() != null)
								{
									sgList = sg.getSubstans();
									for (Substansgruppe.Substans s : sgList)
									{
										// gathering required FHIR information for each substance in the current group
										SubstanceFHIRInformation sFHIR = new SubstanceFHIRInformation();
										if(s.getSubstans() != null && !s.getSubstans().isEmpty())
											sFHIR.setSubstansNavn(s.getSubstans());
										if(s.getAtc() != null)
										{
											if(s.getAtc().getV() != null && !s.getAtc().getV().isEmpty())
												sFHIR.setatcV(s.getAtc().getV());
											if(s.getAtc().getS() != null && !s.getAtc().getS().isEmpty())
												sFHIR.setatcS(s.getAtc().getS());
											if(s.getAtc().getDN() != null && !s.getAtc().getDN().isEmpty())
												sFHIR.setatcDN(s.getAtc().getDN());
										}
										
										substanceFHIRInformationList.add(sFHIR); // add substance to its list 
									}
	
								}    	 
								substanceGroupFHIRInformation.setSubstanceFHIRInformation(substanceFHIRInformationList); //add list to its group
								substanceGroupFHIRInformationList.add(substanceGroupFHIRInformation); // add group to list of groups
							}
	
						interactionFHIR.setSubstanceGroupFHIRInformation(substanceGroupFHIRInformationList); // add groups list  to the interaction FHIR model
					}		
				   interactionFHIRInformationList.add(interactionFHIR); // add the current interaction to list of interactions of FHIR model
				}
				
			}
		}
		
	}
	
	public List<InteractionFHIRInformation> getInteractionFHIRInformationListt() 
    {
    	return interactionFHIRInformationList;
    }
}
