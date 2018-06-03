package no.uia.ehealth.FESTonHapiFHIRController;

public class InteractionDetails 
{
	protected String id;
	protected String relevansV;
	protected String relevansDN;
	protected String kliniskKonsekvens;
	protected String handtering;
	
	public InteractionDetails(String id, String relevansV, String relevansDN,String kliniskKonsekvens, String handtering )
	{
		this.id = id;
		this.relevansV = relevansV;
		this.relevansDN = relevansDN;
		this.kliniskKonsekvens = kliniskKonsekvens;
		this.handtering = handtering;
	}

	public String getId() {
		if(id == null)
		{
			this.id = new String();
		}
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRelevansV() {
		if(relevansV == null)
		{
			this.relevansV = new String();
		}
		return relevansV;
	}

	public void setRelevansV(String relevansV) {
		this.relevansV = relevansV;
	}

	public String getRelevansDN() {
		if(relevansDN == null)
		{
			this.relevansDN = new String();
		}
		return relevansDN;
	}

	public void setRelevansDN(String relevansDN) {
		this.relevansDN = relevansDN;
	}

	public String getKliniskKonsekvens() {
		if(kliniskKonsekvens == null)
		{
			this.kliniskKonsekvens = new String();
		}
		
		return kliniskKonsekvens;
	}

	public void setKliniskKonsekvens(String kliniskKonsekvens) {
		this.kliniskKonsekvens = kliniskKonsekvens;
	}

	public String getHandtering() {
		if(handtering == null)
		{
			this.handtering = new String();
		}
		return handtering;
	}

	public void setHandtering(String handtering) {
		this.handtering = handtering;
	}
	
	
	
}
