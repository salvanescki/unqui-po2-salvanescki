package ar.edu.unq.po2.tp5.caja1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {

	private Producto arroz;
	
	@BeforeEach
	void setUp() throws Exception {
		arroz = new ProductoCooperativa("Arroz", 1000, 90000);
	}

	@Test
	void getPrecio() {
		assertEquals(81000, arroz.getPrecio());
	}

}
