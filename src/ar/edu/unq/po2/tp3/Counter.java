package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numbers = new ArrayList<Integer>();

	public void addNumber(int i) {
		numbers.add(i);
	}

	public int getEvenOcurrences() {
		return (int) this.numbers.stream().filter(n -> n % 2 == 0).count();
	}
	
	public int getOddOcurrences() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int countMultiplesOf(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
