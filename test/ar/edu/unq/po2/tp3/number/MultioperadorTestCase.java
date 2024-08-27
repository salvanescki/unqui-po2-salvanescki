package ar.edu.unq.po2.tp3.number;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.number.Multioperador;

class MultioperadorTestCase {
	
	List<Integer> numeros;
	List<Integer> numerosGrande;

	@BeforeEach
	void setUp() throws Exception {
		numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numerosGrande = new ArrayList<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			numerosGrande.add(i);
		}
	}

	@Test
	void sumarTest() {
		assertEquals(55, Multioperador.sumar(numeros));
		assertEquals(500500, Multioperador.sumar(numerosGrande));
	}
	
	@Test
	void restarTest() {
		assertEquals(-53, Multioperador.restar(numeros));
		assertEquals(-500498, Multioperador.restar(numerosGrande));
	}
	
	@Test
	void multiplicarTest() {
		assertEquals(3628800, Multioperador.multiplicar(numeros));
	}

}
