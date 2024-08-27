package ar.edu.unq.po2.tp3.number;

import java.util.List;

public class NumberUtils {

	public static int numberWithMoreEvenDigits(List<Integer> numbers) {
		int numberWithMoreEvenDigits = 1;
		for (int number : numbers) {
			if (evenDigitsQuantity(number) > evenDigitsQuantity(numberWithMoreEvenDigits))
				numberWithMoreEvenDigits = number;
		};
		return numberWithMoreEvenDigits;
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	private static int evenDigitsQuantity(int n) {
		int counter = 0;
		while (n > 1) {
			int lastDigit = n % 10;
			if (isEven(lastDigit))
				counter++;
			n /= 10;
		}
		return counter;
	}
	
	/**
	 * It returns the number between 0 and 1000 that is multple of x and y simultaneously
	*/
	public static int maximumCommonMultiple(int x, int y) {
		if (x == 0 || y == 0) return -1;
		for (int i = 1000; i > 0; i--) {
			if(i % x == 0 && i % y == 0) {
				return i;
			}
		}
		return -1;
	}
}
