package ar.edu.unq.po2.tp9.ej1;

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
		assertTrue(pokerStatus.verificar("1P", "1C", "1D", "1T", "QD"));
		assertTrue(pokerStatus.verificar("1C", "1D", "1T", "KT", "1P"));
		assertTrue(pokerStatus.verificar("1C", "1T", "3P", "1P", "1D"));
		assertTrue(pokerStatus.verificar("1C", "4C", "1T", "1P", "1D"));
		assertTrue(pokerStatus.verificar("5T", "1C", "1T", "1P", "1D"));
	}
	
	@Test
	void verificarPokerRepeatedAcesTest() {
		assertTrue(pokerStatus.verificar("1P", "1C", "1P", "1T", "1D"));
	}
	
	@Test
	void verificarNoPokerDifferentSuitsTest() {
		assertFalse(pokerStatus.verificar("1P", "1C", "1D", "KT", "QD"));
	}
	
	@Test
	void verificarNoPokerRepeatedAcesTest() {
		assertFalse(pokerStatus.verificar("1P", "1C", "1P", "KT", "QD"));
	}
}
