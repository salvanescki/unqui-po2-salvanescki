package ar.edu.unq.po2.tp9.ej1;

import java.util.Arrays;
import java.util.List;

public class PokerStatus {
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> hand = Arrays.asList(c1, c2, c3, c4, c5);
		return hand.contains("1P")
			   && hand.contains("1D")
			   && hand.contains("1T")
			   && hand.contains("1C");
	}
}
