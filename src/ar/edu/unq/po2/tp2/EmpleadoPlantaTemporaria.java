package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado {

	private LocalDate fechaFinDeDesignacionPlantaTemporaria;
	private int horasExtra;

	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			int sueldoBasico, LocalDate fechaFinTemporaria, int horasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaFinDeDesignacionPlantaTemporaria = fechaFinTemporaria;
		this.horasExtra = horasExtra;
	}

	public LocalDate fechaFinDeDesignacionPlantaTemporaria() {
		return this.fechaFinDeDesignacionPlantaTemporaria;
	}

	@Override
	public int horasExtra() {
		return this.horasExtra;
	}

	private int montoHorasExtra() {
		return 40 * this.horasExtra;
	}

	@Override
	public int sueldoBruto() {
		return this.sueldoBasico() + this.montoHorasExtra() * 100;
	}

	@Override
	public int obraSocial() {
		return this.sueldoBruto() / 10 + (this.edad() >= 50 ? 25 : 0) * 100;
	}

	@Override
	public int aportesJubilatorios() {
		return this.sueldoBruto() / 10 + 500 * this.horasExtra;
	}

	@Override
	public String desgloceConceptos() {
		return "Sueldo básico: " + this.sueldoBasico() + '\n' + "Horas extra: " + this.montoHorasExtra() + '\n'
				+ "Obra social: " + this.obraSocial() + '\n' + "Aportes Jubilatorios: " + this.aportesJubilatorios()
				+ '\n';
	}

	@Override
	public int asignacionPorHijo() {
		return 0;
	}

	@Override
	public int asignacionPorConyuge() {
		return 0;
	}
}
