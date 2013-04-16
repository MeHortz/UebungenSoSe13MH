package ss13.uebungen.uebung2;


/**
 * @param args
 * @author Melina
 */

public class Assistent extends Angehoeriger
{
	public int persNr;
	public String fachgebiet;
	public Professor chef;
	
	public Assistent(String name, int neuPersNr, String neuFachgebiet, Professor neuChef)
	{
		super(name);
		persNr=neuPersNr;
		fachgebiet=neuFachgebiet;
		chef=neuChef;
	}
	
	
	public int getPersNr() 
	{
		return persNr;
	}


	public void setPersNr(int persNr) 
	{
		this.persNr = persNr;
	}


	public String getFachgebiet() 
	{
		return fachgebiet;
	}


	public void setFachgebiet(String fachgebiet) 
	{
		this.fachgebiet = fachgebiet;
	}


	public Professor getChef() 
	{
		return chef;
	}


	public void setChef(Professor chef) 
	{
		this.chef = chef;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
