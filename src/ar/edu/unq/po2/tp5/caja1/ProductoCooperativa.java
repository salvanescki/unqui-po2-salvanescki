package ar.edu.unq.po2.tp5.caja1;

public class ProductoCooperativa extends Producto{

	private double descuento;

	public ProductoCooperativa(String nombre, int stock, int precio, double descuento) {
		super(nombre, stock, precio);
		this.descuento = descuento;
	}
	
	@Override
	public int getPrecio() {
		return (int) (this.precio * descuento);
	}

}
