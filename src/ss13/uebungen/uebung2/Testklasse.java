package ss13.uebungen.uebung2;

/**
 * @param args
 * @author Melina Hortz
 */


public class Testklasse 
{
		
	
	public static void main(String[] args) 
	{
		Professor Sokrates=new Professor("Sokrates", 2125, "C4", 226);
		Professor Russel=new Professor("Russel", 2126, "C4", 232);
		Professor Kopernikus=new Professor("Kopernikus", 2127, "C3", 310);
		Professor Popper=new Professor("Popper", 2133, "C3", 52);
		Professor Augustinus=new Professor("Augustinus", 2134, "C3", 309);
		Professor Curie=new Professor("Curie", 2136, "C4", 36);
		Professor Kant=new Professor("Kant", 2137, "C4", 7);
		
		Student Xenokrates=new Student("Xenokrates", 24002, 18);
		Student Jonas=new Student("Jonas", 25403, 12);
		Student Fichte=new Student("Fichte", 26120, 10);
		Student Aristoxenos=new Student("Aristoxenos", 26830, 8);
		Student Schopenhauer=new Student("Schopenhauer", 27550, 6);
		Student Carnap=new Student("Carnap", 28106, 30);
		Student Theophrastos=new Student("Theophrastos", 29120, 2);
		Student Feuerbach=new Student("Feuerbach", 2955, 2);
		
		Vorlesungen Grundzüge=new Vorlesungen(5001, "Grundzüge", 4, Kant);
		Vorlesungen Ethik=new Vorlesungen(5041, "Ethik", 4, Sokrates);
		Vorlesungen Erkenntnistheorie=new Vorlesungen(5043, "Erkenntnistheorie", 3, Russel);
		Vorlesungen Mäeutik=new Vorlesungen(5049, "Mäeutik", 2, Sokrates);
		Vorlesungen Logik=new Vorlesungen(4052, "Logik", 4, Sokrates);
		Vorlesungen Wissenschaftstheorie=new Vorlesungen(5052, "Wissenschaftstheorie", 3, Russel);
		Vorlesungen Bioethik=new Vorlesungen(5216, "Bioethik", 2, Russel);
		Vorlesungen DerWienerKreis=new Vorlesungen(5259, "Der Wiener Kreis", 2, Popper);
		Vorlesungen GlaubeUndWissen=new Vorlesungen(5022, "Glaube und Wissen", 2, Augustinus);
		Vorlesungen DieDreiKritiken=new Vorlesungen(4630, "Die 3 Kritiken", 4, Kant);
		
		Assistent Platon=new Assistent("Platon", 3002, "Ideenlehre", Sokrates);
		Assistent Aristoteles=new Assistent("Aristoteles", 3003, "Syllogistik", Sokrates);
		Assistent Wittgenstein=new Assistent("Wittgenstein", 3004, "Sprachtheorie", Russel);
		Assistent Rhetikus=new Assistent("Rhetikus", 3005, "Planetenbewegung", Kopernikus);
		Assistent Newton=new Assistent("Newton", 3006, "Keplersche Gesetze", Russel);
		Assistent Spinoza=new Assistent("Spinoza", 3007, "Gott und Natur", Russel);
	}

}
