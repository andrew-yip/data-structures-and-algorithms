package HW03BuildingClasses;
import java.util.Scanner;

public class TextingEngine2 {
	
	private Stopwatch sw;
	private String str;
	private Scanner in;
	
	public TextingEngine2 () {
		sw = new Stopwatch ();
		in = new Scanner (System.in);
	}
	
	public void setStr (String str) { // have to do first
		this.str = str;
	}
	
	public void runTest () {
		
		String answer = "";
		
		// 1. Display instructions:
		System.out.println("You will be provided with a sequence of characters to type. Press ENTER to begin");
		in.nextLine();
		
		//2. Start the stop watch
		sw.start();
		System.out.println(str); // printing out the question
		
		//3. Stop the stop watch and answer the question
		answer = in.nextLine();
		sw.stop();
		
		//4. Get elapsed time and check if correct
		if (answer.equals(str)) {
			System.out.println("Good job. ");
		}
		else {
			System.out.println("Wrong");
		}
		System.out.println("Time elapsed: " + sw.getElapsedTime());
		
	}

}
