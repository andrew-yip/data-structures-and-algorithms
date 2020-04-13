// black jack engine class

package HW02Classes;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackEngine {

	public static Scanner in = new Scanner(System.in);

	// DATA MEMBERS: Attributes to the class
	private Deck deck; // initializing deck // from deck class
	private ArrayList<Card> arr1; // your hand // object of array list class
	private ArrayList<Card> arr2; // dealer's hand // array list can hold objects

	// CONSTRUCTORS
	public BlackJackEngine() { // constructing the engine // what is made as soon as object constructed

		// constructing new objects inside the engine

		deck = new Deck(); // calls deck class and then uses deck constructor // naming deck as 'deck'
		arr1 = new ArrayList<Card>(); // making a array list that can hold card objects
		arr2 = new ArrayList<Card>();

		deck.shuffle(); // shuffles deck so in random order // shuffle method is only public to deck
						// class

		for (int i = 0; i < 2; i++) { // deals 2 cards // filling the array list
			// make deck for each player by adding to the array list
			arr1.add(i, deck.deal()); // dealing 2 cards // deal is only public to deck class
			arr2.add(i, deck.deal()); // adding card to 'i' spot and adding a 'card'
		}
	}

	// INSTANCE METHODS
	public void playGame() { // adding stuff is playing the game

		restart(); // calling restart method
		System.out.println("\nPlayer 1's hand of 2 cards: \n" + arr1.get(0).toString());
		System.out.println(arr1.get(1).toString());
		System.out.println("Player 1's hand value is: " + sum(arr1));
		System.out.println("\nDealer's hand of 2 cards: \nFACEDOWN");
		System.out.println(arr2.get(1).toString());
		System.out.println("Dealer's hand value is: " + sum(arr2));

		if (sum(arr1) > 21) {
			System.out.println("You lost.");
		}
		if (sum(arr2) > 21) {
			System.out.println("Dealer has lost.");
		}

		// trying to figure out a way to stop as soon as one player reaches value less
		// than or equal to 21 // can you break out of method?

		userInput();
		
		if (sum(arr1) >= 21) { // stops program if >=21
			return;
		}
		
		dealerInput();
	}

	public void callWinner() { // check whos the winner // display to output whos winner

		int p1Sum = sum(arr1); // sum of player
		int p2Sum = sum(arr2); // sum of dealer

		if (p1Sum > 21) {
			System.out.println("\nYou exceed 21. You lose.");
		} else if (p2Sum > 21) {
			System.out.println("\nYou won. The dealer busted.");
		}

		else if (p1Sum == p2Sum) {
			System.out.println();
			System.out.println("TIE GAME.");
		} else if (p1Sum == 21 || p1Sum > p2Sum) {
			System.out.println("\nYou won. The dealer lost."); // if your sum is greater than p2sum
		} else {
			System.out.println("You lost.");
		}

	}

	public int sum(ArrayList<Card> array) { // changing jack,queen,king to 10 value // need size (parameter)
		int total = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getRank() == 11 || array.get(i).getRank() == 12 || array.get(i).getRank() == 13) {
				total += 10; // if the rankis equal to 11, 12, 13 only add 10 because jack/queen/king = 10
			} else if (array.get(i).getRank() == 1) {
				total += 11;
			} else {
				total += (array.get(i).getRank());
			}
			if (total > 21 && array.get(i).getRank() == 1) {
				total -= 10;
			}
		}
		return total;
	}

	public void userInput() {
		String choice; // initializing choice

		do {
			if (sum(arr1) >= 21) {
				break;
			}
			System.out.println("\nWould you like to hit or stay? Type 'hit' for hit and 'stay' for stay.");
			choice = in.nextLine().toLowerCase();
			// last hand element
			if (choice.equals("hit")) {
				arr1.add(deck.deal()); // deal a card to array adding it to your (arr1 hand) adding card to end of
										// array
				// last hand element
				System.out.println("\nYou added a " + arr1.get(arr1.size() - 1).toString()); // adding last element

				System.out.println("Your Hand: ");
				for (int i = 0; i < arr1.size(); i++) { // shows cards
					System.out.println(arr1.get(i).toString());
				}
				System.out.println("Your current hand value is: " + sum(arr1));
			} else if (choice.equals("stay")) {
				System.out.println("\nYou chose to stay.");
				System.out.println("Your Hand: ");
				for (int i = 0; i < arr1.size(); i++) { // shows cards
					System.out.println(arr1.get(i).toString());
				}
				System.out.println("Your current hand value is: " + sum(arr1));
			}
		} while (choice.equals("hit") && sum(arr1) < 21); // keeps running if choice is yes or less than or equal to 21
	}

	public void dealerInput() { // void because inside a void you can change an object
		int choice;

		do {
			choice = (int) (2 * Math.random()); // yes = 0; no = 1

			if (sum(arr2) >= 21) {
				break;
			}
			if (choice == 0) { // 0 = yes
				arr2.add(deck.deal()); // deal a card to array adding it to your (arr1 hand) adding card to end of
				System.out.println("\nThe dealer added a " + arr2.get(arr2.size() - 1).toString());
				// array
				System.out.println("\nDealer's Hand: ");
				for (int i = 0; i < arr2.size(); i++) { // shows cards
					System.out.println(arr2.get(i).toString());
				}

				System.out.println("The dealer's hand value is: " + sum(arr2));
			} else {
				System.out.println("\nThe dealer chose to stay. ");
				System.out.println("Dealer's Hand: ");
				for (int i = 0; i < arr2.size(); i++) { // shows cards
					System.out.println(arr2.get(i).toString());
				}
				System.out.println("The dealer's current hand value is: " + sum(arr2));
			}
		} while (choice == 0 && sum(arr2) < 21); // keeps running if choice is yes or less than or equal to 21
	}

	public void restart() {
		arr1.removeAll(arr1); // removes all values
		arr2.removeAll(arr2);

		for (int i = 0; i < 2; i++) { // deals 2 cards
			// make deck for each player by adding to the array list
			arr1.add(i, deck.deal());
			arr2.add(i, deck.deal());
		}
	}

}
