package DeckStuff;
import java.util.*;


//Creates Card with suit and number
public class Card{

	private int suit;
	private int number;
	//used in shuffle
	private boolean picked;
	
	//Constructor
	public Card(int suit, int number, boolean picked){
		this.suit = suit;
		this.number = number;
		this.picked = false;
	}
	
	//GetsSuit 1-4 represents the house
	public int GetSuit(){
		return suit;
	}
	//Gets Number 1-13, 1 is Ace, 11-13 are jack,king,queen
	public int GetNumber(){
		return number;
	}
	
	public String getSuit() {
		String suitSt = null;
		
		switch(this.suit) {
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
		switch(number) {
			case(1):
				numSt = "Ace";
			case(11):
				numSt = "Jack";
			case(12):
				numSt = "Queen";
			case(13):
				numSt = "King";
			default:
				numSt = String.valueOf(number);
		}	
		
		return numSt;
	}
	
	
	//returns if the card has already been drawn or not
	public Boolean IsPicked() {
		return picked;
	}
	//sets if drawn
	public void SetPicked() {
		picked =true;
	}
	//resets to undrawn
	public void SetUnPicked() {
		picked =false;
	}
}