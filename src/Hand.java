import java.util.ArrayList;
import java.util.Collections;

public class Hand {
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	public Hand() {
		Deck ourDeck = new Deck();
		for (int i = 0; i<5; i++){
			Card newCard = ourDeck.drawFromDeck();
			hand.add(newCard);
		}
	}
		
		public ArrayList<Card> getHand(){
			return hand;
		}
		
		public void sortHand(){
			Collections.sort(hand);
			
		}	
		
		
		
	//Begin to create scoring system methods (need a minimum of three so far)
		
		public boolean fullHouse(){
			return ( (hand.get(0).getRank() == hand.get(2).getRank() &&
					hand.get(3).getRank() == hand.get(4).getRank() ) ||
					(hand.get(0).getRank() == hand.get(1).getRank() &&
					hand.get(2).getRank() == hand.get(4).getRank()) );
		}
		
		public boolean regFlush(){
			return ((hand.get(0).getSuit() == hand.get(1).getSuit()) &&
					(hand.get(1).getSuit() == hand.get(2).getSuit()) &&
					(hand.get(2).getSuit() == hand.get(3).getSuit()) &&
					(hand.get(3).getSuit() == hand.get(4).getSuit()) );
		}
		
		public boolean onePair(){
			return ((hand.get(0).getRank() == hand.get(1).getRank()) ||
					(hand.get(1).getRank() == hand.get(2).getRank()) ||
					(hand.get(2).getRank() == hand.get(3).getRank()) ||
					(hand.get(3).getRank() == hand.get(4).getRank()) );
		}
		
		public boolean threeOfAKind(){
			return ((hand.get(0).getRank() == hand.get(2).getRank()) ||
					(hand.get(1).getRank() == hand.get(3).getRank()) ||
					(hand.get(2).getRank() == hand.get(4).getRank()) );
					
		}
		
}		

			