package ar.edu.unq.po2.tp4.trabajador;

public class Ingreso {

	private String mes;
	private int monto;
	private String concepto;

	public Ingreso(String mes, String concepto, int monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public String getMes() {
		return this.mes;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public int getMonto() {
		return this.monto;
	}

	public int getMontoImponible() {
		return this.monto;
	}

}
