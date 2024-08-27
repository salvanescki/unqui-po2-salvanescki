package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {

	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private int sueldoBruto;
	private int sueldoNeto;
	private String desgloceConceptos;

	public ReciboDeHaberes(String nombre, String direccion, LocalDate fechaEmision, int sueldoBruto, int sueldoNeto,
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

	public LocalDate fechaEmision() {
		return this.fechaEmision;
	}

	public int sueldoBruto() {
		return this.sueldoBruto;
	}

	public int sueldoNeto() {
		return this.sueldoNeto;
	}

	public String desgloceConceptos() {
		return this.desgloceConceptos;
	}

}
