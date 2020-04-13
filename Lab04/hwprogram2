package HW04Recursion;

import java.util.Scanner;

public class Problem2Redo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = in.nextLine().toLowerCase();
		System.out.println("Original string: " + str);

		System.out.println("With dashes: " + dash(str));

	}
	
	public static String dash (String str) {
		if (str.length() == 1) { // if its the last one just return the string
			return str; // string gets smaller every time so it is the last one
		}
		else if (Character.isAlphabetic(str.charAt(0)) && Character.isAlphabetic(str.charAt(1))) {
			return str.charAt(0) + "-"+ dash(str.substring(1)); // add dash in between if both are alphabets
		}
		else if (Character.isDigit(str.charAt(0))) { // if its a digit 
			return str.charAt(0) + dash(str.substring(1)); // just return that digit(charat(0)) and run again
		}
		else { // if its not alphabet or number like a space you just return that space
			return str.charAt(0) + dash(str.substring(1));
		}
	}

}
