package DeckStuff;
import java.util.*;

/**
 * @author      Obsidian
 * @version     1.0   
 * @since       1.0       
 */

//Creates Card with suit and number
public class Card{

	/** The f suit. */
	//suit and number of the card and whether is has been picked
	private int f_suit;
	
	/** The f number. */
	private int f_number;
	
	/** The f picked. */
	private boolean f_picked;
	
	/**
	 * Instantiates a new card.
	 *
	 * @param suit the suit of the card
	 * @param number the rank of the card
	 * @param picked the pick state of the card
	 */
	
	//Constructor
	public Card(int suit, int number, boolean picked){
		this.f_suit = suit;
		this.f_number = number;
		this.f_picked = picked;
	}
	
	/**
	 * Instantiates a new card.
	 */
	// Empty constructor
	public Card() {
		this.f_suit = 0;
		this.f_number = 0;
		this.f_picked = false;
	}
	
	/**
	 * Gets the suit.
	 *
	 * @return the card's suit in int
	 */
	//GetsSuit 1-4 represents the house
	public int GetSuit(){
		return f_suit;
	}
	
	/**
	 * Gets the number.
	 *
	 * @return the card's rank in int 
	 */
	//Gets Number 1-13, 1 is Ace, 11-13 are jack,king,queen
	public int GetNumber(){
		return f_number;
	}
	
	/**
	 * Gets the suit.
	 *
	 * @return the card's suit in written form
	 */
	public String getSuit() {
		String suitSt = null;
		
		switch(this.f_suit) {
			case(1): 
				suitSt = " of Diamonds";
				break;
			case(2): 
				suitSt = " of Clubs";
				break;
			case(3): 
				suitSt = " of Spades";
				break;
			case(4): 
				suitSt = " of Hearts";
				break;
			default:
				suitSt = "Error";
		}
		
		return suitSt;
	}
	
	/**
	 * Gets the rank.
	 *
	 * @return the card's rank in written form
	 */
	public String getRank() {
		String numSt = null;
		switch(f_number) {
			case(1):
				numSt = "Ace";
			case(11):
				numSt = "Jack";
			case(12):
				numSt = "Queen";
			case(13):
				numSt = "King";
			default:
				numSt = String.valueOf(f_number);
		}	
		
		return numSt;
	}
	
	
	/**
	 * Checks if the card is picked.
	 *
	 * @return true if the card was picked, false if the card hasn't been picked
	 */
	//returns if the card has already been drawn or not
	public Boolean IsPicked() {
		return f_picked;
	}
	
	/**
	 * Sets the pick state to true
	 */
	//sets if drawn
	public void SetPicked() {
		f_picked = true;
	}
	
	/**
	 * Sets the pick state to false
	 */
	//resets to undrawn
	public void SetUnPicked() {
		f_picked = false;
	}
	
}
