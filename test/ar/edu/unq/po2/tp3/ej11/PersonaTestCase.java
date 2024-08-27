package ar.edu.unq.po2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	
	Persona juan;
	Persona pedro;
	Persona pepe;
	Persona jose;
	Persona lucas;
	EquipoDeTrabajo quilmesSrl;

	@BeforeEach
	void setUp() throws Exception {
		juan = new Persona("Juan", "Perez", 24);
		pedro = new Persona("Pedro", "Gomez", 35);
		pepe = new Persona("Pepe", "Rodriguez", 19);
		jose = new Persona("Jose", "Diaz", 46);
		lucas = new Persona("Lucas", "Lopez", 58);
		quilmesSrl = new EquipoDeTrabajo("Quilmes S.R.L.", new ArrayList<Persona>(Arrays.asList(juan, pedro, pepe, jose, lucas)));
	}

	@Test
	void promedioEdadTest() {
		assertEquals(36, quilmesSrl.promedioEdadIntegrantes());
	}

}
