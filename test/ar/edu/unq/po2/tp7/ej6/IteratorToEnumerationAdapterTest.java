package ar.edu.unq.po2.tp7.ej6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IteratorToEnumerationAdapterTest {
	
	List<String> list;
	Iterator<String> iterator;
	Enumeration<String> enumeration;
	

	@BeforeEach
	void setUp() throws Exception {
		list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		iterator = list.iterator();
		enumeration = new IteratorToEnumerationAdapter<String>(iterator);
	}

	@Test
	void nextElementTest() {
		assertEquals("a", enumeration.nextElement());
		assertEquals("b", enumeration.nextElement());
		assertEquals("c", enumeration.nextElement());
	}
	
	@Test
	void noMoreElementsTest() throws NoSuchElementException {
		assertEquals("a", enumeration.nextElement());
		assertEquals("b", enumeration.nextElement());
		assertEquals("c", enumeration.nextElement());
		assertThrows(NoSuchElementException.class, () -> {enumeration.nextElement();});
	}
	
	@Test
	void hasMoreElementsTest() {
		assertEquals("a", enumeration.nextElement());
		assertTrue(enumeration.hasMoreElements());
	}
	
	@Test
	void hasNoMoreElementsTest() {
		assertEquals("a", enumeration.nextElement());
		assertEquals("b", enumeration.nextElement());
		assertEquals("c", enumeration.nextElement());
		assertFalse(enumeration.hasMoreElements());
	}

}
