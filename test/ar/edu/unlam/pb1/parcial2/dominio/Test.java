package ar.edu.unlam.pb1.parcial2.dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void seCreaVuelo() {
		String lugarDeSalida="Argentina", lugarDeLlegada="Sudan del Sur";
		Integer cantidadDePasajeros=120;
		
		Vuelo nuevoVuelo= new Vuelo();
		nuevoVuelo.setOrigen(lugarDeSalida);
		nuevoVuelo.setDestino(lugarDeLlegada);
		nuevoVuelo.setCantidadDePasajeros(cantidadDePasajeros);
		
		assertEquals(cantidadDePasajeros,nuevoVuelo.getCantidadDePasajeros());
	}

	@org.junit.Test
	public void seRegistraPasajero() {
		String nombre="Nombre", apellido="Apellido";
		Integer dni=42952903;
		
		String lugarDeSalida="Argentina", lugarDeLlegada="Sudan del Sur";
		Integer cantidadDePasajeros=120;
		
		Vuelo nuevoVuelo= new Vuelo();
		nuevoVuelo.setOrigen(lugarDeSalida);
		nuevoVuelo.setDestino(lugarDeLlegada);
		nuevoVuelo.setCantidadDePasajeros(cantidadDePasajeros);		
		
		Pasajero nuevoPasajero=new Pasajero();
		nuevoPasajero.setApellido(apellido);
		nuevoPasajero.setDni(dni);
		nuevoPasajero.setNombre(nombre);
		assertTrue(nuevoVuelo.agregarPasajero(nuevoPasajero));
		
	}
	
	@org.junit.Test
	public void seAsignaUnAsiento() {
		String nombre="Nombre", apellido="Apellido";
		Integer dni=42952903;
		String nombre2="Nombre2", apellido2="Apellido2";
		Integer dni2=429529032;
		
		String lugarDeSalida="Argentina", lugarDeLlegada="Sudan del Sur";
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
		
		Integer fila=4,columna=3;
		
		Integer fila2do=3,columna2do=3;
		
		
		assertTrue(nuevoVuelo.verificarDisponibilidadAsiento(fila, columna));
		assertTrue(nuevoVuelo.verificarDisponibilidadAsiento(fila2do, columna2do));
			
		assertTrue(nuevoVuelo.asignarAsiento(nuevoPasajero, fila, columna));
		assertTrue(nuevoVuelo.asignarAsiento(nuevoPasajero2, fila2do, columna2do));
		
	}
	
	@org.junit.Test
	public void seBuscaUnPasajero() {
		String nombre="Nombre", apellido="Apellido";
		Integer dni=42952903;
		
		String lugarDeSalida="Argentina", lugarDeLlegada="Sudan del Sur";
		Integer cantidadDePasajeros=120;
		
		Vuelo nuevoVuelo= new Vuelo();
		nuevoVuelo.setOrigen(lugarDeSalida);
		nuevoVuelo.setDestino(lugarDeLlegada);
		nuevoVuelo.setCantidadDePasajeros(cantidadDePasajeros);		
		
		Pasajero nuevoPasajero=new Pasajero();
		nuevoPasajero.setApellido(apellido);
		nuevoPasajero.setDni(dni);
		nuevoPasajero.setNombre(nombre);
		
		Integer fila=4,columna=3;
			
		nuevoVuelo.agregarPasajero(nuevoPasajero);
		
		nuevoVuelo.asignarAsiento(nuevoPasajero, fila, columna);
		
		assertNotNull(nuevoVuelo.buscarPasajero(dni));
	
		
	}
	
	@org.junit.Test
	public void seOrdenaLaListaDePasajeros() {
		String nombre="Nombre", apellido="Apellido";
		Integer dni=42952903;
		String nombre2="Nombre2", apellido2="Apellido2";
		Integer dni2=429529032;
		
		String lugarDeSalida="Argentina", lugarDeLlegada="Sudan del Sur";
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
		
		nuevoVuelo.ordenarListaDePasajerosPorDNI();
		
		
	}
	
}
