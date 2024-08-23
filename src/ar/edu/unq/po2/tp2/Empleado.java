package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Empleado {

	private String nombre;
	private String direccion;
	private String estadoCivil;
	private Date fechaDeNacimiento;
	private double sueldoBasico;

	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, double sueldoBasico) {
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

	public Date fechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	public double sueldoBasico() {
		return this.sueldoBasico;
	}

	public int edad() {
		return Period.between(LocalDate.ofInstant(this.fechaDeNacimiento.toInstant(), ZoneId.systemDefault()),
				LocalDate.now()).getYears();
	}

	public double sueldoBruto() {
		// Needs to be overridden by children
		return 0;
	}

	public double asignacionPorHijo() {
		// Needs to be overridden by children
		return 0;
	}

	public double asignacionPorConyuge() {
		// Needs to be overridden by children
		return 0;
	}

	public double retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}

	public double obraSocial() {
		// Needs to be overridden by children
		return 0;
	}

	public double aportesJubilatorios() {
		// Needs to be overridden by children
		return 0;
	}

	public int horasExtra() {
		// Needs to be overridden by children
		return 0;
	}

	public double sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}

	public String desgloceConceptos() {
		// Needs to be overridden by children
		return "";
	}
}
