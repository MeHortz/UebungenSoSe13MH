package ss13.uebungen.uebung2;

/**
 * @param args
 * @author Melina Hortz
 */

public class Angehoeriger 
{
	public String name;
	

	public Angehoeriger(String neuerName)
	{
		name=neuerName;
	}
	
	public String namensrueckgabe()
	{
		return name;
	}
	
	public String nameAendern(String neuerName)
	{
		name=neuerName;
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
