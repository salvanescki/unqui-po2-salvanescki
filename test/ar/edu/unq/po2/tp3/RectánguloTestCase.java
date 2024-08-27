package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectánguloTestCase {
	
	Rectángulo rectHorizontal;
	Rectángulo rectVertical;
	Point origen;
	Point v;

	@BeforeEach
	void setUp() throws Exception {
		origen = new Point(0,0);
		v = new Point(17, 20);
		rectHorizontal = new Rectángulo(origen, 6, 3);
		rectVertical = new Rectángulo(v, 2, 4);
	}

	@Test
	void anchoTest() {
		assertEquals(6, rectHorizontal.ancho());
		assertEquals(2, rectVertical.ancho());	
	}
	
	@Test
	void alturaTest() {
		assertEquals(3, rectHorizontal.altura());
		assertEquals(4, rectVertical.altura());	
	}
	
	@Test
	void areaTest() {
		assertEquals(18, rectHorizontal.area());
		assertEquals(8, rectVertical.area());
	}
	
	@Test
	void perimetroTest() {
		assertEquals(18, rectHorizontal.perimetro());
		assertEquals(12, rectVertical.perimetro());
	}
	
	@Test
	void esHorizontalTest() {
		assertTrue(rectHorizontal.esHorizontal());
		assertFalse(rectVertical.esHorizontal());
	}

}
