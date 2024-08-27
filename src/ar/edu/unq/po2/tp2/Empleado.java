package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {

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

	public int retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	public abstract int sueldoBruto();

	public abstract int asignacionPorHijo();

	public abstract int asignacionPorConyuge();

	public abstract int obraSocial();

	public abstract int aportesJubilatorios();

	public abstract int horasExtra();

	public abstract String desgloceConceptos();
}
