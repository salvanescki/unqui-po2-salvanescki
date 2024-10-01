package ar.edu.unq.po2.tp7.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoEnPlantaTest {

	EmpleadoEnPlanta lucas;
	float descuento;

	@BeforeEach
	void setUp() throws Exception {
		descuento = 1 - 0.13f;
	}

	@Test
	void sueldoSiNoTieneFamilia() {
		lucas = new EmpleadoEnPlanta(0, 0);
		assertEquals(3000 * descuento, lucas.sueldo());
	}
	
	@Test
	void sueldoSiTiene1Hijo() {
		lucas = new EmpleadoEnPlanta(0, 1);
		assertEquals(3150 * descuento, lucas.sueldo());
	}
	
	@Test
	void sueldoSiTiene2Hijos() {
		lucas = new EmpleadoEnPlanta(0, 2);
		assertEquals(3300 * descuento, lucas.sueldo());
	}
	
	@Test
	void sueldoSiTiene10Hijos() {
		lucas = new EmpleadoEnPlanta(0, 10);
		assertEquals(4500 * descuento, lucas.sueldo());
	}

}
