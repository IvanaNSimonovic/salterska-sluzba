package salterskaSluzba;

public class SalterskaSluzba {

	public static void main(String[] args) {
		Lista ulaznaLista = new Lista();
		Lista salter1 = new Lista();
		Lista salter2 = new Lista();
		Lista salter3 = new Lista();

		Portir portir = new Portir();
		Razvodnik razvodnik = new Razvodnik();
		SalterskiSluzbenik sluzbenik1 = new SalterskiSluzbenik();
		SalterskiSluzbenik sluzbenik2 = new SalterskiSluzbenik();
		SalterskiSluzbenik sluzbenik3 = new SalterskiSluzbenik();

		int brojUsluga = 10;
		for (int i = 0; i < brojUsluga; i++) {
			portir.smestiKlijenta(ulaznaLista);
			razvodnik.staviURed(ulaznaLista, 0, salter1, salter2, salter3);
			sluzbenik1.obradiKlijenta(salter1);
			sluzbenik2.obradiKlijenta(salter2);
			sluzbenik3.obradiKlijenta(salter3);

		}

	}
}
