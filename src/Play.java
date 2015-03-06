public class Play {
	public static void main(String[] args) {

		System.out.println("Dealing your cards now... ");

		Deck deck = new Deck();
		Hand handOne = new Hand();
		Hand handTwo = new Hand();
		
		System.out.println("Evaluating the hands... ");
		
		//Run both hands through evaluation method in Hand
		
		if (handOneScore > handTwoScore())
			System.out.println("Player 1 wins!");
		if (handOneScore() < handTwoScore())
			System.out.println("Player 2 wins!");
		else
			//here the program would go on to look at high cards, kickers, etc

	}

}