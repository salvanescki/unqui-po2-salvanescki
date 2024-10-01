package ar.edu.unq.po2.tpSOLID.banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(Cliente cliente, long monto, int plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		return cliente.ingresosAnuales() >= 1500000 && monto < (cliente.ingresosMensuales() * 0.7);
	}

}
