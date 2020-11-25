// Scramble Word Game



package HW01Review;
import java.util.Scanner;

public class Problem1Redo {

	public static String[][] array = { { "hello", "a greeting" }, // initial 2d String array with description
			{ "school", "where you learn" }, { "calculus", "a high level math class" }, { "car", "what you drive" } };

	public static Scanner myInput = new Scanner(System.in); // scanner for all methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("WELCOME TO SCRAMBLE! YOUR SCRAMBLED WORD IS SHOWN BELOW.");

		int[] wordsUsed = new int[array.length]; // to check words used

		for (int i = 0; i < array.length; i++) { // goes through the whole array (reason why goes to array length)

			int wordSpot = 0;
			do { // does this first
				wordSpot = getrandomWord(array);// DECLARING 'WORDSPOT' for [wordSpot][j]
			} while (wordsUsed[wordSpot] != 0); // ALL ZEROS INITIALLY when having empty array
			// if its equal to 0 it does it once then it exits the while loop
			
			wordsUsed[wordSpot] = 1; // FILLS THAT SPOT IN 1D ARRAY WITH '1' ONCE that spot is used
			// For loop is there for repeating multiple times

			String word = array[wordSpot][0]; // word [i][0] // same value for both // wordSpot is found already
			String hint = array[wordSpot][1]; // hint is in the [i][1] // same value for both // set string for hint
			System.out.println("\nYour scrambled word is " + (shuffle(word)
					+ ". If you would like a hint type 'hint'. If you would like to quit type 'quit'.  "));
			if (check(word, hint)) { // calling method // if it returns true it breaks otherwise just runs it
				break; // breaks if returns true otherwise keeps going if returns false // stops whole thing
			}
		}

		System.out.println("\nYou finished the game. ");
	}

	public static int getrandomWord(String[][] arr) { // method for getting a random word in 2d array (I spot)
		int randomWord = (int) (Math.random() * (arr.length)); // [randomWord][j]
		return randomWord; // random word for the i component and returning to the main
	}

	public static String shuffle(String word) { // shuffle word that is chosen
		// TASK 1: CONVERT THE STRING TO AN ARRAY

		char[] wordArr = word.toCharArray(); // converting string to char array // declaring char array

		// TASK 2: LOOP 25 TIMES
		// RANDOMLY CHOOSE 2 INDICES AND SWAP VALUES

		for (int i = 1; i <= 25; i++) { // goes around 25 times
			// a. randomly choose two indicies

			// switching random letters each time // getting random characters in strings or
			// char array
			int a = (int) Math.floor(Math.random() * word.length()); // getting first part of string (word)
			int b = (int) Math.floor(Math.random() * word.length()); // getting another part of string (word)

			// b. swap the contents.
			char temp = wordArr[a]; // setting temp value as 'temp'
			wordArr[a] = wordArr[b]; // switching values
			wordArr[b] = temp; // setting old value as new
		}

		// TASK 3: CONVERT THE ARRAY TO A NEW STRING

		String newString = new String(wordArr); // converting array to string

		// TASK 4: RETURN THE STRING
		return newString; // back to main
	}

	public static boolean check(String word, String hint) { // also check if quit
		String guess = myInput.nextLine().toLowerCase(); // whatever your input guess is
		boolean truth = false;

		if (guess.equals(word)) {
			System.out.println("GOOD JOB!");
		}

		while (!guess.equals(word)) {
			if (guess.equals(word)) {
				System.out.println("GOOD JOB! YOU'RE CORRECT! ");
			} else if (guess.equals("hint")) {
				System.out.println("HINT: " + hint); // we need access to hint from main
				guess = myInput.nextLine().toLowerCase();
			} else if (guess.equals("quit")) {
				System.out.println("End Game. Quitter. ");
				return true; // returns true if you put quit
			} else if (!guess.equals(word)) { // if input is incorrect
				System.out.println("INCORRECT. GUESS AGAIN. ");
				guess = myInput.nextLine().toLowerCase();
			}
			if (guess.equals(word)) {
				System.out.println("GOOD JOB!");
			}
		}
		return false; // if you don't put 'quit' you are telling the game you don't (false) want to
						// quit
	}
}
