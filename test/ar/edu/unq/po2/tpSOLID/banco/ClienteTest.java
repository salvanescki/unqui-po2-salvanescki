package ar.edu.unq.po2.tpSOLID.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	private Cliente roberto;
	private Banco bancoProvincia;

	@BeforeEach
	void setUp() throws Exception {
		bancoProvincia = new Banco();
		roberto = new Cliente("Roberto", "Rodriguez", "Calle falsa 123", 29, 60000000);
	}

	@Test
	void ingresosAnualesTest() {
		assertEquals(720000000, roberto.ingresosAnuales());
	}
	
	@Test
	void solicitarCreditoTest() {
		assertEquals(0, roberto.getAhorros());
		bancoProvincia.solicitarCreditoPersonal(roberto, 1500000);
		assertEquals(1500000, roberto.getAhorros());
	}

}
