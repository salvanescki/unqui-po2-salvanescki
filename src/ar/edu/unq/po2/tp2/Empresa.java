package ar.edu.unq.po2.tp2;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Empresa {
	private String nombre;
	private int cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibosDeHaberes;

	public Empresa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}

	public String nombre() {
		return this.nombre;
	}

	public int cuit() {
		return this.cuit;
	}

	public void contratarEmpleado(Empleado unEmpleado) {
		this.empleados.add(unEmpleado);
	}

	public void despedirEmpleado(Empleado unEmpleado) {
		this.empleados.remove(unEmpleado);
	}

	public double totalSueldosNetos() {
		return this.empleados.stream().mapToDouble(e -> e.sueldoNeto()).sum();
	}

	public double totalSueldosBrutos() {
		return this.empleados.stream().mapToDouble(e -> e.sueldoBruto()).sum();
	}

	public double totalRetenciones() {
		return this.empleados.stream().mapToDouble(e -> e.retenciones()).sum();
	}

	public void liquidarSueldos() {
		this.empleados.forEach(e -> {
			recibosDeHaberes.add(new ReciboDeHaberes(e.nombre(), e.direccion(), Date.valueOf(LocalDate.now()),
					e.sueldoBruto(), e.sueldoNeto(), e.desgloceConceptos()));
		});
	}

}
