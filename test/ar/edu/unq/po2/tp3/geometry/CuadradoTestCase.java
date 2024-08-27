package ar.edu.unq.po2.tp3.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	Cuadrado cuadradoA;
	Cuadrado cuadradoB;
	Point origen;
	Point v;

	@BeforeEach
	void setUp() throws Exception {
		origen = new Point(0, 0);
		v = new Point(17, 20);
		cuadradoA = new Cuadrado(origen, 3);
		cuadradoB = new Cuadrado(v, 6);
	}

	@Test
	void anchoTest() {
		assertEquals(3, cuadradoA.ancho());
		assertEquals(6, cuadradoB.ancho());
	}

	@Test
	void alturaTest() {
		assertEquals(3, cuadradoA.altura());
		assertEquals(6, cuadradoB.altura());
	}

	@Test
	void areaTest() {
		assertEquals(9, cuadradoA.area());
		assertEquals(36, cuadradoB.area());
	}

	@Test
	void perimetroTest() {
		assertEquals(12, cuadradoA.perimetro());
		assertEquals(24, cuadradoB.perimetro());
	}

	@Test
	void esHorizontalTest() {
		assertFalse(cuadradoA.esHorizontal());
		assertFalse(cuadradoB.esHorizontal());
	}

}
