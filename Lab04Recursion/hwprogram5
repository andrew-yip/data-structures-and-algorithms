package HW04Recursion;

public class Problem5Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 0; // need to traverse the array
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(evenTimes(arr,index));

	}
	
	public static int evenTimes (int [] array, int index) {
		
		if (index == array.length-1) { // last index
			if (array[index] %2 == 0) { // now checking the last element
				return 1; // returns 1 if the last one if the last one is even 
			}
			else {
				return 0; // otherwise returns 0
			}
		}
		else {  // recursive element
			if (array[index] %2 == 0) {
				return 1 + evenTimes(array, ++index); // return count + recursive element
			}
			else {
				return 0 + evenTimes(array, ++index);
			}
		}
	}

}
