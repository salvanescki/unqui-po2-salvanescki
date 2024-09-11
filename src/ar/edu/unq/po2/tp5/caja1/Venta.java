package ar.edu.unq.po2.tp5.caja1;

import java.util.HashMap;
import java.util.Map;

public class Venta {
	private Map<Producto, Integer> productos = new HashMap<Producto, Integer>();

	public void agregarProducto(Producto producto, int cantidad) {
		if(!producto.hayStock(cantidad)) return;
		this.productos.put(producto, cantidad);
	}

	public int importeTotal() {
		return productos.entrySet().stream().mapToInt(entry -> entry.getKey().getPrecio() * entry.getValue()).sum();
	}
	
	public void efectuarVenta() {
		productos.forEach((producto, cantidad) -> {
			producto.disminuirStock(cantidad);
		});
		productos.clear();
	}
}
