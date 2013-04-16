package ss13.uebungen.uebung2;


/**
 * @param args
 * @author Melina Hortz
 */

public class Professor extends Angehoeriger 
{
	
	public int persNr;
	public String rang;
	public int raum;
	
	public Professor(String name,int neuPersNr,String neuRang,int neuRaum) 
	{
		super(name);
		
		persNr=neuPersNr;
		rang=neuRang;
		raum=neuRaum;		
	}

	
	public int getPersNr() 
	{
		return persNr;
	}

	
	public void setPersNr(int persNr) 
	{
		this.persNr = persNr;
	}

	
	public String getRang() 
	{
		return rang;
	}


	public void setRang(String rang) 
	{
		this.rang = rang;
	}



	public int getRaum() 
	{
		return raum;
	}



	public void setRaum(int raum) 
	{
		this.raum = raum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
