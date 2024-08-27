package ar.edu.unq.po2.tp3.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	
	Point o;
	Point v;

	@BeforeEach
	void setUp() throws Exception {
		o = new Point();
		v = new Point(2, 4);
	}

	@Test
	void createDefaultPointTest() {
		assertEquals(0, o.x());
		assertEquals(0, o.y());
	}
	
	@Test
	void createPointTest() {
		assertEquals(2, v.x());
		assertEquals(4, v.y());
	}
	
	@Test
	void moveToTest() {
		o.moveTo(3, 4);
		assertEquals(3, o.x());
		assertEquals(4, o.y());
	}
	
	@Test
	void addTest() {
		Point u = new Point(2, 7);
		Point w = v.add(u);
		assertEquals(4, w.x());
		assertEquals(11, w.y());
	}

}
