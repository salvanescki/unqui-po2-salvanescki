package ar.edu.unq.po2.tp7.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTest {
	
	EmpleadoPasante pepe;
	float descuento;

	@BeforeEach
	void setUp() throws Exception {
		descuento = 1 - 0.13f;
	}

	@Test
	void sueldoSiNoTrabajoNingunaHora() {
		pepe = new EmpleadoPasante(0);
		assertEquals(0, pepe.sueldo());
	}
	
	@Test
	void sueldoSiTrabajo1Hora() {
		pepe = new EmpleadoPasante(1);
		assertEquals(40 * descuento, pepe.sueldo());
	}
	
	@Test
	void sueldoSiTrabajo600Horas() {
		pepe = new EmpleadoPasante(1);
		assertEquals(24000 * descuento, pepe.sueldo());
	}

}
