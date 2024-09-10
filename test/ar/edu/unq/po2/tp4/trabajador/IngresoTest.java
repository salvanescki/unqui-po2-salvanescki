package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	
	private Ingreso ingresoEnero;

	@BeforeEach
	void setUp() throws Exception {
		ingresoEnero = new Ingreso("Enero", "Sueldo Enero", 25000000);
	}

	@Test
	void getMesTest() {
		assertEquals("Enero", ingresoEnero.getMes());
	}
	
	@Test
	void getConceptoTest() {
		assertEquals("Sueldo Enero", ingresoEnero.getConcepto());
	}
	
	@Test
	void getMontoTest() {
		assertEquals(25000000, ingresoEnero.getMonto());
	}
	
	@Test
	void getMontoImponibleTest() {
		assertEquals(25000000, ingresoEnero.getMontoImponible());
	}

}
