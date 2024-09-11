package ar.edu.unq.po2.tp5.caja1;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private int montoAPagar = 0;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void registrarProducto(Producto producto, int cantidad) {
		if(!producto.hayStock(cantidad)) return;
		productos.add(producto);
		montoAPagar += producto.getPrecio() * cantidad;
		producto.disminuirStock(cantidad);
	}
	
	public int montoAPagar() {
		return this.montoAPagar;
	}
}
