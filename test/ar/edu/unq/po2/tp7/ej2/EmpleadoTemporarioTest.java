package ar.edu.unq.po2.tp7.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	EmpleadoTemporario juan;
	float descuento;

	@BeforeEach
	void setUp() throws Exception {
		descuento = 1 - 0.13f;
	}

	@Test
	void sueldoSiNoTrabajoNingunaHoraYNoTieneFamilia() {
		juan = new EmpleadoTemporario(0, false);
		assertEquals(1000 * descuento, juan.sueldo());
	}
	
	@Test
	void sueldoSiNoTrabajoNingunaHoraYTieneFamilia() {
		juan = new EmpleadoTemporario(0, true);
		assertEquals(1100 * descuento, juan.sueldo());
	}
	
	@Test
	void sueldoSiTrabajo4HorasYNoTieneFamilia() {
		juan = new EmpleadoTemporario(4, false);
		assertEquals(1020 * descuento, juan.sueldo());
	}
	
	@Test
	void sueldoSiTrabajo4HorasYTieneFamilia() {
		juan = new EmpleadoTemporario(4, true);
		assertEquals(1120 * descuento, juan.sueldo());
	}

}
