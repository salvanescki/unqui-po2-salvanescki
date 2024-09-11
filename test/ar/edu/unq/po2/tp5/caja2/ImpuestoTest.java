package ar.edu.unq.po2.tp5.caja2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {
	
	private Agencia afip;
	private Impuesto municipal;

	@BeforeEach
	void setUp() throws Exception {
		municipal = new Impuesto(afip, 20000);
	}

	@Test
	void montoAPagarTest() {
		assertEquals(20000, municipal.montoAPagar());
	}

}
