/*
Write a program that merges two character arrays into a single ArrayList.
The rules for merging are as follows:
Each char array contains elements in alphabetical order.
The resulting ArrayList should be in alphabetical order and without duplicates.
The two arrays being merged do not have to have the same length.
Employ a merge() method that receives the two arrays as parameters and returns the ArrayList.
The best solution makes a single pass over both arrays and takes advantage of the fact that they are in alphabetical order, copying elements directly to the new ArrayList.
Test the following executions. Print the execution results along with your code files.
merge({'a', 'b', 'c'}, {'d', 'e', 'f'}) -> ArrayList['a', 'b', 'c', 'd', 'e', 'f']
merge({'a', 'b', 'd', 'e'}, {'b', 'c', 'd'}) -> ArrayList['a', 'b', 'c', 'd', 'e']
merge({'b', 'd'}, {'b', 'c', 'd', 'f'}) -> ArrayList['b', 'c', 'd', 'f']

*/

package HW01Review;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// char[] array1 = getInput(1); // declaring arrays received from getInput
		// method (inputting array values)
		// char[] array2 = getInput(2);

		char[] array1 = { 'a', 'b', 'd', 'e' };
		char[] array2 = { 'b', 'c', 'd'};

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(merged(array1, array2));
	}

	public static char[] getInput(int which) {
		// Variables
		int length = 10;
		char[] input = new char[length];
		int currentSize = 0;
		System.out.print("For 'char' ARRAY number " + which
				+ ":\n'Type in a list of characters and type in a number when you are finished: '");
		// Input
		while (!in.hasNextInt()) {
			if (currentSize >= input.length)
				input = Arrays.copyOf(input, 2 * input.length);
			input[currentSize] = in.next().charAt(0);
			currentSize++;
		}
		int getRidOfInt = in.nextInt();
		input = Arrays.copyOf(input, currentSize);

		return input;
	}

	public static ArrayList<Character> merged(char[] arr1, char[] arr2) { // method that returns merged list

		ArrayList<Character> thelist = new ArrayList<Character>(); // declaring a new array list // always need to be
																	// called wrapper class
		// converts primitive to wrapper class (called autoboxing)

		int maxLength;
		int minLength;
		char[] maxArray;
		char[] minArray;
		int index = 0;
		if (arr1.length >= arr2.length) { // claiming the first array is greater in length
			maxLength = arr1.length;
			maxArray = arr1;
			minArray = arr2;
			minLength = arr2.length;
		} else { // second array is greater in length
			maxLength = arr2.length;
			maxArray = arr2;
			minArray = arr1;
			minLength = arr1.length;
		}

		for (int i = 0; i < maxLength; i++) { // POPULATING ARRAYLIST WITH ARRAY WITH MAX LENGTH
			thelist.add(index, maxArray[i]);
			index++; // increment index
		}

		// need variable to go through minimum array (i) and different one to go through
		// arraylist (j)

		for (int i = 0; i < minLength; i++) { // POPULATING ARRAYLIST WITH ARRAY WITH MIN LENGTH // going through
												// smaller arraylist
			if (!checkSame(minArray[i], thelist)) { // if two values are different it runs // doesn't do anything if
													// same
				for (int j = 0; j < thelist.size(); j++) { // other variable going through array list (j) // checking if less or more
					if (minArray[i] < thelist.get(j)) {
						thelist.add(order(minArray[i], thelist), minArray[i]); // whatever #value is returned is where
																				// the value is added // determining where to place
						break; // exits for loop
					} else if (minArray[i] > thelist.get(thelist.size() - 1)) { // only add when bigger than last
																				// element in arraylist
						// because the two arrays that we are comparing them two are in order already
						thelist.add(index, minArray[i]); // add value to next index if the value in the minArray[i] is
															// greater
						break; // exits for loop
					}
				}
				index++; // increment index once done with the for loop
			}
		}
		return thelist;// returning the populated array list to main
	}

	public static boolean checkSame(char c, ArrayList<Character> arrlist) { // checks if values are same in arraylist
		// want access to arraylist and minimum array (char c)
		
		boolean same = false; // initially false because not same

		// char 'c' is stored as whatever value is at minArray[i] // points to
		// minArray[i]

		for (int i = 0; i < arrlist.size(); i++) { // going through the arraylist
			if (arrlist.get(i) == c) { // if at that spot it is equal to char 'c'
				same = true; // switches same to true if it is equal
			}
		}
		return same;
	}

	public static int order(char c, ArrayList<Character> arr) { // GO THROUGH ARRAYLIST // RETURN PLACE AT WHICH TO
																// INSERT CHAR
		for (int i = 0; i < arr.size(); i++) { // finish for loop first
			if (arr.get(i) > c)// if value is less
				return i;
			// if value is not greater it doesn't do anything // returns number at which the
			// value is greater than
		}
		return arr.size() - 1; // return the last element if not greater
	}
}
