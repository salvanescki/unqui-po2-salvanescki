package ar.edu.unq.po2.tp9.ej4;
import ar.edu.unq.po2.tp9.ej3.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusMockitoTest {
	
	private PokerStatus pokerStatus;
	private Card c1;
	private Card c2;
	private Card c3;
	private Card c4;
	private Card c5;

	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		c1 = mock();
		c2 = mock();
		c3 = mock();
		c4 = mock();
		c5 = mock();
	}
	
	private void setSameSuitToAllCards(CardSuit suit) {
		when(c1.getSuit()).thenReturn(suit);
		when(c2.getSuit()).thenReturn(suit);
		when(c3.getSuit()).thenReturn(suit);
		when(c4.getSuit()).thenReturn(suit);
		when(c5.getSuit()).thenReturn(suit);
		when(c1.isSameSuit(c1)).thenReturn(true);
		when(c2.isSameSuit(c1)).thenReturn(true);
		when(c3.isSameSuit(c1)).thenReturn(true);
		when(c4.isSameSuit(c1)).thenReturn(true);
		when(c5.isSameSuit(c1)).thenReturn(true);
	}
	
	private void setFourAcesToHand() {
		when(c1.getValue()).thenReturn(CardValue.ACE);
		when(c2.getValue()).thenReturn(CardValue.ACE);
		when(c3.getValue()).thenReturn(CardValue.ACE);
		when(c4.getValue()).thenReturn(CardValue.ACE);
		when(c5.getValue()).thenReturn(CardValue.TWO);
	}
	private void setThreeAcesToHand() {
		when(c1.getValue()).thenReturn(CardValue.ACE);
		when(c2.getValue()).thenReturn(CardValue.ACE);
		when(c3.getValue()).thenReturn(CardValue.ACE);
		when(c4.getValue()).thenReturn(CardValue.THREE);
		when(c5.getValue()).thenReturn(CardValue.TWO);
	}
	
	private void setDifferentSuitToFirstFourCards() {
		when(c1.getSuit()).thenReturn(CardSuit.DIAMONDS);
		when(c2.getSuit()).thenReturn(CardSuit.HEARTS);
		when(c3.getSuit()).thenReturn(CardSuit.CLUBS);
		when(c4.getSuit()).thenReturn(CardSuit.SPADES);
		when(c5.getSuit()).thenReturn(CardSuit.DIAMONDS);
	}
	
	private void setDifferentValuesToAllCards() {
		when(c1.getValue()).thenReturn(CardValue.ACE);
		when(c2.getValue()).thenReturn(CardValue.TWO);
		when(c3.getValue()).thenReturn(CardValue.FOUR);
		when(c4.getValue()).thenReturn(CardValue.K);
		when(c5.getValue()).thenReturn(CardValue.FIVE);
	}
	
	private void setFakeFlushHand() {
		when(c1.getSuit()).thenReturn(CardSuit.HEARTS);
		when(c2.getSuit()).thenReturn(CardSuit.HEARTS);
		when(c3.getSuit()).thenReturn(CardSuit.DIAMONDS);
		when(c4.getSuit()).thenReturn(CardSuit.DIAMONDS);
		when(c5.getSuit()).thenReturn(CardSuit.HEARTS);
		when(c1.isSameSuit(c1)).thenReturn(true);
		when(c2.isSameSuit(c1)).thenReturn(true);
		when(c3.isSameSuit(c1)).thenReturn(false);
		when(c4.isSameSuit(c1)).thenReturn(false);
		when(c5.isSameSuit(c1)).thenReturn(true);
	}

	@Test
	void verificarPokerTest() {
		this.setFourAcesToHand();
		this.setDifferentSuitToFirstFourCards();
		
		assertEquals("Poker", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarPokerRepeatedAcesTest() {
		this.setFourAcesToHand();
		this.setDifferentSuitToFirstFourCards();
		when(c3.getSuit()).thenReturn(CardSuit.DIAMONDS);
		when(c3.isSameSuit(c1)).thenReturn(false);

		assertEquals("High Card", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarColorTest() {
		this.setDifferentValuesToAllCards();
		this.setSameSuitToAllCards(CardSuit.HEARTS);
		
		assertEquals("Flush", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarNoColorTest() {
		this.setDifferentValuesToAllCards();
		this.setFakeFlushHand();
		assertEquals("High Card", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
	
	@Test
	void verificarTrioTest() {
		this.setThreeAcesToHand();
		this.setDifferentSuitToFirstFourCards();
		
		assertEquals("Three of a kind", pokerStatus.verify(c1, c2, c3, c4, c5));
	}
}
