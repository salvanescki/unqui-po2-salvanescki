package ar.edu.unq.po2.tp5.caja2;

public abstract class Factura implements Pagable{
	
	private Agencia agencia;
	
	/**
	 * Aunque no se inicialice por ser abstracta, tiene sentido que haya un constructor acá.
	 * @param agencia
	 */
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void procesarPago() {
		this.agencia.registrarPago(this);
	}

}
