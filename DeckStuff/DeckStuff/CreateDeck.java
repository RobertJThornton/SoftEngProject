package DeckStuff;
public class CreateDeck{
	//create empty instance of Card
	Card[] CardDeck = new Card[52]; 
	//Loops for 52 cards in a deck giving each one a suit and card number
	public CreateDeck() {
		int temp = 0;
		for(int i = 1; i<5; i++) {
			for(int j=1; j<14; j++) {
				CardDeck[temp] = new Card(i,j,false);
				temp++;
			}
		}
	}
	//sends the created deck
	public Card[] getDeck() {
		return CardDeck;
	}
	
	public Card getCard(int position) {
		return CardDeck[position];
	}
}

