
public class Shuffle{
	public Shuffle() {}
	CreateDeck MainDeck = new CreateDeck();
	
	public Card DealCard(){
		//initilizes dealedCard(used as card holder)
		Card dealedCard=null;
		//initilizes pickable(need for the while loop to find a undealt card)
		boolean pickable=false;
		//initilizes a random number the size of the deck array
		int pickNum = (int)(Math.random()*52);
		
		while (!pickable) {
			
			dealedCard = MainDeck.CardDeck[pickNum];
			//if picked find new random
			if (dealedCard.IsPicked() == true) {
				pickNum = (int)(Math.random()*52);
			}
			//if not picked deal card by breaking loop
			else if(dealedCard.IsPicked() == false) {
				MainDeck.CardDeck[pickNum].SetPicked();
				pickable=true;
			}
		}
		return dealedCard;
	}
	
	public void ShuffleDeck(Card[] cardDeck) {
		for(int i=0; i < 52; i++)
		cardDeck[i].SetUnPicked();
	}
	
	//can take a long time since its dealing 100 cards at once
	public void TestShuffle() {	
		Card dealtCard =null;
		//deals whole deck randomly
		for(int i=0; i< 52; i++) {
			dealtCard = DealCard();
			System.out.println(i+"|"+dealtCard.GetSuit()+","+dealtCard.GetNumber());
		}
		//shuffle test
		ShuffleDeck(MainDeck.CardDeck);
		System.out.println("---");
		//redo dealing
		for(int i=0; i< 52; i++) {
			dealtCard = DealCard();
			System.out.println(i+"|"+dealtCard.GetSuit()+","+dealtCard.GetNumber());
		}
	}
}
