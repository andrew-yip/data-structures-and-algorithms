package HW05SortingandSearching;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INPUT FILE AND SCANNER THAT READS THE FILE
		File inputFile;
		Scanner fileInputScan = null;
		PrintWriter out = null;

		try {
			// INSTANTIATE A FILE SCANNER AND LINK IT TO THE INPUT FILE
			// UNIX PATHWAY : "/Users/TrishCornez/Desktop/fileI.txt"
			// WINDOWS PATHWAY: "C:\\Users\\patricia_cornez\\Desktop\\fileI.txt

			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			
			// FILE 1
			out = new PrintWriter("/Users/andrewyip/Downloads/fileI.txt"); // making a new file Output in downloads
			out.print("James Baca" + "\nComputer Science" + "\nJulia Swtson" + "\nHistory" + "\nTilda Pravishtar"
					+ "\nChemistry" + "\nJames Baker" + "\nBiology" + "\nRoger Childs" + "\nEnglish Studies");

			ArrayList<Student> students = new ArrayList<Student>(); // array list holding all the students
			out.close(); // done writing to file I

			
			// scans the file I
			inputFile = new File("/Users/andrewyip/Downloads/fileI.txt"); // gets the file into eclipse

			
			// file 2
			fileInputScan = new Scanner(inputFile); // scans/reads the file

			while (fileInputScan.hasNext()) { // adding a student to array list
				students.add(new Student(fileInputScan.nextLine(), fileInputScan.nextLine()));
			}

			// Unsorted Method
			out = new PrintWriter("/Users/andrewyip/Downloads/fileO.txt"); // making a new file
			out.print("Data read from the file .... "); // writing this on fileO

			for (int i = 0; i < students.size(); i++) {
				out.print("\n" + students.get(i).toString()); // printing each thing on new line
			}

			// Method for Sorting
			sort(students);

			// Sorted List
			out.print("\n\nNames sorted from largest to smallest:");
			for (int i = 0; i < students.size(); i++) {
				out.print("\n" + students.get(i).toString()); // printing each thing on new line
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found.");
		} finally {
			if (fileInputScan != null)
				fileInputScan.close();
			if (out != null)
				out.close();
		}

	}

	public static ArrayList<Student> sort(ArrayList<Student> s) {

		// Selection Sort to go through the array list to sort strings based on length

		int largestIndex; // index of the smallest number

		for (int j = 0; j < s.size(); j++) { // outer tells us how many times we want to look for

			largestIndex = j; // start at next because thats how it works the jth element
			// thats why j is on inside because j gets incremented every time

			for (int i = j; i < s.size(); i++) { // for loop to find the smallest value
				if (s.get(largestIndex).getName().length() < s.get(i).getName().length()) { //
					largestIndex = i;
				}
			}

			// SWAPPING VALUES WITH EACH OTHER
			Collections.swap(s, largestIndex, j);

		}
		return s;

	}

}
