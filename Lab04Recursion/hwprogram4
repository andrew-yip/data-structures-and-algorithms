package HW04Recursion;

public class Problem4Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 0; // need to traverse the array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(followedByOdd(arr, index));

	}

	public static boolean followedByOdd(int[] array, int index) {

		if (index == array.length - 1) { // for second to last element (base case) index is going through the array
			return false; // if at the last one its false because not followed by any other #
		} else {
			if (array[index] % 2 == 0 && array[index + 1] % 2 == 1) { // if that one is even and next one is odd
				return true; // stops whole thing only returns true stops recursive statement
			} else {
				return followedByOdd(array, ++index); // otherwise go through the next element
			}
		}
	}

}
