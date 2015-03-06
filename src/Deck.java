import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.UUID;

public class Deck {

	private UUID DeckNumber;

	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	
	//Creates and shuffles a deck
	public Deck() {

		for (int i = 0; i < 4; i++) {
			eSuit suit = eSuit.values()[i];
			for (int j = 0; j < 14; j++) {
				eRank rank = eRank.values()[j];
				DeckCards.add(new Card(suit, rank));
			}

		}

		Collections.shuffle(DeckCards);
	}

	// Draws a card and removes it from deck
	public Card drawFromDeck() {
		Card c = DeckCards.get(0);
		DeckCards.remove(c);
		return c;
	}

	// Finds number of cards remaining
	public int cardsRemaining() {
		return DeckCards.size();
	}

	
	/*
	 * Saved for later when we add jokers...
	 * private Deck(int numberOfJokers) { this(); for (int k = 0; k <
	 * numberOfJokers; k++) { eSuit suit = eSuit.values()[4]; eRank rank =
	 * eRank.values()[99]; } }
	 */

}
