package Output;
 
public class GUI {

	public void TempGUI(){
		
	}
	public void singleCard(int suit,int num) {
		topCard();
		middleCard(suit,num);
		bottomCard();
	}
	public void topCard() {
		System.out.println(" |----------| ");
		for(int i=0; i<2;i++);
		System.out.println();
	}
	public void middleCard(int suit, int num) {
		System.out.println("  Suit: " + TranslateSuit(suit));
		System.out.println("   Number: " + TranslateNumber(num));
	}
	public void bottomCard() {
		for(int i=0; i<2;i++);
		System.out.println();
		System.out.println(" |----------| ");
	}
	
	public String TranslateSuit(int suit) {
		String suitName="";
		
		switch(suit){
		case 1:	suitName = "Hearts";
			break;
		case 2:	suitName = "Spade";
			break;
		case 3:	suitName = "Diamond";
			break;
		case 4:	suitName = "Clubs";
			break;	
		}
		return suitName;
	}
	
	public String TranslateNumber(int num) {
		String numName="";
		if(num == 1)
			numName = "ACE";
		else if(num < 11)
			numName = String.valueOf(num);
		else
		switch(num){
		case 11:	numName = "Jack";
			break;
		case 12:	numName = "Queen";
			break;
		case 13:	numName = "King";
			break;
		}
		return numName;
}
}
