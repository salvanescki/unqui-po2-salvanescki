package ar.edu.unq.po2.tp3.number;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	public static int sumar(List<Integer> numeros) {
		return numeros.stream().mapToInt(n -> n).sum();
	}

	public static int restar(List<Integer> numeros) {
		return numeros.stream().reduce((a, b) -> a - b).orElse(-1);
	}

	public static int multiplicar(List<Integer> numeros) {
		return numeros.stream().reduce(1, (a, b) -> a * b);
	}
}
