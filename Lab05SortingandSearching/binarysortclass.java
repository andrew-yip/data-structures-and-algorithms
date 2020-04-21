package HW05SortingandSearching;

public class BinarySearch {
	
	public static int binaryRecursive (int [] arr, int first, int last, int value) { // 0 first // arr.length -1 last

		
		if (first <= last) { // recursive statements // recursive as long as the last value is greater than first
			
			int mid = (first+last)/2; // calculating middle value
			
			// BASE CASE:
			if (arr[mid] == value) { // primitive/base case
				return mid;
			}
			
			// RECURSIVE 
			else if (arr[mid] < value) { // if the value is greater than the middle value
				return binaryRecursive(arr, mid+1, last, value); // changing size of the array w/ recursion (right side)
			}
			else { // if the value is less than the value we're looking for 
				return binaryRecursive(arr, first, mid-1, value); // changing to left side of the array
			}
			
		}
		
		else { // if nothing is returned at all
			return -1;
		}
		
	}

}
