package ar.edu.unlam.pb1.parcial2.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;

	private String origen;
	private String destino;
	private ArrayList<Pasajero> pasajeros;
	private Pasajero[][] asientos;
	//private ArrayList<ArrayList<Pasajero>> asientos;
	private Integer cantidadDePasajeros;
	private final Integer MAXIMO_FILAS=5, MAXIMO_COLUMNAS=4;

	public Vuelo() {
		
		/* 
		 * El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase.
		 */
	this.origen="";
	this.destino="";
	this.cantidadDePasajeros=0;
	pasajeros=new ArrayList<>();
	//asientos=new ArrayList<ArrayList<Pasajero>>();
	asientos=new Pasajero[MAXIMO_FILAS][MAXIMO_COLUMNAS];
	}

	public Boolean agregarPasajero(Pasajero pasajero) {
		
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del avi�n. Devuelve true si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		
		if (pasajeros.size()<this.getCantidadDePasajeros()) {
			return this.pasajeros.add(pasajero);
		}
		
		return false;
	}

	public Boolean verificarDisponibilidadAsiento(int fila, int columna) {
		
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		 Boolean disponible=false;
		 
		if (asientos[fila][columna]==null) {
			disponible=true;
		}
		
		return disponible;
	}

	/*public Pasajero buscarPasajero(Integer dni) {
		
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
		 
		Boolean seEncontro=false;
		Pasajero pasajeroBuscado=null;
		
		for (int i=0;i<asientos.length;i++) {
			for (int j=0;i<asientos[i].length;j++) {
				
				if (asientos[i][j]!=null&&asientos[i][j].getDni()==dni&&seEncontro==false) {
					seEncontro=true;
					pasajeroBuscado=asientos[i][j];
				}
			}
		}
		return pasajeroBuscado;
	}*/
	
	public Pasajero buscarPasajero(Integer dni) {
		
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
		 */

		for (Pasajero pasajero:pasajeros) {
			if (pasajero.getDni()==dni) {
				return pasajero;
			}
		}
		return null;
	}

	public Boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		
		/*
		 * Asigna el asiento al pasajero recibido por par�metro. Devuelve true si lo pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
		
		 Boolean seAsigno=false;
		 
			if (verificarDisponibilidadAsiento(fila, columna)) {
				asientos[fila][columna]=pasajero;
				seAsigno=true;
			}	
		return seAsigno;	
	}
	
	public void ordenarListaDePasajerosPorDNI() {
		
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
		
		//ArrayList<Pasajero> pasajeros;
		
		Collections.sort(pasajeros, new CompararPasajeros());
		for (Pasajero auxiliar:pasajeros) {
			System.out.println(auxiliar);
		}
	}
	
	/*public void ordenarVagonesPorIdVagon() {  ////HUH?
	Vagon auxiliar=null;
	for (int i=1;i<formacion.length;i++) {
		for (int j=0;j<formacion.length-1;j++) {
				if (formacion[i]!=null&&(formacion[j].getIdVagon().compareTo(formacion[j+1].getIdVagon())>0)) {
					auxiliar=formacion[j+1];
					formacion[j+1]=formacion[j];
					formacion[j]=auxiliar;
				}
			}
		}
	}*/
	
	//public Pasajero[] getPasajeros() {
		
		/*
		 * Devuelve la lista de pasajeros
		 */
	//}
	
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	/*public Pasajero[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Pasajero[][] asientos) {
		this.asientos = asientos;
	}*/

	public Integer getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}

	public void setCantidadDePasajeros(Integer cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

	public int getCANTIDAD_DE_FILAS() {
		return CANTIDAD_DE_FILAS;
	}

	public int getCANTIDAD_DE_ASIENTOS_POR_FILA() {
		return CANTIDAD_DE_ASIENTOS_POR_FILA;
	}



	//public String toString() {
		
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se encuentra libre "L" u ocupado "O".
		 */

	//}
}
