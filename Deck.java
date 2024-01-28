package week6JavaFinalProject;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
/*
 *  i.     Fields
		1.     cards (List of Card)
	ii.    Methods
  		1.     shuffle (randomizes the order of the cards)
  		
		2.     draw (removes and returns the top card of the Cards field)
		
		3.     In the constructor, when a new Deck is instantiated, the Cards field
			should be populated with the standard 52 cards. 
 */
	
	// Fields
	private List<Card> cards = new ArrayList<Card>();
	private String[] suits = {"Ace", "Club", "Diamond", "Heart"};
	
	// Constructor
	Deck() {
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		for (String suit : suits) {
			for (int number : numbers) {
				cards.add(new Card(number, suit));
			}
		}
	}
	
	// Getters & Setters
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	// Methods
	public void describe() {
		for(Card card : this.cards) card.describe();
	}
	
	public void shuffle() {
		// Collections has a built in shuffle implementation
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		// The top card in a deck will correspond w/index 0
		Card drawnCard = cards.remove(0);
		return drawnCard;
	}
}