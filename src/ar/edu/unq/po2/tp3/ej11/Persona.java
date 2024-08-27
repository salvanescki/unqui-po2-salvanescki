package ar.edu.unq.po2.tp3.ej11;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public int edad() {
		return this.edad;
	}
}
