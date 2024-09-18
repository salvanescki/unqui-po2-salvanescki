package ar.edu.unq.po2.tpSOLID.banco;

public interface EntidadDeCredito {

	public void solicitarCreditoPersonal(Cliente cliente, long monto);
	
	public void solicitarCreditoHipotecario(Cliente cliente, long monto, PropiedadInmobiliaria garantia);

	public long montoTotalSolicitudesCredito();

	public void pagarCuota(Cliente cliente, long monto);

}
