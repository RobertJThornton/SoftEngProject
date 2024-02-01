package DeckStuff;

//Creates Card with suit and number
public class Card{

	private int suit;
	private int number;
	//used in shuffle
	private boolean picked;
	
	//Constructor
	public Card(int suit, int number,boolean picked){
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