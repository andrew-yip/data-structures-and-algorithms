package HW05SortingandSearching;
import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};
		System.out.println("Before: " + Arrays.toString(arr)); // array doesn't change
		System.out.println("28 is on spot: " + BinarySearch.binaryRecursive(arr, 0, arr.length-1, 28)); 
		System.out.println("After: " + Arrays.toString(arr));
		
		// 0 is start
		// arr.length-1 is where you end

	}

}
