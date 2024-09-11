package ar.edu.unq.po2.tp5.caja2;

public class Impuesto extends Factura {

	private final int tasaServicio;
	
	public Impuesto(Agencia agencia, int tasaServicio) {
		super(agencia);
		this.tasaServicio = tasaServicio;
	}

	@Override
	public int montoAPagar() {
		return tasaServicio;
	}

}
