package ar.edu.unq.po2.tp5.caja2;

public class Producto implements Pagable{

	private String nombre;
	private int stock;
	protected int precio;
	
	public Producto(String nombre, int stock, int precio) {
		this.nombre = nombre;		this.stock = stock;		this.precio = precio;
	}
		
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void incrementarStock(int cantidad) {
		this.stock += cantidad;
	}

	public void disminuirStock(int cantidad) {
		this.stock -= cantidad;
	}

	public boolean hayStock(int cantidad) {
		return this.stock >= cantidad;
	}
	
	public int getStock() {
		return this.stock;
	}

	@Override
	public int montoAPagar() {
		return this.precio;
	}

	@Override
	public void procesarPago() {
		if(!this.hayStock(1)) return;
		this.disminuirStock(1);
	}

}
