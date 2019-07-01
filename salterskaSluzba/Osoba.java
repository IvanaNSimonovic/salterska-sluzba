package salterskaSluzba;

public abstract class Osoba {
	
	protected static int globalID=0;
	protected int personalID;
	protected char oznakaOsobe;
	
	
	public char getOznakaOsobe() {
		return oznakaOsobe;
	}


	public String toString() {
		return "Osoba [personalID=" + personalID + ", oznakaOsobe=" + oznakaOsobe + "]";
	}
	
	

}
