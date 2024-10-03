package ar.edu.unq.po2.tp9.ej3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	private boolean isPoker(List<Card> hand) {
		return hand.contains(new Card(CardValue.ACE, CardSuit.DIAMONDS))
			&& hand.contains(new Card(CardValue.ACE, CardSuit.HEARTS))
			&& hand.contains(new Card(CardValue.ACE, CardSuit.CLUBS))
			&& hand.contains(new Card(CardValue.ACE, CardSuit.SPADES));
	}
	
	private boolean isFlush(List<Card> hand) {
		Card firstCard = hand.getFirst();
		return hand.stream().allMatch(c -> c.isSameSuit(firstCard));
	}
	
	private boolean isThreeOfAKind(List<Card> hand){
		return hand.stream()
				   .map(card -> card.getValue())
				   .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count == 3);
	}
	
	public String verify(Card c1, Card c2, Card c3, Card c4, Card c5) {
		List<Card> hand = Arrays.asList(c1, c2, c3, c4, c5);
		if (this.isPoker(hand)) {
			return "Poker";
		}
		if (this.isFlush(hand)) {
			return "Flush";
		}
		if (this.isThreeOfAKind(hand)) {
			return "Three of a kind";
		}
		return "High Card";
	}

}
