package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private int sueldoBasico;

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String nombre() {
		return this.nombre;
	}

	public String direccion() {
		return this.direccion;
	}

	public String estadoCivil() {
		return this.estadoCivil;
	}

	public LocalDate fechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public int sueldoBasico() {
		return this.sueldoBasico;
	}

	public int edad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}

	public int sueldoBruto() {
		// Needs to be overridden by children
		return 0;
	}

	public int asignacionPorHijo() {
		// Needs to be overridden by children
		return 0;
	}

	public int asignacionPorConyuge() {
		// Needs to be overridden by children
		return 0;
	}

	public int retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public int obraSocial() {
		// Needs to be overridden by children
		return 0;
	}

	public int aportesJubilatorios() {
		// Needs to be overridden by children
		return 0;
	}

	public int horasExtra() {
		// Needs to be overridden by children
		return 0;
	}

	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	public String desgloceConceptos() {
		// Needs to be overridden by children
		return "";
	}
}
