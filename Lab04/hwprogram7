package HW04Recursion;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = in.nextLine();
		System.out.println("\nInputted string:\n\n" + str);

		System.out.println("\nString with removed spaces:\n\n" + spaces(str));

	}

	public static String spaces(String str) {

		if (str.length() == 1) { // base case
			return str.substring(0, 1);
		} else { // recursive statement
			if (str.charAt(0) == ' ' && str.charAt(1) == ' ') { // if the two next char's are spaces
				if (str.charAt(2) == '!' || str.charAt(2) == '.') { // checking punctuation (specifically last ones)
					return "" + str.charAt(2); // just that character if it is
				}
				return spaces(str.substring(1)); // if next two are spaces return nothing but recursive call
			} else { // if the two aren't just spaces
				return str.charAt(0) + spaces(str.substring(1));
			}
		}
	}

}
