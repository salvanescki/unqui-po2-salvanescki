package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTest {

	private IngresoPorHorasExtras horasExtrasEnero;

	@BeforeEach
	void setUp() throws Exception {
		horasExtrasEnero = new IngresoPorHorasExtras("Enero", "Horas Extras Enero", 120000, 2);
	}

	@Test
	void getCantidadHorasExtrasTest() {
		assertEquals(2, horasExtrasEnero.getCantidadHorasExtras());
	}

	@Test
	void getMontoImponibleTest() {
		assertEquals(0, horasExtrasEnero.getMontoImponible());
	}

}
