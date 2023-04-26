package ar.edu.unlam.pb1.parcial2.interfaz;

import ar.edu.unlam.pb1.parcial2.dominio.Pasajero;
import ar.edu.unlam.pb1.parcial2.dominio.Vuelo;

public class asd {

	public static void main(String[] args) {
		String nombre="Killua", apellido="Zoldyck";
		Integer dni=42952903;
		String nombre2="Killua2", apellido2="Zoldyck2";
		Integer dni2=429529032;
		
		String lugarDeSalida="Argentina", lugarDeLlegada="Japon";
		Integer cantidadDePasajeros=120;
		
		Vuelo nuevoVuelo= new Vuelo();
		nuevoVuelo.setOrigen(lugarDeSalida);
		nuevoVuelo.setDestino(lugarDeLlegada);
		nuevoVuelo.setCantidadDePasajeros(cantidadDePasajeros);		
		
		Pasajero nuevoPasajero=new Pasajero();
		nuevoPasajero.setApellido(apellido);
		nuevoPasajero.setDni(dni);
		nuevoPasajero.setNombre(nombre);
		
		Pasajero nuevoPasajero2=new Pasajero();
		nuevoPasajero.setApellido(apellido2);
		nuevoPasajero.setDni(dni2);
		nuevoPasajero.setNombre(nombre2);
		
	
	}

}
