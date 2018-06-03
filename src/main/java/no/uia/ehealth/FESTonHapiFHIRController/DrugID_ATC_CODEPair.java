package no.uia.ehealth.FESTonHapiFHIRController;

public class DrugID_ATC_CODEPair {
	
		private String dRUG_ID;
		private String dRUG_ATC_CODE;
	 
	    
	 
	    public DrugID_ATC_CODEPair(String dRUG_ID,String dRUG_ATC_CODE)
	    {
	    	this.dRUG_ID = dRUG_ID;
	    	this.dRUG_ATC_CODE = dRUG_ATC_CODE;
	    	
	    }

	    public String getDRUG_ID() {
	    	if(dRUG_ID == null)
	    	{
	    		dRUG_ID = new String();
	    	}
			return dRUG_ID;
		}

		public void setDRUG_ID(String dRUG_ID) {
			this.dRUG_ID = dRUG_ID;
		}
		
		public String getDRUG_ATC_CODE() {
			if(dRUG_ATC_CODE == null)
	    	{
				dRUG_ATC_CODE = new String();
	    	}
			return dRUG_ATC_CODE;
		}
		

		public void setDRUG_ATC_CODE(String dRUG_ATC_CODE) {
			this.dRUG_ATC_CODE = dRUG_ATC_CODE;
		}

		

}
