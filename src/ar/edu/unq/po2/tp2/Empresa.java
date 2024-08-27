package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private long cuit;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibosDeHaberes;

	public Empresa(String nombre, long cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.recibosDeHaberes = new ArrayList<ReciboDeHaberes>();
	}

	public String nombre() {
		return this.nombre;
	}

	public long cuit() {
		return this.cuit;
	}

	public void contratarEmpleado(Empleado unEmpleado) {
		this.empleados.add(unEmpleado);
	}

	public void despedirEmpleado(Empleado unEmpleado) {
		this.empleados.remove(unEmpleado);
	}

	public int totalSueldosNetos() {
		return this.empleados.stream().mapToInt(e -> e.sueldoNeto()).sum();
	}

	public int totalSueldosBrutos() {
		return this.empleados.stream().mapToInt(e -> e.sueldoBruto()).sum();
	}

	public int totalRetenciones() {
		return this.empleados.stream().mapToInt(e -> e.retenciones()).sum();
	}

	public void liquidarSueldos() {
		this.empleados.forEach(e -> {
			recibosDeHaberes.add(new ReciboDeHaberes(e.nombre(), e.direccion(), LocalDate.now(), e.sueldoBruto(),
					e.sueldoNeto(), e.desgloceConceptos()));
		});
	}

	public int cantidadDeRecibos() {
		return this.recibosDeHaberes.size();
	}

}
