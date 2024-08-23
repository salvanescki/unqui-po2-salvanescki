package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoPlantaTemporaria extends Empleado {

	private Date fechaFinDeDesignacionPlantaTemporaria;
	private int horasExtra;

	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, Date fechaFinTemporaria, int horasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDeDesignacionPlantaTemporaria = fechaFinTemporaria;
		this.horasExtra = horasExtra;
	}

	public Date fechaFinDeDesignacionPlantaTemporaria() {
		return this.fechaFinDeDesignacionPlantaTemporaria;
	}

	public int horasExtra() {
		return this.horasExtra;
	}

	private double montoHorasExtra() {
		return 40 * this.horasExtra;
	}

	public double sueldoBruto() {
		return this.sueldoBasico() + this.montoHorasExtra();
	}

	public double obraSocial() {
		return 0.1 * this.sueldoBruto() + (this.edad() >= 50 ? 25 : 0);
	}

	public double aportesJubilatorios() {
		return 0.1 * this.sueldoBruto() + 5 * this.horasExtra;
	}

	public String desgloceConceptos() {
		return "Sueldo básico: " + this.sueldoBasico() + '\n' + "Horas extra: " + this.montoHorasExtra() + '\n'
				+ "Obra social: " + this.obraSocial() + '\n' + "Aportes Jubilatorios: " + this.aportesJubilatorios()
				+ '\n';
	}
}
