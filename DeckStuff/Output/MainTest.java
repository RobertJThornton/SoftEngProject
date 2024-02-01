package Output;

import DeckStuff.*;
import Player.PlayerHand;

public class MainTest {
	
	public static void main(String[] args) {
		CreateDeck mainDeck = new CreateDeck();
		Shuffle Shuffler = new Shuffle(mainDeck);
		PlayerHand Hand = new PlayerHand(Shuffler);
		GUI gui = new GUI();
		Hand.DealHand();
		
		gui.singleCard(Hand.getCard(0).GetSuit(), Hand.getCard(0).GetNumber());
		//Hand.TestHand();
		//Shuffler.TestShuffle();

    }
}
