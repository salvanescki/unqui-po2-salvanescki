package ar.edu.unq.po2.tp5.caja2;

public class ProductoCooperativa extends Producto{

	private static final double DESCUENTO = 0.1;
	private final double descuento;

	public ProductoCooperativa(String nombre, int stock, int precio, double descuento) {
		super(nombre, stock, precio);
		this.descuento = descuento;
	}
	
	public ProductoCooperativa(String nombre, int stock, int precio) {
		super(nombre, stock, precio);
		this.descuento = DESCUENTO;
	}
	
	@Override
	public int getPrecio() {
		return (int) (this.precio * (1.0 - descuento));
	}

}
