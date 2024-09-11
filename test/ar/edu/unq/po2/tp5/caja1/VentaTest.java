package ar.edu.unq.po2.tp5.caja1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VentaTest {
	
	private Producto arroz;
	private Producto leche;
	private Producto azúcar;
	private Venta venta;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 1000, 90000);
		leche = new Producto("Leche", 1000, 100000);
		azúcar = new Producto("Leche", 1000, 80000);
		venta = new Venta();
	}

	@Test
	void importeTotalTest() {
		venta.agregarProducto(arroz, 2);
		venta.agregarProducto(leche, 1);
		venta.agregarProducto(azúcar, 1);
		assertEquals(360000, venta.importeTotal());
	}
	
	@Test
	void efectuarVentaTest() {
		venta.agregarProducto(arroz, 4);
		venta.agregarProducto(leche, 3);
		venta.agregarProducto(azúcar, 10);
		venta.efectuarVenta();
		assertEquals(996, arroz.getStock());
		assertEquals(997, leche.getStock());
		assertEquals(990, azúcar.getStock());
	}

}
