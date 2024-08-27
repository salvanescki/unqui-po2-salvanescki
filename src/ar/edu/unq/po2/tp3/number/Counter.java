package ar.edu.unq.po2.tp3.number;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numbers = new ArrayList<Integer>();

	public void addNumber(int i) {
		numbers.add(i);
	}

	public int getEvenOcurrences() {
		return this.countMultiplesOf(2);
	}

	public int getOddOcurrences() {
		return numbers.size() - this.countMultiplesOf(2);
	}

	public int countMultiplesOf(int i) {
		return (int) this.numbers.stream().filter(n -> n % i == 0).count();
	}

}
