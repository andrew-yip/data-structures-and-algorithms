//bignumber class

package HW03BuildingClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumber {

	public Scanner in = new Scanner(System.in);

	// Data Members
	private ArrayList<Integer> arr; // what big number is actually modeled as is an array list

	// Constructor
	public BigNumber() { // default constructor // instance of an object
		arr = new ArrayList<Integer>(); // creating new array list when constructing the object
	}

	// FUNCTIONALITY (BEHVAIOR METHODS)

	public String input(int number) { // parameter is a number because we need that number // YOUR INPUT

		System.out.println("Please enter integer #" + number + ":"); // the number we put in that is our parameter
		String str = in.nextLine(); // string "number" we put input

		// as soon as your input, it is passed to arrayInput method and placed into an array list
		arrayInput(str); // adding our input to the array // passing str to the array // calling it
							// inputting it
		return str; // whatever that string is gets returned
	}

	public void arrayInput(String str) { // method for taking input string and converting to int and inputting to array
											// list // INPUTTING INTO THE ARRAY LIST
		for (int i = 0; i < str.length(); i++) {
			arr.add(i, Character.getNumericValue(str.charAt(i))); // converting to integer and adding to an array list
		}
	}

	public BigNumber add(BigNumber obj) { 
		BigNumber sum = new BigNumber(); // THIS IS AN OBJECT IN WHICH WE ARE RETURNING
		int sumColumn = 0; // initializing
		addZero(obj); // calling addZero method (to add zeros to smaller array list) // passing 'obj'

		for (int i = arr.size() - 1; i >= 0; i--) { // size is now the same so can start at any array list 
			
			sumColumn = sumColumn + arr.get(i) + obj.getArr().get(i); // finding sum of the column

			if (sumColumn >= 10) {
				sumColumn = sumColumn % 10; // updating sumColumn to the remainder
				sum.getArr().add(0, sumColumn); // adding whatever sumColumn is 
				sumColumn += 10; // then adding 10 back 
				sumColumn = sumColumn/10; // or 1
				
			} else { // if the sum is less than 10
				sum.getArr().add(0, sumColumn); // always puts answer in the front // adding to the array list
				sumColumn = 0; // resetting to 0 then goes through the for loop again
			}
		}
		
		//OUTSIDE FOR LOOP SPECIFICALLY FOR LAST ELEMENT IF GREATER OR EQUAL TO 10
		sumColumn+= 10; // adding 10 back 
		if (sumColumn >= 10) {
			sumColumn = sumColumn%10;
			if (sumColumn != 0) {
				sum.getArr().add(0, sumColumn);
			}
		}

		return sum; // returning big number object not the class // YOU CAN RETURN OBJECTS
		// whatever we return when we print an object it calls the toString method automatically
	}

	public void addZero(BigNumber obj) { // adding zeros to the end of smaller array list
		if (arr.size() > obj.getArr().size()) { // if array is bigger than compared object array

			while (arr.size() > obj.getArr().size()) { // keeps going until sizes are equal
				obj.getArr().add(0, 0); // keeps adding 0 to beginning until equal size
			}

		} else if (obj.getArr().size() > arr.size()) { // if size of compared object is bigger

			while (arr.size() < obj.getArr().size()) { // keeps going until sizes are equal
				arr.add(0, 0); // keeps adding 0 to beginning until equal size
			}

		} else if (obj.getArr().size() == arr.size()) { // if already same size
			// nothing happens
		}
	}

	public String toString() { // so it doesn't print out like an array list // overrides default method
		String hi = ""; // empty string

		for (int i = 0; i < arr.size(); i++) {
			hi += Integer.toString(arr.get(i)); // converting to the integer sum to a string so you can return a string
		}
		return hi;
	}

	// SETTERS AND GETTERS
	
	/**
	 * @return the arr
	 */
	public ArrayList<Integer> getArr() { // returning array list
		return arr;
	}

	/**
	 * @param arr the arr to set
	 */
	public void setArr(ArrayList<Integer> arr) { // if we choose to set the array list
		this.arr = arr;
	}
}
