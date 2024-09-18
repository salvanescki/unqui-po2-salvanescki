package ar.edu.unq.po2.tpSOLID.banco;

public abstract class SolicitudDeCredito {
	protected Cliente cliente;
	protected long monto;
	protected int plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, long monto, int plazoEnMeses){
		this.cliente = cliente;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int montoCuotaMensual() {
		return (int) monto / plazoEnMeses;
	}
	
	public void pagarCuota(long montoMensual) {
		monto -= montoMensual;
		plazoEnMeses--;
		cliente.debitar(montoMensual);
	}
	
	public abstract boolean esAceptable();
}
