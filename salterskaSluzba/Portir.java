package salterskaSluzba;

public class Portir extends Radnik {
	
	private char oznakaOsobe='P';
	
	public boolean smestiKlijenta (Lista l) {
		Klijent k=new Klijent();
		l.dodaj(k);
		this.k=k;
		System.out.println(this.toString());
		return true;
	}

}
