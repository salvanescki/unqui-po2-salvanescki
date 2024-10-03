package ar.edu.unq.po2.tp9.ej5;

public class Card implements Comparable<Card> {

	private CardValue value;
	private CardSuit suit;

	public Card(CardValue value, CardSuit suit) {
		this.value = value;
		this.suit = suit;
	}

	public CardValue getValue() {
		return value;
	}

	public CardSuit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card o) {
		return Integer.compare(this.getValue().ordinal(), o.getValue().ordinal());
	}

	public boolean isSameSuit(Card other) {
		return this.getSuit() == other.getSuit();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;

		Card otherCard = (Card) o;
		return this.getValue() == otherCard.getValue() && this.getSuit() == otherCard.getSuit();
	}

}
