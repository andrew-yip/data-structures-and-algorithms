// Construct and implement a RomanNumeral class to store a roman numeral (a string) and its computed decimal value.

package HW02Classes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Problem3 {
	
	//making print writer
	public static PrintWriter out;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// DECLARE TWO ROMAN NUMERALS USING EXPLICIT AND DEFAULT CONSTRUCTORS.
        RomanNumeral x1 = new RomanNumeral("DXI"); // explicit
        RomanNumeral x2 = new RomanNumeral(); // default

        // BUILD A STRING CONTAINING ALL THE REQUIRED TEST CASE SCENARIOS
        String testCaseResults = "";

        // TEST 1: VERIFY THE INITIAL VALUES OF x1 AND x2.  COMPARE BOTH OBJECTS
        testCaseResults += "x1 is " + x1.getRomanValue() + " with a decimal value of " + x1.getDecimalValue() + "\n";
        testCaseResults += "x2 is " + x2.getRomanValue() + " with a decimal value of " + x2.getDecimalValue() + "\n";
        testCaseResults += "x1 and x2 are equal?  " + x1.equalTo(x2) + "\n";

        // TEST 2: RESET THE ROMAN VALUE FOR X2 AND COMPARE BOTH OBJECTS AGAIN

        testCaseResults += "\nReset x2:" + "\n";
        x2.setRomanValue("XID"); 
        testCaseResults += "x2 is now " + x2.getRomanValue() + " with a decimal value of " + x2.getDecimalValue() + "\n";
        testCaseResults += "x1 and x2 are equal?  " + x1.equalTo(x2) + "\n";

        // TEST 3: INCREMENT X2 AND COMPARE BOTH OBECTS AGAIN
        testCaseResults += "\nIncrement x2:" + "\n";
        x2.increment();
        testCaseResults += "x2 is now " + x2.getRomanValue() + " with a decimal value of " + x2.getDecimalValue() + "\n";
        testCaseResults += "x1 and x2 are equal?  " + x1.equalTo(x2) + "\n";

        // DISPLAY THE TEST CASE RESULTS STRING TO THE CONSOLE
        System.out.print(testCaseResults);

        //FINAL TASK: WRITE THE TEST CASE RESULTS TO A TEXT FILE
		  try {
			out = new PrintWriter("RomanNumeral.txt");
			out.print(testCaseResults);
			} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found.");
			} finally {
			out.close();
			}
	}
}
