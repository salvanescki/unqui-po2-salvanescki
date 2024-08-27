package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class NumberUtilsTestCase {

	@Test
	void isEvenTest() {
		assertTrue(NumberUtils.isEven(-2));
		assertTrue(!NumberUtils.isEven(-1));
		assertTrue(NumberUtils.isEven(0));
		assertTrue(!NumberUtils.isEven(1));
		assertTrue(NumberUtils.isEven(2));
		assertTrue(!NumberUtils.isEven(3));
		assertTrue(NumberUtils.isEven(4));
	}
	
	@Test
	void numberWithMoreEvenDigitsTest() {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10003, 2004, 30456, 252325, 4444, 65034, 246810));
		assertEquals(246810, NumberUtils.numberWithMoreEvenDigits(numbers));
		numbers.add(200004);
		assertEquals(200004, NumberUtils.numberWithMoreEvenDigits(numbers));
	}

}
