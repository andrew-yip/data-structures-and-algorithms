// rotate a 2d array of any size of integers

package HW01Review;
public class Problem2Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { 
				{ 11, 22, 33 }, 
				{ 44, 55, 66 }, 
				{ 77, 88, 99 } }; // declaring array

		original(arr); // calling method
		rotate(arr); // rotated
	}

	public static void original(int[][] array1) { // printing the original array
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotate(int[][] array) {
		int[][] rotated = new int[array.length][array[0].length]; // 3 by 3 // new array

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				rotated[i][j] = array[(array.length - 1) - j][i]; // rotated at 0,0 is equal to original at 2,0// find
																	// way for these #s
				System.out.print(rotated[i][j] + " "); // printing rotated
			}
			System.out.println();
		}
	}
}
