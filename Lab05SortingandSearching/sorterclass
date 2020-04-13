package HW05SortingandSearching;

import java.util.Arrays;

public class Sorter {

	public static String selectionsort(int[] arr) { // find smallest and put on far lef tside

		int temp; // can be outside because it is changed every time
		int smallestIndex; // index of the smallest number

		for (int j = 0; j < arr.length; j++) { // outer tells us how many times we want to look for

			smallestIndex = j; // start at next because thats how it works the jth element
			// thats why j is on inside because j gets incremented every time

			for (int i = j; i < arr.length; i++) { // THIS LOOP CHECKS ALL VALUES ON THE RIGHT
				if (arr[smallestIndex] > arr[i]) { // ALWAYS MOVES SMALLEST VALUE TO THE LEFT
					smallestIndex = i; // moves from right to left and finds smallest of all value on right side
				} // then outside for loop goes iterates through the unsorted array while left side is sorted
			}
			
			// finds smallest index and swaps it // then goes through next iteration and finds next smallest w/for loop

			// SWAPPING VALUES WITH EACH OTHER
			temp = arr[smallestIndex]; // storing smallest
			arr[smallestIndex] = arr[j]; // switching smallest to the smallest // switch right value w/ left
			arr[j] = temp;
		}

		return Arrays.toString(arr);
	}

	public static String binarysort(int[] arr) {
		return "";
	}

	public static String bubblesort(int[] arr) { // swap every time w value and one on right of it
		int temp;

		for (int j = 0; j < arr.length; j++) { // basically finding smallest
			for (int i = 0; i < arr.length - 1; i++) { // puts largest value on the right most side
				if (arr[i] > arr[i + 1]) { // if greater 
					// SWAP VALUES
					temp = arr[i + 1];
					arr[i + 1] = arr[i]; // swapping with value next to it
					arr[i] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}

}
