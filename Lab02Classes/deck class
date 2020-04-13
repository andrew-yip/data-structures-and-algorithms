// deck class

package HW02Classes;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	// Data Members: Attributes to the class what we need
	private ArrayList<Card> cardList; // can put object in arraylist in this case a card // named cardList
	
	
	// CONSTRUCTOR (constructs/builds arraylist) //only called once during construction 
	public Deck() { // constructor to create the deck
		cardList = new ArrayList<Card>(); // object to created by constructor cardlist is object created by deck class
		populate(); // populate method in which to populate the array list
	}
	
	// BEHAVIOR METHODS
	public void populate() {  // populating the deck with cards in order
		for (int suit = 1; suit<= 4; suit++) { // suit and rank are parameters from for list
			for (int rank = 1; rank<= 13; rank++) {
				Card c = new Card(rank, suit); // creating a new card inside // creating card object
				cardList.add(c); // why is there no parameter for this that deals with the array list 
			}
		}
	}
	public void shuffle () { //shuffling deck method
		Collections.shuffle(cardList); // use if i know how to shuffle something already // other way is swap method
	}
	
	public Card deal() { // card is what were returning // why is there no parameters // GETTER for the deck 
		Card c = cardList.get(0); // gets first card in deck named 'cardlist'
		cardList.remove(0); // removing card shrinks arraylist size // adds to your deck as well
		return c; //getter because returning a value // returning a card
	}
	
	/**
	 * @return the cardList
	 */
	public ArrayList<Card> getCardList() {
		return cardList;
	}

	/**
	 * @param cardList the cardList to set
	 */
	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}
}
