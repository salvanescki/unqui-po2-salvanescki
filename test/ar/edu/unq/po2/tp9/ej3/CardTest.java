package ar.edu.unq.po2.tp9.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CardTest {
	
	private Card card;

	@BeforeEach
	void setUp() throws Exception {
		card = new Card(CardValue.ACE, CardSuit.DIAMONDS);
	}
	
	@Test
	void valueTest() {
		assertEquals(CardValue.ACE, card.getValue());
	}
	
	@Test
	void suitTest() {
		assertEquals(CardSuit.DIAMONDS, card.getSuit());
	}
	
	@Test
	void rankingTest() {
		Card lowerCard = new Card(CardValue.K, CardSuit.HEARTS);
		assertEquals(1, card.compareTo(lowerCard));
	}
	
	@Test
	void sameSuitTest() {
		Card sameSuitCard = new Card(CardValue.K, CardSuit.DIAMONDS);
		assertTrue(card.isSameSuit(sameSuitCard));
	}

}
