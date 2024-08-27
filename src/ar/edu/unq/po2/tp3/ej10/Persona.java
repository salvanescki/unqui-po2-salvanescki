package ar.edu.unq.po2.tp3.ej10;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public int edad() {
		return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	}

	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}

	public String nombre() {
		return this.nombre;
	}
}
