package ss13.uebungen.uebung2;


/**
 * @param args
 * @author Melina
 */

public class Student extends Angehoeriger
{
	public int matrNr;
	public int semester;
	
	public Student(String name,int neuMatrNr, int neuSemester)
	{
		super(name);
		matrNr=neuMatrNr;
		semester=neuSemester;
	}
	
	
	public int getMatrNr() 
	{
		return matrNr;
	}



	public void setMatrNr(int matrNr) 
	{
		this.matrNr = matrNr;
	}



	public int getSemester() 
	{
		return semester;
	}



	public void setSemester(int semester) 
	{
		this.semester = semester;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
