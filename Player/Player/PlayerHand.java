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
	
	public void TestHand() {
		for(int i = 0; i<5;i++) {
			System.out.println(PlayerCards[i].GetSuit()+"|"+PlayerCards[i].GetNumber());
		}
	}
}
