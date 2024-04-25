package Player;
import DeckStuff.*;

/**
 * The PlayerHand class.
 * 
 * @author      Obsidian
 * @version     1.0   
 * @since       1.0       
 */

public class PlayerHand{
	
	/** The Shuffler. */
	Shuffle Shuffler;
	
	/** The Player cards. */
	Card[] PlayerCards = new Card[5];
	
	/**
	 * Pass in the Shuffle
	 *
	 * @param shuff the shuffler
	 */
	public PlayerHand(Shuffle shuff) {
		Shuffler = shuff;
	}
	
	/** PlayerHand empty constructor*/
	// Empty construstor
	public PlayerHand() {
		
	}
	
	/**
	 * Deal hand.
	 */
	public void DealHand() {
		for(int i = 0; i<5;i++) {
			setCard(i);
		}
	}
	
	/**
	 * Replace cards.
	 *
	 * @param index the index of the card to be replace
	 */
	public void ReplaceCards(int index) {
		setCard(index);
	}
	
	/**
	 * Deal new cards once the player removed it
	 *
	 * @param index the number of card to be replace
	 */
	public void setCard(int index) {
		PlayerCards[index] = Shuffler.DealCard();

	}
	
	/**
	 * Gets one card from the player hand
	 *
	 * @param index the position of the card to return
	 * @return the card at the index
	 */
	public Card getCard(int index) {
		return PlayerCards[index];
	}
	
	/**
	 * Get the whole hand.
	 *
	 * @return the hand
	 */
	public Card[] getHand() {
		return PlayerCards;
		
	}
	
	/**
	 * Return the suit in written form
	 *
	 * @param suitNum the suit (1 = Diamond, 2 = Club, 3 = Spade, 4 = Heart)
	 * @return the string
	 */
	public String GetSuit(int suitNum) {
		String suitSt = null;
		
		switch(suitNum) {
		case(1): suitSt = " of Diamonds";
		break;
		case(2): suitSt = " of Clubs";
		break;
		case(3): suitSt = " of Spades";
		break;
		case(4): suitSt = " of Hearts";
		break;
		}
		return suitSt;	
	}
	
	/**
	 * Get the rank in written form 
	 *
	 * @param number the rank (1 = Ace, 11 = Jack, 12 = Queen, 13 = King)
	 * @return the rank 
	 */
	public String GetNumberString(int number) {
		String numberSt = null;
		if(number > 1 && number < 11)
			numberSt = String.valueOf(number);
		else {
		switch(number) {
		case(1): numberSt = "Ace";
		break;
		case(11): numberSt = "Jack";
		break;
		case(12): numberSt = "Queen";
		break;
		case(13): numberSt = "King";
		break;
		}
		}
		return numberSt;
	}
	
	/**
	 * Gets the full name of the card
	 *
	 * @param number the rank
	 * @param suit the suit
	 * @return the full name
	 */
	public String getFullName(int number, int suit) {
		return GetNumberString(number) + GetSuit(suit);//GetSuit(suit) + GetNumberString(number);
	}
	
	/**
	 * Hand size.
	 *
	 * @return the player's hand size
	 */
	public int handSize() {
		return PlayerCards.length;
	}
}
