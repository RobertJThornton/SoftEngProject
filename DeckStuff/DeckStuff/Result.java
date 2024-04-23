package DeckStuff;

public class Result {
	Card[] f_checkHand;
	private int f_multi;

	//returns the result of the player hand
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
		else {
			return 0;
		}
	}
	
	//returns result but as a string
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
		else {
			return "You lose";
		}
	}

	//decides credits to add to player credit bank
	public void SetResultCards(Card[] hand, int credits) {
		checkHand = hand;
		sortCard();
		f_multi = credits;
	}

	//determine if hand is royal flush and determine credit return
	public int RoyalFlush() {
		if(f_checkHand[0].GetNumber() == 1
		   && f_checkHand[1].GetNumber() == 10
		   && f_checkHand[2].GetNumber() == 11
		   && f_checkHand[3].GetNumber() == 12
		   && f_checkHand[4].GetNumber() == 13) {
			if(f_multi != 5) {
				return 250 * f_multi;
			}
			else {
				return 4000;
			}
		}
		else {
			return 0;
		}
	}

	//determine if hand is straight flush and determine credit return
	public int StraightFlush() {
		for(int i = 1; i < 5; i++) {
			if(f_checkHand[0].GetSuit() != f_checkHand[i].GetSuit()) {
				return 0;
			}
		}
		for(int i = 0; i < 4; i++) {
			if(f_checkHand[i].GetNumber() != f_checkHand[i+1].GetNumber()-1) {
				return 0;
			}
		}
		return 50 * f_multi;
	}

	//determine if hand is four of a kind and determine credit return
	public int FourOfAKind() {
		if(f_checkHand[0].GetNumber() != f_checkHand[3].GetNumber()
			&& f_checkHand[0].GetNumber() != f_checkHand[3].GetNumber()) {
			return 0;
		}
		else return 25 * f_multi;
	}

	//determine if hand is a full house and determine credit return
	public int FullHouse() {
		if((f_checkHand[0].GetNumber() == f_checkHand[1].GetNumber()
			&& f_checkHand[2].GetNumber() == f_checkHand[4].GetNumber())
			|| (f_checkHand[0].GetNumber() == f_checkHand[2].GetNumber()
			&& f_checkHand[3].GetNumber() == f_checkHand[4].GetNumber())) {
					return 9 * f_multi;
				}
		return 0;
	}

	//determine if hand is a flush and determine credit return
	public int Flush() {
		for(int i = 1; i < 5; i++) {
			if(f_checkHand[0].GetSuit() != f_checkHand[i].GetSuit()) {
				return 0;
			}
		}
		return 6 * f_multi;
	}

	//determine if hand is a straight and determine credit return
	public int Straight() {
		for(int i = 0; i < 4; i++) {
			if(f_checkHand[i].GetNumber() != f_checkHand[i+1].GetNumber()-1) {
				return 0;
			}
		}
		return 4 * f_multi;
	}

	//determine if hand is three of a kind and determine credit return
	public int ThreeOfAKind() {
		if(f_checkHand[0].GetNumber() == f_checkHand[2].GetNumber()
			|| f_checkHand[1].GetNumber() == f_checkHand[3].GetNumber()
			|| f_checkHand[2].GetNumber() == f_checkHand[4].GetNumber()) {
			return 3 * f_multi;
		}
		return 0;
	}

	//determine if hand has two pairs and determine credit return
	public int TwoPair() {
		int pairs = 0;
		for(int i=0; i < 4; i++) {
			if(f_checkHand[i].GetNumber() != f_checkHand[i+1].GetNumber()) {
				pairs++;
			}
		}
		if(pairs == 2) {
			return 2 * f_multi;
		}
		else return 0;
	}

	//determine if hand is has pair of jacks or better and determine credit return
	public int JacksOrBetter() {
		for(int i =0; i < 4; i++) {
			if(f_checkHand[i].GetNumber() == f_checkHand[i+1].GetNumber()
				&& (f_checkHand[i].GetNumber() == 1
				|| f_checkHand[i].GetNumber() == 11
				|| f_checkHand[i].GetNumber() == 12
				|| f_checkHand[i].GetNumber() == 13)) {
				return f_multi;
			}
		}
		return 0;
	}

	//put hand in numerical order
	public void sortCard() {
		for(int l=0; l<6;l++) {
			for(int i=0; i < 4;i++) {		
				if(f_checkHand[i].GetNumber() > f_checkHand[i+1].GetNumber()) {
					Card tempC = f_checkHand[i+1];
					f_checkHand[i+1] = f_checkHand[i];
					f_checkHand[i] = tempC;
				}
			}
		}
	}	
}
