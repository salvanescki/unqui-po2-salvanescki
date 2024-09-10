package ar.edu.unq.po2.tp4.trabajador;

public class IngresoPorHorasExtras extends Ingreso {

	private int horasExtras;

	public IngresoPorHorasExtras(String mes, String concepto, int monto, int horasExtras) {
		super(mes, concepto, monto);
		this.horasExtras = horasExtras;
	}
	
	public int getCantidadHorasExtras() {
		return this.horasExtras;
	}
	
	@Override
	public int getMontoImponible() {
		return 0;
	}

}
