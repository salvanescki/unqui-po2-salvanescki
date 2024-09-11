package ar.edu.unq.po2.tp5.caja2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {
	
	private Agencia afip;
	private Servicio agua;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Servicio(afip, 20, 2000);
	}

	@Test
	void montoAPagarTest() {
		assertEquals(40000, agua.montoAPagar());
	}

}
