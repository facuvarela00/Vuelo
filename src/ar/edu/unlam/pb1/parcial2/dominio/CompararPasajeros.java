package ar.edu.unlam.pb1.parcial2.dominio;

import java.util.Comparator;

public class CompararPasajeros implements Comparator<Pasajero> {

	public int compare(Pasajero pasajero, Pasajero pasajero2) {
		if (pasajero.getDni()>pasajero2.getDni()) {
			return -1;
		}else if (pasajero.getDni()==pasajero2.getDni()) {
			return 0;
		}else {
			return 1;
		}
	}
}
