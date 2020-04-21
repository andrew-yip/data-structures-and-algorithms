package HW06FilesandLinkedLists;

import java.io.*;
import java.util.*;

public class Problem3 {

	public static Scanner fileScanner; // this is a scanner
	public static File inputFile; // this is a file

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			inputFile = new File("/Users/andrewyip/Downloads/NYCArticle.txt");
			fileScanner = new Scanner(inputFile); // scans the file
			
			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found.");
		} finally {
			fileScanner.close();
		}

	}

	public static void readFile() {
		int theCount = 0;
		String s = "";
		while (fileScanner.hasNext()) {
			s = fileScanner.next();
			if (s.equals("the")) {
				theCount++;
			}
		}
		System.out.print("Number of times \"the\" appears in this article: " + theCount);
	}

}
