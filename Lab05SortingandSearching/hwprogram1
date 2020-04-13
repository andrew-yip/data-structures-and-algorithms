package HW05SortingandSearching;
import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		// Task 1: 
		
		int [] arr = {34,28, 43,15}; // unsorted array
		
		System.out.println("Selection Sort: ");
		System.out.println("---------------");
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		System.out.println("Sorted Array: " + Sorter.selectionsort(arr));
		System.out.println();
		
		System.out.println("Binary Sort: ");
		System.out.println("-------------");
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		System.out.println("Sorted Array: DIDN'T HAVE TO DO");
		System.out.println();
		
		System.out.println("Bubble Sort: ");
		System.out.println("-------------");
		System.out.println("Unsorted Array: " + Arrays.toString(arr));
		System.out.println("Sorted Array: " + Sorter.bubblesort(arr));
		
		
		// Task 2:
		
		Stopwatch sw = new Stopwatch ();
		int [] arr2 = new int [100000]; // second array of 100000 elements
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(arr2.length*Math.random());
		}
		System.out.println();
		System.out.println("Array 2 (100000 elements): ");
		System.out.println("--------------------------");
		
		sw.start();
		Sorter.selectionsort(arr2); // sorting using selection sort
		sw.stop();
		System.out.println("Elapsed time (selection sort) : " + sw.elapsedTime()); // milli sec
		
		sw.reset(); // reset the data
		
		
		int [] arr3 = new int [100000]; // third array of 100000 elements
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(arr3.length*Math.random());
		}
		System.out.println();
		sw.start();
		Sorter.bubblesort(arr3); // sorting using bubble sort
		sw.stop();
		System.out.println("Elapsed time (bubble sort) : " + sw.elapsedTime()); // milli sec

	}

}
