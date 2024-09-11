package ar.edu.unq.po2.tp5.caja1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto arroz;
	private Producto leche;
	private Producto azúcar;
	private Caja venta;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 1000, 90000);
		leche = new Producto("Leche", 1000, 100000);
		azúcar = new Producto("Leche", 1000, 80000);
		venta = new Caja();
	}

	@Test
	void montoAPagarTest() {
		venta.registrarProducto(arroz, 2);
		venta.registrarProducto(leche, 1);
		venta.registrarProducto(azúcar, 1);
		assertEquals(360000, venta.montoAPagar());
	}
	
	@Test
	void productosStockTest() {
		venta.registrarProducto(arroz, 4);
		venta.registrarProducto(leche, 3);
		venta.registrarProducto(azúcar, 10);
		assertEquals(996, arroz.getStock());
		assertEquals(997, leche.getStock());
		assertEquals(990, azúcar.getStock());
	}

}
