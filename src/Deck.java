import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.UUID;

public class Deck {

	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	private Deck() {

		for (int i = 0; i < 4; i++) {
			eSuit suit = eSuit.values()[i];
			for (int j = 0; j < 14; j++) {
				eRank rank = eRank.values()[j];
				DeckCards.add(new Card(suit, rank));
			}

		}

	}
	
	Collections.system(DeckCards);
	
	/*private Deck(int numberOfJokers) {
		this();
		for (int k = 0; k < numberOfJokers; k++) {
			eSuit suit = eSuit.values()[4];
			eRank rank = eRank.values()[99];
		}
	}*/
	
}


//private int NumberOfCards{ return NumberOfCards; }

/*
 * 
 * private UUID DeckNumber;
 * 
 * 
 * 
 * 
 * 
 * } }
 * 
 * //Draw a card public Card draw() { Card c = DeckCards.get(0);
 * DeckCards.remove(c);
 * 
 * return c; }
 * 
 * public int NbrOfCards() { return DeckCards.size(); }
 */