package HW07StacksandQueues;

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {

	public static Scanner in = new Scanner(System.in);
	public static Stack<Character> stack = new Stack<Character>();
	public static String postfx = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CONVERTING FROM INFX TO POSTFX
		System.out.println("What is your infx: ");
		String infx = in.nextLine();
		System.out.println("infx: " + infx);

		// infxToPostFx conversion
		infxToPostFx(infx);

		// For the extras that are on the stack
		extras();

		// printing out what is on the stack
		display();

	}

	public static void infxToPostFx(String infx) {

		for (int i = 0; i < infx.length(); i++) {

			Character element = infx.charAt(i); // new char every time (auto boxing)

			if (Character.isAlphabetic(infx.charAt(i))) { // adding the string to postfx
				postfx += element;
			}

			else { // if its anything else besides a alphabet

				if (infx.charAt(i) == '+' || infx.charAt(i) == '-') { // take out everything
					// if it is a + or - it takes everything out of stack because least priority

					while (!stack.isEmpty()) { // this takes everything out of the loop
						postfx += stack.pop(); // takes out everything and adds current things to postfx
					}
					
					stack.push(infx.charAt(i)); // then puts the + or - operator on the stack
				}

				else { // we already know it is either *, %, /

					// add the top of the stack to the post fx if the top is that
					while (stack.peek() == '/' || stack.peek() == '*' || stack.peek() == '%') {
						postfx += stack.pop(); // adding to the postfx
					}
					// then add it to the stack
					stack.push(infx.charAt(i)); // this is putting everything other than + or - onto stack
				}
			}
		}
	}

	public static void extras() { // adding the extras in the stack to the postfx
		char extras;
		if (!stack.isEmpty()) {
			extras = stack.pop();
			postfx += extras;
		}
	}

	public static void display() {
		// printing out what is on the stack
		System.out.print("postfx: " + postfx);
		char c;
		for (int i = 0; i < stack.size(); i++) {
			c = stack.pop();
			System.out.print(c);
		}
	}
}
