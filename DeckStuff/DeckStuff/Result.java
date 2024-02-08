package DeckStuff;
public class Result {
	
	Card[] checkHand;
	int multi;
	
	public int GetResult() {

	if(RoyalFlush() != 0) {
		return RoyalFlush();
	}
	if(StraightFlush() !=0) {
		return StraightFlush();
	}
	if(FourOfAKind() != 0) {
		return FourOfAKind();
	}
	if(FullHouse() != 0) {
		return FullHouse();
	}
	if(Flush() != 0) {
		return Flush();
	}
	if(Straight() != 0) {
		return Straight();
	}
	if(ThreeOfAKind() != 0) {
		return ThreeOfAKind();
	}
	if(TwoPair() != 0) {
		return TwoPair();
	}
	if(JacksOrBetter() != 0) {
		return JacksOrBetter();
	}
	
	return 0;
	}
	
	public String GetResultName() {
		
		if(RoyalFlush() != 0) {
			return "Royal Flush";
		}
		if(StraightFlush() !=0) {
			return "Straight Flush";
		}
		if(FourOfAKind() != 0) {
			return "Four Of A Kind";
		}
		if(FullHouse() != 0) {
			return "Full House";
		}
		if(Flush() != 0) {
			return "Flush";
		}
		if(Straight() != 0) {
			return "Straight";
		}
		if(ThreeOfAKind() != 0) {
			return "Three Of A Kind";
		}
		if(TwoPair() != 0) {
			return "Two Pairs";
		}
		if(JacksOrBetter() != 0) {
			return "Jacks Or Better";
		}
		
		return "You lose";
		}
	
	public void SetResultCards(Card[] hand,int credits) {
		checkHand = hand;
		sortCard();
		multi = credits;
	}
	public int RoyalFlush() {
		if(checkHand[0].GetNumber() == 1
		   && checkHand[1].GetNumber() == 10
		   && checkHand[2].GetNumber() == 11
		   && checkHand[3].GetNumber() == 12
		   && checkHand[4].GetNumber() == 13) {
			if(multi != 5)
			return 250 * multi;
			else return 4000;
		}
		else return 0;
	}
	
	public int StraightFlush() {
		for(int i = 1; i < 5; i++) {
			if(checkHand[0].GetSuit() != checkHand[i].GetSuit()) {
				return 0;
			}
		}
		for(int i = 0; i < 4; i++) {
			if(checkHand[i].GetNumber() != checkHand[i+1].GetNumber()-1) {
				return 0;
			}
		}
		return 50 * multi;
	}
	
	public int FourOfAKind() {
		if(checkHand[0].GetNumber() != checkHand[3].GetNumber()
			&& checkHand[0].GetNumber() != checkHand[3].GetNumber()) {
			return 0;
		}
		else return 25 * multi;
	}
	
	public int FullHouse() {
		if((checkHand[0].GetNumber() == checkHand[1].GetNumber()
			&& checkHand[2].GetNumber() == checkHand[4].GetNumber())
			|| (checkHand[0].GetNumber() == checkHand[2].GetNumber()
			&& checkHand[3].GetNumber() == checkHand[4].GetNumber())) {
					return 9 * multi;
				}
		return 0;
	}
	
	public int Flush() {
		for(int i = 1; i < 5; i++) {
			if(checkHand[0].GetSuit() != checkHand[i].GetSuit()) {
				return 0;
			}
		}
		return 6 * multi;
	}
	
	public int Straight() {
		for(int i = 0; i < 4; i++) {
			if(checkHand[i].GetNumber() != checkHand[i+1].GetNumber()-1) {
				return 0;
			}
		}
		return 4*multi;
	}
	
	public int ThreeOfAKind() {
		if(checkHand[0].GetNumber() == checkHand[2].GetNumber()
			|| checkHand[1].GetNumber() == checkHand[3].GetNumber()
			|| checkHand[2].GetNumber() == checkHand[4].GetNumber()) {
			return 3 * multi;
		}
		return 0;
	}
	
	public int TwoPair() {
		int pairs = 0;
		for(int i=0; i < 4; i++) {
			if(checkHand[i].GetNumber() != checkHand[i+1].GetNumber()) {
				pairs++;
			}
		}
		if(pairs ==2) {
			return 2 * multi;
		}
		else return 0;
	}
	
	public int JacksOrBetter() {
		for(int i =0; i < 4; i++) {
			if(checkHand[i].GetNumber() == checkHand[i+1].GetNumber()
				&& (checkHand[i].GetNumber() == 1
				|| checkHand[i].GetNumber() == 11
				|| checkHand[i].GetNumber() == 12
				|| checkHand[i].GetNumber() == 13)) {
				return multi;
			}
		}
		return 0;
	}
	
	public void sortCard() {
		for(int l=0; l<6;l++) {
			for(int i=0; i < 4;i++) {		
				if(checkHand[i].GetNumber() > checkHand[i+1].GetNumber()) {
					Card tempC = checkHand[i+1];
					checkHand[i+1] = checkHand[i];
					checkHand[i] = tempC;
				}
			}
		}
	}
}
