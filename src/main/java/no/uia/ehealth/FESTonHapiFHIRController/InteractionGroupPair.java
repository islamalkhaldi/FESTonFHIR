package no.uia.ehealth.FESTonHapiFHIRController;

public class InteractionGroupPair 
{
	private String interaction_ID;
	private String group_ID;
 
    
 
    public InteractionGroupPair(String interaction_ID,String group_ID)
    {
    	this.interaction_ID = interaction_ID;
    	this.group_ID = group_ID;
    	
    }



	public String getInteraction_ID() {
		if(interaction_ID == null)
		{
			interaction_ID = new String();
		}
		return interaction_ID;
	}



	public void setInteraction_ID(String interaction_ID) {
		this.interaction_ID = interaction_ID;
	}



	public String getGroup_ID() {
		if(group_ID == null)
		{
			group_ID = new String();
		}
		return group_ID;
	}



	public void setGroup_ID(String group_ID) {
		this.group_ID = group_ID;
	}


}
