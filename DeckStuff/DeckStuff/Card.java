package DeckStuff;
import java.util.*;

//Creates Card with suit and number
public class Card{

	//suit and number of the card and whether is has been picked
	private int f_suit;
	private int f_number;
	private boolean f_picked;
	
	//Constructor
	public Card(int suit, int number, boolean picked){
		this.f_suit = suit;
		this.f_number = number;
		this.f_picked = picked;
	}
	
	// Empty constructor
	public Card() {
		this.f_suit = 0;
		this.f_number = 0;
		this.f_picked = false;
	}
	
	//GetsSuit 1-4 represents the house
	public int GetSuit(){
		return f_suit;
	}
	//Gets Number 1-13, 1 is Ace, 11-13 are jack,king,queen
	public int GetNumber(){
		return f_number;
	}
	
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
	
	
	//returns if the card has already been drawn or not
	public Boolean IsPicked() {
		return f_picked;
	}
	//sets if drawn
	public void SetPicked() {
		f_picked = true;
	}
	//resets to undrawn
	public void SetUnPicked() {
		f_picked = false;
	}
	
}
