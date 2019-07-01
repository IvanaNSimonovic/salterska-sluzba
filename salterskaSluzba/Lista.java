package salterskaSluzba;

public class Lista {

	protected static Klijent prvaReferenca;
	protected static Klijent poslednjaReferenca;

	public boolean dodaj(Klijent k) {
		if (prvaReferenca == null)
			prvaReferenca = k;
		if (poslednjaReferenca != null)
			poslednjaReferenca.clanListe = k;
		poslednjaReferenca = k;
		return true;

	}

	public Klijent dohvatiKlijenta(int index) {
		if (prvaReferenca == null) {
			System.err.println("Lista klijenata je prazna");
			return null;
		}
		if (index == 0)
			return prvaReferenca;
		if (index > 0) {

			if (prvaReferenca.clanListe == null) {
				System.out.println("Pozicija je prazna");
				return null;
			}
			Klijent k = prvaReferenca.clanListe;
			for (int i = 1; i < index; i++) {
				if (k.clanListe == null) {
					System.out.println("Pozicija je prazna");
					return null;
				} else if (k.clanListe != null)
					k = k.clanListe;

			}
			return k;

		}
		return null;

	}

	public boolean obrisiKlijenta(int index) {
		if (prvaReferenca == null) {
			System.err.println("Lista klijenata je prazna");
			return false;
		}
		if (index == 0) {
			Klijent k=prvaReferenca.clanListe;
			prvaReferenca.clanListe=null;
			Lista.prvaReferenca = k;
			
			return true;
		}
		if (index > 0) {

			if (prvaReferenca.clanListe == null) {
				System.out.println("Pozicija je prazna");
				return false;
			}
			Klijent k = prvaReferenca.clanListe;
			for (int i = 1; i < index - 1; i++) {
				if (k.clanListe == null) {
					System.out.println("Pozicija je prazna");
					return false;
				} else if (k.clanListe != null)
					k = k.clanListe;

			}
			k.clanListe = k.clanListe.clanListe;
			k.clanListe.clanListe = null;
			return true;

		} else {
			System.out.println("Nevalidan index");
			return false;
		}

	}

	public boolean isListaPrazna(Lista l) {
		if (Lista.prvaReferenca == null) {
			System.out.println("Lista je prazna");
			return true;
		} else {
			System.out.println("Lista nije prazna. Lista ima bar jednog clana");
			return false;
		}
	}

}
