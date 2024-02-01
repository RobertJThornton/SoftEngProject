
public class MainTest {
	
	public static void main(String[] args) {
		CreateDeck mainDeck = new CreateDeck();
		Shuffle Shuffler = new Shuffle(mainDeck);
		Shuffler.TestShuffle();

    }
}
