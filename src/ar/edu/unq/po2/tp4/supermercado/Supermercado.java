package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String dirección;
	private List<Producto> catálogo = new ArrayList<Producto>();

	public Supermercado(String nombre, String dirección) {
		this.nombre = nombre;
		this.dirección = dirección;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDirección() {
		return this.dirección;
	}

	public int getCantidadDeProductos() {
		return catálogo.size();
	}

	public void agregarProducto(Producto unProducto) {
		catálogo.add(unProducto);
	}

	public Double getPrecioTotal() {
		return catálogo.stream().mapToDouble(n -> n.getPrecio()).sum();
	}

}
