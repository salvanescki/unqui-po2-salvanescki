package ar.edu.unq.po2.tp5.caja1;

public class Producto {

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
		return this.stock <= cantidad;
	}

}
