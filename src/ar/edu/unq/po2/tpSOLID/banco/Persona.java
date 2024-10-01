package ar.edu.unq.po2.tpSOLID.banco;

public class Persona {

	private String nombre;
	private String apellido;
	private String dirección;
	private int edad;

	public Persona(String nombre, String apellido, String dirección, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDirección() {
		return dirección;
	}

	public int getEdad() {
		return edad;
	}
}
