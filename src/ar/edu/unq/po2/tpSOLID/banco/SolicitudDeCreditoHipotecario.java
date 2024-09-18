package ar.edu.unq.po2.tpSOLID.banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	
	private PropiedadInmobiliaria propiedadGarantia;

	public SolicitudDeCreditoHipotecario(Cliente cliente, long monto, int plazoEnMeses, PropiedadInmobiliaria garantia) {
		super(cliente, monto, plazoEnMeses);
		this.propiedadGarantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		return this.montoCuotaMensual() < cliente.ingresosMensuales() / 2 
				&& monto < propiedadGarantia.getValorFiscal() * 0.7
				&& cliente.getEdad() + (plazoEnMeses / 12) <= 65;
	}

}
