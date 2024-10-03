package ar.edu.unq.po2.tp9.ej3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	private PokerStatus pokerStatus;
	private Card c1;
	private Card c2;
	private Card c3;
	private Card c4;
	private Card c5;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void verificarPokerTest() {
		c1 = new Card(CardValue.A, CardSuit.DIAMONDS);
		c2 = new Card(CardValue.A, CardSuit.HEARTS);
		c3 = new Card(CardValue.A, CardSuit.CLUBS);
		c4 = new Card(CardValue.A, CardSuit.SPADES);
		c5 = new Card(CardValue.2, CardSuit.DIAMONDS);
		assertEquals("Poker", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarPokerRepeatedAcesTest() {
		c1 = new Card(CardValue.A, CardSuit.DIAMONDS);
		c2 = new Card(CardValue.A, CardSuit.HEARTS);
		c3 = new Card(CardValue.A, CardSuit.CLUBS);
		c4 = new Card(CardValue.A, CardSuit.SPADES);
		c5 = new Card(CardValue.2, CardSuit.HEARTS);
		assertEquals("Poker", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarColorTest() {
		c1 = new Card(CardValue.A, CardSuit.HEARTS);
		c2 = new Card(CardValue.2, CardSuit.HEARTS);
		c3 = new Card(CardValue.4, CardSuit.HEARTS);
		c4 = new Card(CardValue.K, CardSuit.HEARTS);
		c5 = new Card(CardValue.5, CardSuit.HEARTS);
		assertEquals("Flush", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarNoColorTest() {
		c1 = new Card(CardValue.A, CardSuit.HEARTS);
		c2 = new Card(CardValue.2, CardSuit.CLUBS);
		c3 = new Card(CardValue.4, CardSuit.SPADES);
		c4 = new Card(CardValue.K, CardSuit.HEARTS);
		c5 = new Card(CardValue.5, CardSuit.CLUBS);
		assertEquals("High Card", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarTrioTest() {
		c1 = new Card(CardValue.A, CardSuit.DIAMONDS);
		c2 = new Card(CardValue.A, CardSuit.HEARTS);
		c3 = new Card(CardValue.4, CardSuit.CLUBS);
		c4 = new Card(CardValue.A, CardSuit.SPADES);
		c5 = new Card(CardValue.2, CardSuit.HEARTS);
		assertEquals("Three of a kind", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
}
