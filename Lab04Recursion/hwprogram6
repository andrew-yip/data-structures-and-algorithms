package HW04Recursion;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = in.nextLine().toLowerCase();
		System.out.println("Original string: " + str);

		System.out.println("Altered: " + z(str));
		

	}
	
	public static String z(String s) {
		
		if (s.length() == 1) { // base case // because last element
			if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
				return "z"; // replaces z with the vowel  // just z because its last character
			}
			return s.substring(0,1); // just return the last character if not a vowel
		}
		else {
			if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') {
				return "z" + z(s.substring(1)); // replaces z with the vowel 
			}
			else {
				return s.charAt(0) + z(s.substring(1)); // if not a vowel just return the character at that spot
			}
		}
	}

}
