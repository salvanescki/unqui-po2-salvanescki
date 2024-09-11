package ar.edu.unq.po2.tp4.trabajador;

import java.util.List;
import java.util.ArrayList;

public class Trabajador {

	private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();

	/**
	 * Agrega un ingreso a la lista de ingresos percibidos por el trabajador
	 * 
	 * @param ingreso
	 */
	public void agregarIngreso(Ingreso ingreso) {
		this.ingresosPercibidos.add(ingreso);
	}

	/**
	 * Retorna el monto total percibido por el trabajador
	 * 
	 * @return
	 */
	public int getTotalPercibido() {
		return this.ingresosPercibidos.stream().mapToInt(n -> n.getMonto()).sum();
	}

	/**
	 * Retorna el monto imponible al impuesto al trabajador
	 * 
	 * @return
	 */
	public int getMontoImponible() {
		return this.ingresosPercibidos.stream().mapToInt(n -> n.getMontoImponible()).sum();
	}

	/**
	 * Retorna el monto a pagar por el trabajador, calculado como el 2% del monto
	 * imponible
	 * 
	 * @return
	 */
	public int getImpuestoAPagar() {
		return this.getMontoImponible() * 2 / 100;
	}
}
