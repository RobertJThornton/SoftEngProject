package Player;
import DeckStuff.*;
public class PlayerHand{
	Shuffle Shuffler;
	Card[] PlayerCards = new Card[5];
	
	public PlayerHand(Shuffle shuff) {
		Shuffler = shuff;
		
	}
	public void DealHand() {
		for(int i = 0; i<5;i++) {
			
			setCard(i);
		}
	}
	
	public void ReplaceCards(int index) {
		setCard(index);
	}
	
	public void setCard(int numOfCard) {
		PlayerCards[numOfCard] = Shuffler.DealCard();

	}
	
	public Card getCard(int numOfCard) {
		return PlayerCards[numOfCard];
	}
	public Card[] getHand() {
		return PlayerCards;
		
	}
	public void TestHand() {
		for(int i = 0; i<5;i++) {
			System.out.println(PlayerCards[i].GetSuit()+"|"+PlayerCards[i].GetNumber());
		}
	}
	
	public String GetSuit(int suitNum) {
		String suitSt = null;
		
		switch(suitNum) {
		case(1): suitSt = "Diamond:";
		break;
		case(2): suitSt = "Clubs:";
		break;
		case(3): suitSt = "Spade:";
		break;
		case(4): suitSt = "Hearts:";
		break;
		}
		return suitSt;
		
	}
	
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
	
	public String getFullName(int suit, int number) {
		return GetSuit(suit) + GetNumberString(number);
	}
}
