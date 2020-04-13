package HW06FilesandLinkedLists;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {

	public static Scanner in = new Scanner(System.in); // to scanner for input
	public static PrintWriter out; // to write to the file

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			out = new PrintWriter("/Users/andrewyip/Downloads/Breakfast.txt"); // creates the file
			getInput(); // input to the file
			out.close(); // closes file
		} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found."); // if file can't be found
		} finally {
			out.close(); // closes it finally if not // final chunk of code it runs
		}
	}

	public static void getInput() {
		System.out.println("What did you eat for breakfast? (Type in a number when finished)");
		while (!in.hasNextInt()) {
			out.println(in.next());
		}
	}

}
