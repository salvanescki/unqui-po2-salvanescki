package ar.edu.unq.po2.tp9.ej2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	private boolean isPoker(List<String> hand) {
		return hand.contains("1P") && hand.contains("1D") && hand.contains("1T") && hand.contains("1C");
	}
	
	private boolean isFlush(List<String> hand) {
		char suit = hand.get(0).charAt(1);
		return hand.stream()
				   .allMatch(c -> c.charAt(1) == suit);
	}
	
	private boolean isThreeOfAKind(List<String> hand){
		return hand.stream()
				   .map(card -> card.charAt(0))
				   .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count == 3);
	}

	public String verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> hand = Arrays.asList(c1, c2, c3, c4, c5);
		if (this.isPoker(hand)) {
			return "Poquer";
		}
		if (this.isFlush(hand)) {
			return "Color";
		}
		if (this.isThreeOfAKind(hand)) {
			return "Trio";
		}
		return "Nada";
	}

}
