package ar.edu.unq.po2.tp2;

import java.util.Date;

public class EmpleadoContratado extends Empleado {
	
	@SuppressWarnings("unused")
	private int numeroDeContrato;
	@SuppressWarnings("unused")
	private String medioDePago;

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento,
			double sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	public int gastosAdministrativosContractuales() {
		return 50;
	}
	
	public double sueldoBruto() {
		return this.sueldoBasico();
	}
	
	public double retenciones() {
		return this.gastosAdministrativosContractuales();
	}
	
	public String desgloceConceptos() {
		return "Sueldo básico: " + this.sueldoBasico() + '\n' + "Gastos Administrativos Contractuales: " + this.gastosAdministrativosContractuales() + '\n';
	}
}
