package ar.edu.unq.po2.tp3.number;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.number.NumberUtils;

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

	@Test
	void maximumCommonMultipleTest() {
		assertEquals(999, NumberUtils.maximumCommonMultiple(3, 9));
		// Test between two big numbers
		assertEquals(-1, NumberUtils.maximumCommonMultiple(998, 999));
		// Test with a number and zero
		assertEquals(-1, NumberUtils.maximumCommonMultiple(0, 2));
		// Test with negative numbers
		assertEquals(972, NumberUtils.maximumCommonMultiple(-12, 18));
	}
}
