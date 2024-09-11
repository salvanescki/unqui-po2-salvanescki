package ar.edu.unq.po2.tp5.caja1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	private Producto arroz;
	private Producto leche;
	
	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 1000, 90000);
		leche = new Producto("Leche", 1000, 100000);
	}

	@Test
	void getPrecio() {
		assertEquals(90000, arroz.getPrecio());
	}
	
	@Test
	void hayStockTest() {
		assertTrue(arroz.hayStock(100));
	}
	
	@Test
	void noHayStockTest() {
		assertFalse(arroz.hayStock(2000));
	}
	
	@Test
	void incrementarStockTest() {
		assertFalse(leche.hayStock(2000));
		leche.incrementarStock(1000);
		assertTrue(leche.hayStock(2000));
	}
	
	@Test
	void disminuirStockTest() {
		arroz.disminuirStock(1);
		assertFalse(arroz.hayStock(1000));
	}

}
