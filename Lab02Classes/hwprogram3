// black jack main

package HW02Classes;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TASK 1: CREATE THE GAME ENGINE
		BlackJackEngine blackJack = new BlackJackEngine(); // creating game engine object with black jack engine class

		// TASK 2: ALLOW THE USER TO PLAY AS MANY TIMES AS THEY WANT.
		
		for (int i = 1;; i++) {// infinite loop
			System.out.println("\n\nB L A C K J A C K G A M E #" + i);
			blackJack.playGame(); // object called 'blackJack' calling method 'playGame()'
			blackJack.callWinner();

			Scanner in = new Scanner(System.in);
			String another;
			System.out.print("\nWould you like to play another game? Enter yes to continue. ");

			another = in.nextLine();

			if (!another.toLowerCase().equals("yes")) // anything other than yes breaks
				break; // stops infinite for loop if anything other than yes

		}
	}
}
