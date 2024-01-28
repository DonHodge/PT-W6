package week6JavaFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// Fields
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	
	// Constructor
	Player() {}	// empty constructor for instantiating w/default values
	
	Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;	// Players start a game w/a score of 0
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// Methods
	public void describe() {
		System.out.println(this.name + " has " + this.hand + " cards " +
							"has a score of " + this.score);
	}
	
	public Card flipCard() {
		// Plays the top card in the "hand" deck
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		// pulls a card from the deck & adds it to the hand deck
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		// increases the score
		score++;
	}
	
}
