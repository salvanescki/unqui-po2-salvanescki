package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {

	private int cantidadDeHijos;
	private int antiguedad;

	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			int sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}

	@Override
	public int sueldoBruto() {
		return this.sueldoBasico()
				+ (this.asignacionPorHijo() + this.asignacionPorConyuge() + this.montoPorAntiguedad()) * 100;
	}

	public int montoPorAntiguedad() {
		return 50 * this.antiguedad;
	}

	@Override
	public int asignacionPorHijo() {
		return 150 * cantidadDeHijos;
	}

	@Override
	public int asignacionPorConyuge() {
		return this.estadoCivil() == "Casado" ? 100 : 0;
	}

	@Override
	public int obraSocial() {
		return this.sueldoBruto() / 10 + 20 * this.cantidadDeHijos * 100;
	}

	@Override
	public int aportesJubilatorios() {
		return this.sueldoBruto() * 15 / 100;
	}

	@Override
	public String desgloceConceptos() {
		return "Sueldo básico: " + this.sueldoBasico() + '\n' + "Asignación por hijo: " + this.asignacionPorHijo()
				+ '\n' + "Asignación por cónyuge: " + this.asignacionPorConyuge() + '\n' + "Monto por antiguedad: "
				+ this.montoPorAntiguedad() + '\n' + "Obra social: " + this.obraSocial() + '\n'
				+ "Aportes Jubilatorios: " + this.aportesJubilatorios() + '\n';
	}

	@Override
	public int horasExtra() {
		return 0;
	}
}
