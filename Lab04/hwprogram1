package HW04Recursion;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string: ");
		String str = in.nextLine();
		System.out.println(str);

		System.out.println(count(str));

	}

	public static int count(String s) {
		if (s.length() == 3) { // automatically if string length is less than 4 its 0 // base case
			return 0;
		} else { // recursive statement
			if (s.substring(0, 4).equals("like")) {
				return 1 + count(s.substring(1)); // substring goes from 1 on // adding 1 to int count
			} else if ((s.charAt(0) == '!')) {
				return 0 + count(s.substring(2));
			} else {
				return 0 + count(s.substring(1));
			}
		}
	}

}
