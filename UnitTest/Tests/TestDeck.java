package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import DeckStuff.*;

import java.io.IOException;
import junit.framework.TestCase;

public class TestDeck extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		
	}
	
	@Test
	public void testInitialCard() {
		Card testCard = new Card();
		boolean testResult = (testCard.GetSuit() == 0) && 
							 (testCard.GetNumber() == 0) &&
							 (testCard.IsPicked() == false);
		assert testResult;
	}
	
	@Test
	public void testInitialDeck() {
		CreateDeck deck = new CreateDeck();
		Card[] initDeck = deck.getDeck();
		
		assert(initDeck.length == 52);
	}
	
	@Test
	// Visual test.
	public void testDeckPreShuffle() {
		CreateDeck testDeck = new CreateDeck();
		System.out.println("-----------PRE-SHUFFLE TEST---------");
		for (int i = 0; i < 52; i++) {
			Card temp = testDeck.getCard(i);
			System.out.println(temp.getRank() + "" + temp.getSuit());
		}
		System.out.println("------------------------------------");
	}
	
	@Test
	// Visual test.
	public void testShuffle() {
		CreateDeck deck = new CreateDeck();
		Shuffle shuffler = new Shuffle(deck);
		Card tempCard;
		System.out.println("-----------SHUFFLE TEST---------");
		for (int i = 0; i < 52; i++) {
			tempCard = shuffler.DealCard();
			System.out.println(tempCard.getRank() + "" + tempCard.getSuit());
		}
		System.out.println("--------------------------------");
	}
}
