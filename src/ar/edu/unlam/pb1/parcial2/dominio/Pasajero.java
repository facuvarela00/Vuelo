package ar.edu.unlam.pb1.parcial2.dominio;

import java.util.Comparator;

public class Pasajero{
	
	private int dni;
	private String nombre;
	private String apellido
	;
	public Pasajero() {
		
		this.dni = 0;
		this.nombre = "";
		this.apellido = "";
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public String toString() {
		return "Pasajero [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
