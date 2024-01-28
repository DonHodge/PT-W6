package week6JavaFinalProject;

public class App {

	public static void main(String[] args) {
		
		// Deck instantiated & shuffled to begin the game
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("The deck is live\n");
		
		// Instantiating players & setting names
		Player player1 = new Player();
		player1.setName("Player 1");
		
		Player player2 = new Player();
		player2.setName("Player 2");
		
		// For loop iterates through entire length of standard deck
		// At even values of 'i', player1 draws a card; player 2 draws at odd
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) player1.draw(deck);
			else player2.draw(deck);
		}
		
		// Checking if both players have decks
		boolean p1HasDeck = !player1.getHand().isEmpty();
		boolean p2HasDeck = !player2.getHand().isEmpty();
		
		if (p1HasDeck) System.out.println("Player 1 has a hand & is ready to play");
		if (p2HasDeck) System.out.println("Player 2 has a hand & is ready to play\n");
		
		// Game begins
		System.out.println("Let's play WAR\n-----------------------------");
		
		int round = 1;	// round iterator outside of for loop
		
		// For loop iterates through the length of the game
		// With 2 players, the game will last 26 rounds (52 / 2)
		for (int i = 0; i < 26; i++) {
			
			
			System.out.println("Round " + round + ":\n----------------------");
			
			// Players play their cards
			Card p1Card = player1.flipCard();
			System.out.print(player1.getName() + " played: ");
			p1Card.describe();
			
			Card p2Card = player2.flipCard();
			System.out.print(player2.getName() + " played: ");
			p2Card.describe();
			System.out.println();
			
			// if-else statement compares the card values in each round
			if (p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println("Winner of Round " + round + "~ " + player1.getName());
			} else if (p1Card.getValue() < p2Card.getValue()) {
				player2.incrementScore();
				System.out.println("Winner of Round " + round + ": " + player1.getName());
			} else if (p1Card.getValue() == p2Card.getValue()) System.out.println("Round " + round + " is a draw");
			
			// print the current score at the end of each round
			System.out.print("Current Score \n\t" + player1.getName() + ":  " + player1.getScore());
			System.out.println("\n\t " + player2.getName() + ":  " + player2.getScore());
			
			round++;
		}
		
		// Calculate final score at the end of game
		int p1FinalScore = player1.getScore();
		int p2FinalScore = player2.getScore();
		
		// notification at the end of the game
		System.out.println("\n\t\t End of Match!!!!");
		// compare final scores to determine the winner
		if (p1FinalScore > p2FinalScore) System.out.println("\t\t" + player1.getName() + " is the WINNER!!!");
		else if (p1FinalScore < p2FinalScore) System.out.println("\t\t" + player2.getName() + " is the WINNER!!!");
		else if (p1FinalScore == p2FinalScore) System.out.println("\t\t" +"It's a draw, though there are never any winners in WAR");
	}

}