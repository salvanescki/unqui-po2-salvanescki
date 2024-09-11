package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	private Trabajador juan;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Trabajador();
		for(int i = 0; i < 12; i++) {
			String mes = String.valueOf(i);
			juan.agregarIngreso(new Ingreso(mes, "Sueldo Mes: " + mes, 25000000));
		}
		for(int i = 0; i < 3; i++) {
			juan.agregarIngreso(new IngresoPorHorasExtras("Diciembre", "Horas extras Diciembre", 360000, 2));
		}
	}

	@Test
	void getTotalPercibidoTest() {
		// 300,000,000 + 1,080,000 = 301,080,000
		assertEquals(301080000, juan.getTotalPercibido());
	}
	
	@Test
	void getMontoImponibleTest() {
		// 300,000,000
		assertEquals(300000000, juan.getMontoImponible());
	}
	
	@Test
	void getImpuestoAPagarTest() {
		// 300,000,000 * 0.02 = 6,000,000
		assertEquals(6000000, juan.getImpuestoAPagar());
	}

}
