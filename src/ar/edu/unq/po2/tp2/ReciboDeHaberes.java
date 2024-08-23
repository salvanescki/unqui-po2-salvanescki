package ar.edu.unq.po2.tp2;

import java.sql.Date;

public class ReciboDeHaberes {

	private String nombreEmpleado;
	private String direccion;
	private Date fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String desgloceConceptos;

	public ReciboDeHaberes(String nombre, String direccion, Date fechaEmision, double sueldoBruto, double sueldoNeto,
			String desgloceConceptos) {
		this.nombreEmpleado = nombre;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloceConceptos = desgloceConceptos;
	}

	public String nombreEmpleado() {
		return this.nombreEmpleado;
	}

	public String direccion() {
		return this.direccion;
	}

	public Date fechaEmision() {
		return this.fechaEmision;
	}

	public double sueldoBruto() {
		return this.sueldoBruto;
	}

	public double sueldoNeto() {
		return this.sueldoNeto;
	}

	public String desgloceConceptos() {
		return this.desgloceConceptos;
	}

}
