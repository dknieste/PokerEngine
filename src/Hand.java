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
		
	//Begin to create scoring system
		public static int[] handScore(ArrayList<Card> hand){
			if hand[]
		
	}
			
}