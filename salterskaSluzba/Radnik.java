package salterskaSluzba;

public abstract class Radnik extends Osoba {
	
	Klijent k;
	

	public String toString() {
		if (this.k!=null) return oznakaOsobe+" ["+k+"]";
		else return null;
		
	}

}
