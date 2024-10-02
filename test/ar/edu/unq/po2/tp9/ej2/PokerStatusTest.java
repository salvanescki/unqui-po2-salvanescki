package ar.edu.unq.po2.tp9.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void verificarPokerTest() {
		assertEquals("Poquer", pokerStatus.verificar("1P", "1C", "1D", "1T", "QD"));
		assertEquals("Poquer", pokerStatus.verificar("1C", "1D", "1T", "KT", "1P"));
		assertEquals("Poquer", pokerStatus.verificar("1C", "1T", "3P", "1P", "1D"));
		assertEquals("Poquer", pokerStatus.verificar("1C", "4C", "1T", "1P", "1D"));
		assertEquals("Poquer", pokerStatus.verificar("5T", "1C", "1T", "1P", "1D"));
	}
	
	@Test
	void verificarPokerRepeatedAcesTest() {
		assertEquals("Poquer", pokerStatus.verificar("1P", "1C", "1P", "1T", "1D"));
	}
	
	@Test
	void verificarColorTest() {
		assertEquals("Color", pokerStatus.verificar("1P", "2P", "QP", "KP", "3P"));
	}
	
	@Test
	void verificarNoColorTest() {
		assertEquals("Nada", pokerStatus.verificar("1P", "2P", "QP", "KP", "3T"));
	}
	
	@Test
	void verificarTrioTest() {
		assertEquals("Trio", pokerStatus.verificar("1P", "1C", "1D", "KT", "QD"));
	}
	
	@Test
	void verificarNoPokerRepeatedAcesTest() {
		assertEquals("Trio", pokerStatus.verificar("1P", "1C", "1P", "KT", "QD"));
	}
}
