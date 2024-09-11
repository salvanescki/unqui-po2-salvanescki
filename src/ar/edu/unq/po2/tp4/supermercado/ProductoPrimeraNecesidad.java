package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	private static final double DESCUENTO = 0.1;
	private final double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		this(nombre, precio, esPrecioCuidado, DESCUENTO);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		this(nombre, precio, false, descuento);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio) {
		this(nombre, precio, false, DESCUENTO);
	}

	@Override
	public double getPrecio() {
		return Math.floor(this.precio * (1.0 - this.descuento) * 100) / 100.0;
	}

}
