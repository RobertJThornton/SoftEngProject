	//Creates Card with suit and number
public class Card{

	private int suit;
	private int number;
	//used in shuffle
	private boolean picked;
	
	//Constructor
	Card(int suit, int number,boolean picked){
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
	public Boolean IsPicked() {
		return picked;
	}
	public void SetPicked() {
		picked =true;
	}
	public void SetUnPicked() {
		picked =false;
	}
}