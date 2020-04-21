package HW02Classes;

public class Fraction { // classes only do computation / recieve data / input data/ no ouput / no print

	// Attributes: Data Members
	private int numerator; // initialize in the beginning // private is characteristic that they have
	private int denominator; // initialize in the beginning

	// CONSTRUCTOR //only called once during construction // explicit // takes into argument of those two integers
	public Fraction(int n, int d) { // CREATING THE FRACTION OBJECT
		numerator = n; // n is set as numerator
		denominator = d; // d is set as denominator both take into account arguments from main

		if (d == 0) {
			throw new IllegalArgumentException("Invalid Expression"); // throws statement
		}
	}

	public Fraction() { ///DEFAULT CONSTRUCTOR // We have to construct
		numerator = 0;
		denominator = 1;
	}
	
	// SETTERS AND GETTERS // WHY ARE THERE NO PARAMETERS FOR GETTERS AND THERE ARE FOR SETTERS // and why void

	/**
	 * @return the numerator
	 */
	public int getNumerator() { // don't understand parameters 
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator; // if you say 'this' saying the numerator from above
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() { // just returns denominator which is an int
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	// METHODS for calculations // i just don't understand parameter
	
	public String toString() {  // why no parameter
		return (numerator + "/" + denominator); // RETURNING A STRING
	}

	public void add(Fraction f) { // object is the parameter
		int numerator1 = numerator*f.getDenominator();
		int numerator2 = denominator*f.getNumerator();
		numerator = numerator1 + numerator2;
		denominator = denominator*f.getDenominator();
	}

	public void subtract(Fraction f) { // object is the parameter
		int numerator1 = numerator*f.getDenominator();
		int numerator2 = denominator*f.getNumerator();
		
		numerator = numerator1 - numerator2;
		denominator = denominator*f.getDenominator();
	}
	public void multiply(Fraction f) { // object is the parameter
		numerator = numerator * f.getNumerator();
		denominator = denominator *f.getDenominator();
	}
	
	public void divide(Fraction f) { // object is the parameter
		int dTemp = denominator*f.getNumerator();
		int nTemp = numerator*f.getDenominator();
		
		if (dTemp == 0) {
			throw new IllegalArgumentException("Invalid Expression");
		}
		
		numerator = nTemp; // setting numerator as 
		denominator = dTemp; // setting denominator as
		
	}
	public void reduce() { 
		int gcd = GCD(numerator, denominator); // gives us 3
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public int GCD(int a, int b) { // getting greatest common factor // so gets 3
		   if (b==0) return a;
		   return GCD(b,a%b);
		}
	
	public boolean isEqual(Fraction f) {
		boolean equal = false;
		Fraction temp1 = this;
		temp1.reduce();
		Fraction temp2 = f;
		temp2.reduce();
		if (temp1.getNumerator() == temp2.getNumerator() && temp1.getDenominator() == temp2.getDenominator()) {
			equal = true;
		}
		return equal;
	}

}
