package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import DeckStuff.Card;
import DeckStuff.CreateDeck;
import DeckStuff.Shuffle;
import Player.PlayerHand;

import java.io.IOException;

import junit.framework.TestCase;
import org.junit.Test;

public class TestPlayer extends TestCase {

	@Override
	protected void setUp() throws Exception {
		
	}
	
	@Test
	public void testInitial() {
		PlayerHand hand = new PlayerHand();
		assert (hand.handSize()== 5);
	}

	@Test
	public void testDealHand() {
		CreateDeck deck = new CreateDeck();
		Shuffle shuffler = new Shuffle(deck);
		PlayerHand hand = new PlayerHand(shuffler);
		
		System.out.println("-----------PLAYER'S HAND--------------");
		hand.DealHand();
		for (int i = 0; i < 5; i++) {
			Card temp = hand.getCard(i);
			System.out.println(temp.getRank() + "" + temp.getSuit());
		}
		System.out.println("--------------------------------------");
		
		// Deal the hand 5 times to test for randomness
		for (int k = 0; k < 5; k++) {
			hand.DealHand();
			for (int i = 0; i < 5; i++) {
				Card temp = hand.getCard(i);
				System.out.println(temp.getRank() + "" + temp.getSuit());
			}
			System.out.println("--------------------------------------");
		}
		
	}
}
