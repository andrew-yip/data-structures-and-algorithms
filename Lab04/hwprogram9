package HW04Recursion;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please input a # for base 10: ");
		int num = in.nextInt();

		System.out.println("Enter either base 2, base 8, base 16");
		int base = in.nextInt();

		while (base != 2 && base != 8 && base != 16) { // if you input something other than 2,8,16
			System.out.println("re-enter one of the bases that are shown above");
			base = in.nextInt();
		}

		System.out.println("Decimal Conversion: " + decimalConversion(num, base));

	}

	public static String decimalConversion(int num, int base) {

		// Base Cases:
		if (num == 0) {// base case (making the number smaller and smaller
			return "";
		}

		// Recursive Statements:
		if (base == 2) { //(binary value)
			return decimalConversion(num/base, base) + num%base; // recursive statement // num%base is the
																			// remainder
																			// (always 1 or 0)
		}

		else if (base == 8) { // if base value = 8 (octal value)
			return decimalConversion(num/base, base) + num%base; // why does it run recursive first then add %why mod
		}

		else if (base == 16) { // if the base is = 16
			
			if (num >= 10 && num <= 15) { // if num value is in between 10 and 15
				
				switch (num) {

				case 10:
					return "A";
				}

				switch (num) {

				case 11:
					return "B";
				}

				switch (num) {

				case 12:
					return "C";
				}

				switch (num) {

				case 13:
					return "D";
				}

				switch (num) {

				case 14:
					return "E";
				}

				switch (num) {

				case 15:
					return "F";
				}
			}

			else {
				if (num < 10) {
					return num + ""; // return just that number if it is less ten
				}
				
				return decimalConversion(num/base, base) + decimalConversion(num % base, base); // order is good
			}
		}
		return "";
	}
}
