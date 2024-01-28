package week6JavaFinalProject;

public class Card {
/*
 *   Card
    i.     Fields
 
 		1.     value (contains a value from 2-14 representing cards 2-Ace)
  		2.     name (e.g. Ace of Diamonds, or Two of Hearts)

    ii.    Methods
  		1.     Getters and Setters
		2.     describe (prints out information about a card)

 */
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