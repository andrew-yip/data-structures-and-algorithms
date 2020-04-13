package HW04Recursion;

import java.util.Scanner;

public class Problem3Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = in.nextLine().toLowerCase();
		System.out.println("Original string: " + str);
		
		System.out.println("Counted pairs: " + pair(str));

	}
	
	public static int pair(String s) {
		if (s.length() < 3 ) { // less than 3 is 0 already // base case
			return 0;
		} else {
				return (s.charAt(0) == s.charAt(2) ? 1:0) + pair(s.substring(1)); // going down then up
		}
	}

}
