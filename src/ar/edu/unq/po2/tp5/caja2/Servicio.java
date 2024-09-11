package ar.edu.unq.po2.tp5.caja2;

public class Servicio extends Factura {

	private int costoUnitario;
	private int cantidadUnidadesConsumidas;
	
	public Servicio(Agencia agencia, int costoUnitario, int cantidadUnidadesConsumidas) {
		super(agencia);
		this.costoUnitario = costoUnitario;
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}
	
	@Override
	public int montoAPagar() {
		return this.costoUnitario * this.cantidadUnidadesConsumidas;
	}
}
