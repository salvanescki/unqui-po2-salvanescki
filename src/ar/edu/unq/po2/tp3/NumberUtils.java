package ar.edu.unq.po2.tp3;

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
}
