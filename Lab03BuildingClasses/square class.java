package HW03BuildingClasses;

public class Square extends Rectangle { // inherits length and width from Rectangle
	
	// Data Members: // none because inherited length and width from rectangle already

	//Constructors:
	
	public Square () { // has length and width like rectangle from inheritance
		super(); // calling super class // makes square due to default constructor from rectangle of sides 1
	}
	
	public Square (int l) { // has length and width like rectangle from inheritance
		super(l, l); // how to pass to super class
	}
	
	// Getters and Setter: // need to modify setters because don't work
	
	public void setLength(int side) { // overriding method from super
		super.setLength(side); // setting length as side (whatever input)
		super.setWidth(side); // setting  width as side (whatever input)
	}
	
	public void setWidth(int side) { // overriding method from super
		super.setLength(side); // setting length as side (whatever input)
		super.setWidth(side); // setting  width as side (whatever input)
	}	
}
