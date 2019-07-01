package salterskaSluzba;

public class Klijent extends Osoba {
	
	protected char oznakaUsluge;
	protected Klijent clanListe;
	
	public Klijent () {
		personalID=++globalID;
		oznakaOsobe='K';
		double d=Math.random();
		while (d==1) d=Math.random();
		if(d*10<=3.3)oznakaUsluge='a';
		if(d*10>3.3&&d*10<=6.6)oznakaUsluge='b';
		if(d*10>6.6&&d*10<=9.9)oznakaUsluge='c';
	}

	public char getOznakaUsluge() {
		return oznakaUsluge;
	}

	
	public String toString() {
		return super.toString()+"Klijent [oznakaUsluge=" + oznakaUsluge + "]";
	}
	
	

}
