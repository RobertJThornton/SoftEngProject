package DeckStuff;
public class CreateDeck{
//Loops for 52 cards in a deck giving each one a suit and card number
	Card[] CardDeck = new Card[52]; {
		int temp = 0;
		for(int i = 1; i<5; i++) {
			for(int j=1; j<14; j++) {
				CardDeck[temp] = new Card(i,j,false);
				temp++;
			}
		}
	}
}