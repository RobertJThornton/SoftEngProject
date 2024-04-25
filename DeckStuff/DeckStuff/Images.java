package DeckStuff;

/**
 * The DeckStuff class
 * 
 * @author      Obsidian
 * @version     1.0   
 * @since       1.0       
 */

public class Images {
	
	/**
	 * Return the right file path for the card's image
	 *
	 * @param numbers the card's rank
	 * @param suits the card's suit
	 * @param replace 
	 * @return the appropriate files path for the card
	 */
	
	//diamonds = 1, clubs = 2, spades = 3, hearts = 4
	public static String cardIm(int numbers, int suits, int replace) {
		System.out.println(numbers + " " + suits);
		if (suits == 1) {
			System.out.println("Diamonds");
			if (numbers == 1) {
				return "/AofDiamonds.png";
			}
			else if (numbers == 2) {
				return "/2ofDiamonds.png";
			}
			else if (numbers == 3) {
				return "/3ofDiamonds.png";
			}
			else if (numbers == 4) {
				return "/4ofDiamonds.png";
			}
			else if (numbers == 5) {
				return "/5ofDiamonds.png";
			}
			else if (numbers == 6) {
				return "/6ofDiamonds.png";
			}
			else if (numbers == 7) {
				return "/7ofDiamonds.png";
			}
			else if (numbers == 8) {
				return "/8ofDiamonds.png";
			}
			else if (numbers == 9) {
				return "/9ofDiamonds.png";
			}
			else if (numbers == 10) {
				return "/10ofDiamonds.png";
			}
			else if (numbers == 11) {
				return "/JofDiamonds.png";
			}
			else if (numbers == 12) {
				return "/QofDiamonds.png";
			}
			else if (numbers == 13) {
				return "/KofDiamonds.png";
			}	
			else { return "/Bug.png"; }
		}
		else if (suits == 2) {
			System.out.println("Clubs");
			if (numbers == 1) {
				return "/AofClubs.png";
			}
			else if (numbers == 2) {
				return "/2ofClubs.png";
			}
			else if (numbers == 3) {
				return "/3ofClubs.png";
			}
			else if (numbers == 4) {
				return "/4ofClubs.png";
			}
			else if (numbers == 5) {
				return "/5ofClubs.png";
			}
			else if (numbers == 6) {
				return "/6ofClubs.png";
			}
			else if (numbers == 7) {
				return "/7ofClubs.png";
			}
			else if (numbers == 8) {
				return "/8ofClubs.png";
			}
			else if (numbers == 9) {
				return "/9ofClubs.png";
			}
			else if (numbers == 10) {
				return "/10ofClubs.png";
			}
			else if (numbers == 11) {
				return "/JofClubs.png";
			}
			else if (numbers == 12) {
				return "/QofClubs.png";
			}
			else if (numbers == 13) {
				return "/KofClubs.png";
			}	
			else { return "/Bug.png"; }
		}
		else if (suits == 3) {
			if (numbers == 1) {
				return "/AofSpades.png";
			}
			else if (numbers == 2) {
				return "/2ofSpades.png";
			}
			else if (numbers == 3) {
				return "/3ofSpades.png";
			}
			else if (numbers == 4) {
				return "/4ofSpades.png";
			}
			else if (numbers == 5) {
				return "/5ofSpades.png";
			}
			else if (numbers == 6) {
				return "/6ofSpades.png";
			}
			else if (numbers == 7) {
				return "/7ofSpades.png";
			}
			else if (numbers == 8) {
				return "/8ofSpades.png";
			}
			else if (numbers == 9) {
				return "/9ofSpades.png";
			}
			else if (numbers == 10) {
				return "/10ofSpades.png";
			}
			else if (numbers == 11) {
				return "/JofSpades.png";
			}
			else if (numbers == 12) {
				return "/QofSpades.png";
			}
			else if (numbers == 13) {
				return "/KofSpades.png";
			}	
			else { return "/Bug.png"; }
		}
		else if (suits == 4){
			if (numbers == 1) {
				return "/AofHearts.png";
			}
			else if (numbers == 2) {
				return "/2ofHearts.png";
			}
			else if (numbers == 3) {
				return "/3ofHearts.png";
			}
			else if (numbers == 4) {
				return "/4ofHearts.png";
			}
			else if (numbers == 5) {
				return "/5ofHearts.png";
			}
			else if (numbers == 6) {
				return "/6ofHearts.png";
			}
			else if (numbers == 7) {
				return "/7ofHearts.png";
			}
			else if (numbers == 8) {
				return "/8ofHearts.png";
			}
			else if (numbers == 9) {
				return "/9ofHearts.png";
			}
			else if (numbers == 10) {
				return "/10ofHearts.png";
			}
			else if (numbers == 11) {
				return "/JofHearts.png";
			}
			else if (numbers == 12) {
				return "/QofHearts.png";
			}
			else if (numbers == 13) {
				return "/KofHearts.png";
			}	
			else { return "/Bug.png"; }
		}
		else {
			return "/Bug.png";
		}
	}
}
