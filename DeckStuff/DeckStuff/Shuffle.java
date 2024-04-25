package DeckStuff;

/**
 * @author      Obsidian
 * @version     1.0   
 * @since       1.0       
 */

public class Shuffle{
	
	CreateDeck f_mainDeck;
	
	/**
	 * Pass in the deck to the shuffler
	 *
	 * @param md the deck
	 */
	public Shuffle(CreateDeck md) {
		f_mainDeck = md;
	}
	
	/**
	 * Deal card.
	 *
	 * @return a random card from the deck
	 */
	public Card DealCard(){
		//initilizes dealedCard(used as card holder)
		Card dealedCard = null;
		//initilizes a random number the size of the deck array
		int pickNum = (int)(Math.random()*52);
		
		//initilizes pickable(need for the while loop to find a undealt card)
		boolean pickable = false;
		//loops while looking for a card that can be picked and breaks after finding one
		while (!pickable) {
			
			dealedCard = f_mainDeck.CardDeck[pickNum];
			//if picked find new random
			if (dealedCard.IsPicked() == true) {
				pickNum = (int)(Math.random() * 52);
			}
			//if not picked deal card by breaking loop
			else if(dealedCard.IsPicked() == false) {
				f_mainDeck.CardDeck[pickNum].SetPicked();
				pickable = true;
			}
		}
		return dealedCard;
	}
	
	/**
	 * Shuffle deck.
	 *
	 * @param cardDeck the card deck
	 */
	//shuffles by setting each one to unpicked
	public void ShuffleDeck(Card[] cardDeck) {
		for(int i=0; i < 52; i++)
		cardDeck[i].SetUnPicked();
	}
}
