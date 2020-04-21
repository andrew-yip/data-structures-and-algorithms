package HW02Classes;

public class RomanNumeral {

	// DATA MEMBERS: ATTRIBUTES
	private String RomanValue; // the parameter
	private double DecimalValue;

	// CONSTRUCTOR (explicit and default)
	public RomanNumeral(String r) {
		this.RomanValue = r; // stating the the romanValue (data member) is 'r' the parameter
	}

	public RomanNumeral() { // default constructor
		RomanValue = "XX";
		DecimalValue = 20; // default values
	}

	// METHODS
	public void increment() {
		DecimalValue++; // increasing value by one
		RomanValue += "I"; // adding i to the end
	}

	public boolean equalTo(RomanNumeral letter) { // parameter is of RomanNumeral class
		boolean equal = false;

		if (this.getDecimalValue() == letter.getDecimalValue()) { // if it is equal to previous one
			equal = true; // setting equal to true
		}
		return equal;
	}

	// SETTERS AND GETTERS
	/**
	 * @return the romanValue
	 */
	public String getRomanValue() {
		return RomanValue;
	}

	/**
	 * @param romanValue the romanValue to set
	 */
	public void setRomanValue(String romanValue) { // setting the romanValue 
		this.RomanValue = romanValue;
		DecimalValue = getDecimalValue(); // resetting the decimal value
	}

	/**
	 * @return the decimalValue
	 */
	public double getDecimalValue() {

		DecimalValue = 0; // this resets the decimal value every time this method is run

		for (int i = 0; i < RomanValue.length(); i++) { // filling decimal value
			if (RomanValue.charAt(i) == 'M') {
				DecimalValue += 1000;
			} else if (RomanValue.charAt(i) == 'D') {
				DecimalValue += 500;
			} else if (RomanValue.charAt(i) == 'C') {
				DecimalValue += 100;
			} else if (RomanValue.charAt(i) == 'L') {
				DecimalValue += 50;
			} else if (RomanValue.charAt(i) == 'X') {
				DecimalValue += 10;
			} else if (RomanValue.charAt(i) == 'V') {
				DecimalValue += 5;
			} else if (RomanValue.charAt(i) == 'I') {
				DecimalValue += 1;
			}
		}

		return DecimalValue; // returning decimal value to main when called
	}

	/**
	 * @param decimalValue the decimalValue to set
	 */
	public void setDecimalValue(double decimalValue) { // setting the decimal value
		this.DecimalValue = decimalValue;
	}

}
