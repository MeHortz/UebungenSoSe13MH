package ss13.uebungen.uebung2;

/**
 * @param args
 * @author Melina
 */

public class Vorlesungen
{
	public int vorlNr;
	public String titel;
	public int sws;
	public Professor gelesenVon;
	
	public Vorlesungen(int neuVorlNr, String neuTitel, int neuSws, Professor neuGelesenVon)
	{
		vorlNr=neuVorlNr;
		titel=neuTitel;
		sws=neuSws;
		gelesenVon=neuGelesenVon;
	}

	
	public int getVorlNr() 
	{
		return vorlNr;
	}



	public void setVorlNr(int vorlNr) 
	{
		this.vorlNr = vorlNr;
	}



	public String getTitel() 
	{
		return titel;
	}



	public void setTitel(String titel) 
	{
		this.titel = titel;
	}



	public int getSws() 
	{
		return sws;
	}



	public void setSws(int sws) 
	{
		this.sws = sws;
	}



	public Professor getGelesenVon() 
	{
		return gelesenVon;
	}



	public void setGelesenVon(Professor gelesenVon) 
	{
		this.gelesenVon = gelesenVon;
	}

	
	public int gelesenVon()
	{
		return gelesenVon.getPersNr();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
