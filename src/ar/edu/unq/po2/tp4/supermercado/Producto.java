package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado;

	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		this(nombre, precio, false);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}

}
