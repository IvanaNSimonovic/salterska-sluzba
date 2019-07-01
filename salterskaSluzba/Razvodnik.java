package salterskaSluzba;

public class Razvodnik extends Radnik {
	
	private char oznakaOsobe='R';
	
	public boolean staviURed(Lista ulaznaLista, int i, Lista salter1, Lista salter2, Lista salter3) {
		Klijent k=ulaznaLista.dohvatiKlijenta(i);
		if(k.oznakaUsluge=='a') salter1.dodaj(k);
		if(k.oznakaUsluge=='b') salter2.dodaj(k);
		if(k.oznakaUsluge=='c') salter3.dodaj(k);
		this.k=k;
		ulaznaLista.obrisiKlijenta(i);
		System.out.println(this.toString());
	    return true;
	}

}
