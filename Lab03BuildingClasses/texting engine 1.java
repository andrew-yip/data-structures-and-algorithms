package HW03BuildingClasses;
import java.util.Scanner;

public class TextingEngine {
	
	// Data Members
	private String testString; // string class called testString
	private Stopwatch sw; // of class StopWatch called 'sw'
	private Scanner in; // scanner class
	
	// Constructor
	public TextingEngine () { // default constructor // for every instance of a class created there is a stop watch/scanner
		sw = new Stopwatch() ; // creating stop watch object is named as 'sw' 
		in = new Scanner (System.in); // creating scanner object
	}
	
	// Functionality Methods
	
	public void setTestString (String s) { // setter for texting engine
		testString = s;
	}
	
	public void runTest () {
		String answer = ""; // initializing it as nothing
		
		// Task 1: Output Instructions
		System.out.println("You will be provided with a sequence of characters to type. Press ENTER to begin.");
		in.nextLine();
		
		// Task 2: Start the Stopwatch
		sw.start(); // starting stopwatch
		System.out.println(testString);
		
		
		// Task 3: Time and Input and stop the watch
		answer = in.nextLine();
		sw.stop(); // stopping watch
		
		// Task 4: Check the results and display the score
		if (answer.equals(testString)) {
			System.out.println("Correct Entry. Time (seconds): "  + sw.getElapsedTime());
		}
		else {
			System.out.println("You failed to answer correctly");
		}
		
	}

}
