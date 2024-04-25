package DeckStuff;

/**
 * The CreateDeck class.
 * 
 * @author      Obsidian
 * @version     1.0   
 * @since       1.0       
 */

public class CreateDeck{
	
	//create empty array of 52 cards
	Card[] CardDeck = new Card[52]; 
	
	/**
	 * Populate the deck with cards
	 */
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
	
	/**
	 * Gets the deck.
	 *
	 * @return a Card array of 52
	 */
	
	//sends the created deck
	public Card[] getDeck() {
		return CardDeck;
	}
	
	/**
	 * Gets a card in the deck
	 *
	 * @param position the position of the card within the deck
	 * @return the card at the position
	 */
	
	public Card getCard(int position) {
		return CardDeck[position];
	}
}

