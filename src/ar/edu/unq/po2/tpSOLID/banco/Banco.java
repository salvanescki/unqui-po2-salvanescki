package ar.edu.unq.po2.tpSOLID.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco implements EntidadDeCredito{
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudesDeCredito = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente unCliente) {
		clientes.add(unCliente);
	}
	
	private void solicitarCredito(SolicitudDeCredito credito, Cliente cliente, long monto) {
		solicitudesDeCredito.add(credito);
		if (credito.esAceptable()){
			cliente.recibirPago(monto);
		}
	}

	@Override
	public void solicitarCreditoPersonal(Cliente cliente, long monto) {
		this.solicitarCredito(new SolicitudDeCreditoPersonal(cliente, monto, 12), cliente, monto);
	}

	@Override
	public void solicitarCreditoHipotecario(Cliente cliente, long monto, PropiedadInmobiliaria garantia) {
		this.solicitarCredito(new SolicitudDeCreditoHipotecario(cliente, monto, 12, garantia), cliente, monto);
	}
	
	@Override
	public long montoTotalSolicitudesCredito() {
		return solicitudesDeCredito.stream().filter(n -> n.esAceptable()).mapToLong(n -> n.monto).sum();
	}

	@Override
	public void pagarCuota(Cliente cliente, long monto) {
		solicitudesDeCredito.stream()
						.filter(n -> n.getCliente().equals(cliente) && n.montoCuotaMensual() == monto)
						.findFirst()
						.ifPresent(n -> n.pagarCuota(monto));
	}

}
