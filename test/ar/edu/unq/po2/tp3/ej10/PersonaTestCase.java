package ar.edu.unq.po2.tp3.ej10;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	Persona juan;
	Persona pedro;
	SimpleDateFormat dateFormat;

	@BeforeEach
	void setUp() throws Exception {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		juan = new Persona("Juan", dateFormat.parse("12/07/1968"));
		pedro = new Persona("Pedro", dateFormat.parse("20/04/1995"));
	}

	@Test
	void edadTest() {
		// Siendo hoy 27/8/2024, los tests deberían funcionar hasta abril del año que viene. Sino cambiar la edad esperada.
		assertEquals(56, juan.edad());
		assertEquals(29, pedro.edad());
	}
	
	@Test
	void menorQueTest() {
		// Siendo hoy 27/8/2024, los tests deberían funcionar hasta abril del año que viene. Sino cambiar la edad esperada.
		assertTrue(pedro.menorQue(juan));
	}
	
}
