/*In languages such as C++ and Java, the primitive data type int is limited to a 32 bit or 64 bit representation. Construct a class, BigNumber, to represent very large integers - integers greater than 2,147,483,647. Write the necessary class methods allowing the addition of any two BigNumber objects. Assume only addition will be performed on this class of numbers.
*/

package HW03BuildingClasses;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigNumber x = new BigNumber(); // creating object which has array list
		BigNumber y = new BigNumber(); // creating object which has array list
		//BigNumber sum; // creating Big Number

		x.input(1); // x object is calling input method // your input 
		y.input(2); // y object is calling input method // your input
		
		//sum = x.add(y); // sum object is the x object added to the y object // WANT TO RETURN CLASS CALLED SUM
		//System.out.println(sum.toString());
		
		System.out.println("The sum of the two #'s is: " + x.add(y) + "."); //x.add(y) returns object of array list
		// then calls for the toString method automatically

	}

}
