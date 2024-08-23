package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoPlantaPermanente extends Empleado {

	private int cantidadDeHijos;
	private int antiguedad;

	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	public double sueldoBruto() {
		return this.sueldoBasico() + this.asignacionPorHijo() + this.asignacionPorConyuge() + this.montoPorAntiguedad();
	}

	public double montoPorAntiguedad() {
		return 50 * this.antiguedad;
	}

	public double asignacionPorHijo() {
		return 150 * cantidadDeHijos;
	}

	public double asignacionPorConyuge() {
		return this.estadoCivil() == "Casado" ? 100 : 0;
	}

	public double obraSocial() {
		return 0.1 * this.sueldoBruto() + 20 * this.cantidadDeHijos;
	}

	public double aportesJubilatorios() {
		return 0.15 * this.sueldoBruto();
	}

	public String desgloceConceptos() {
		return "Sueldo básico: " + this.sueldoBasico() + '\n' + "Asignación por hijo: " + this.asignacionPorHijo()
				+ '\n' + "Asignación por cónyuge: " + this.asignacionPorConyuge() + '\n' + "Monto por antiguedad: "
				+ this.montoPorAntiguedad() + '\n' + "Obra social: " + this.obraSocial() + '\n'
				+ "Aportes Jubilatorios: " + this.aportesJubilatorios() + '\n';
	}
}
