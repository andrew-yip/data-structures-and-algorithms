// card class

package HW02Classes;

public class Card { // think of it as a blueprint of card object

	// Data Members: Attributes (what we need to describe the blueprint)
	private int rank; // initialize in the beginning // instance var
	private int suit; // initialize in the beginning
	private boolean isFaceUp; // is faceup?

	// Constructor (EXPLICIT)
	public Card(int r, int s) { // explicit constructor of a card // creating card object
		this.rank = r; // setting 'r' as rank (data member)
		this.suit = s;
		this.isFaceUp = false;
	}

	// BEHAVIOR
	// CREATE A STRING THAT DESCRIBES THE CARD
	public String toString() { // returning a string because a toString method
		String value = ""; // empty string
		switch (rank) {
		case 1:
			value += "ACE"; // basically saying if rank = 1, add ace to it
			break;
		case 2:
			value += "TWO"; // if rank == 2, 'two '
			break;
		case 3:
			value += "THREE"; // if rank == 3, 'three'
			break;
		case 4:
			value += "FOUR"; // if rank == 4, 'four'
			break;
		case 5:
			value += "FIVE"; // if rank == 5, 'five'
			break;
		case 6:
			value += "SIX";
			break;
		case 7:
			value += "SEVEN";
			break;
		case 8:
			value += "EIGHT";
			break;
		case 9:
			value += "NINE";
			break;
		case 10:
			value += "TEN";
			break;
		case 11:
			value += "JACK";
			break;
		case 12:
			value += "QUEEN";
			break;
		case 13:
			value += "KING";
			break;
		}
		value += " of "; // adding of to

		switch (suit) {
		case 1:
			value += "SPADES"; // 1 is spades
			break;
		case 2:
			value += "HEARTS"; // 2 is hearts
			break;
		case 3:
			value += "DIAMONDS"; // 3 is diamonds
			break;
		case 4:
			value += "CLUBS"; // 4 is clubs
			break;

		}
		return value;
	}

	// SETTERS AND GETTERS

	/**
	 * @return the rank
	 */
	public int getRank() { // to get rank // why no parameters don't understand
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) { // but why does this have a parameter
		this.rank = rank;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(int suit) { // why does this have parameters
		this.suit = suit; // setting
	}

	/**
	 * @return the isFaceUp
	 */
	public boolean isFaceUp() {
		return isFaceUp;
	}

	/**
	 * @param isFaceUp the isFaceUp to set
	 */
	public void setFaceUp(boolean isFaceUp) { // setter because setting value
		this.isFaceUp = isFaceUp;
	}
}
