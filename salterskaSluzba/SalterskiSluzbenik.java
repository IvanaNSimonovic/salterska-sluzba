package salterskaSluzba;

public class SalterskiSluzbenik extends Radnik {
	
	private char oznakaOsobe='S';
	
	public boolean obradiKlijenta(Lista salter) {
		if(salter.dohvatiKlijenta(0)!=null) {
		this.k= salter.dohvatiKlijenta(0);
		salter.obrisiKlijenta(0);
		System.out.println(this.toString());
		return true;
		}
		else return false;
	}

}
