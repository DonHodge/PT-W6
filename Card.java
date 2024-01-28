package week6JavaFinalProject;

public class Card {
	// Fields
	private int value;
	private String name;
	
	// Constructor
	Card(int value, String suit) {
		this.value = value;
		
		// Used a switch statement to coordinate
		// the numerical value with a statement
		switch (value) {
			case 2:
				name = "Two";
				break;
			case 3:
				name = "Three";
				break;
			case 4:
				name = "Four";
				break;
			case 5:
				name = "Five";
				break;
			case 6:
				name = "Six";
				break;
			case 7:
				name = "Seven";
				break;
			case 8:
				name = "Eight";
				break;
			case 9:
				name = "Nine";
				break;
			case 10:
				name = "Ten";
				break;
			case 11:
				name = "Jack";
				break;
			case 12:
				name = "Queen";
				break;
			case 13:
				name = "King";
				break;
			case 14:
				name = "Ace";
				break;
		}
		// concatenate the name w/the suit type
		name += " of " + suit;
	}
	
	public String toString() {
		return name;
	}
	
	// Getters & Setters
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(String name) {
		this.name = name;
	}
	
	// Methods
	public void describe() {
		System.out.println(name);
	}
}
