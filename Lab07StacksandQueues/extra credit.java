package HW07StacksandQueues;

import java.util.*;

public class ExtraCredit {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CONVERTING FROM INFX TO POSTFX

		System.out.println("What is your infx: ");
		String infx = in.nextLine();
		System.out.println("infx: " + infx);
		String postfx = "";
		Stack<Character> stack = new Stack<Character>();
		boolean check = false;

		for (int i = 0; i < infx.length(); i++) {

			Character element = infx.charAt(i); // new char every time

			if (Character.isAlphabetic(infx.charAt(i))) {
				postfx += element;
			}

			else if (infx.charAt(i) == '+' || infx.charAt(i) == '-' || infx.charAt(i) == '-' ||
					infx.charAt(i) == '/' || infx.charAt(i) == '*' || infx.charAt(i) == '%'){

				if (infx.charAt(i) == '+' || infx.charAt(i) == '-') { // take out everything
					// if it is a + or - it takes everything out of stack because least priority

					while (!check && !stack.isEmpty()) { // this takes everything out of the loop
						postfx += stack.pop(); // put it onto the postfx
					}
					stack.push(infx.charAt(i)); // only puts on the plus or the minus on the stack
				}

				else { // we already know it is either *, %, /

					// add the top of the stack to the post fx if the top is that
					while ((!check) && !stack.isEmpty() && (stack.peek() == '/' || stack.peek() == '*' || stack.peek() == '%')) {
						postfx += stack.pop(); // adding to the postfx
					}
					// then add it to the stack
					stack.push(infx.charAt(i)); // this is putting everything other than + or - onto stack
				}
			}
			
			
			else if (infx.charAt(i) == '(') { // if it is an open parenthesis 
				check = true;
				stack.push(infx.charAt(i));
				
			}
			else { // if it is a closed parenthesis
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfx += stack.pop();
				}
				stack.pop();
				check = false;
			}
		}

		// For the extras that are on the stack
		char extras;
		if (!stack.isEmpty()) {
			extras = stack.pop();
			postfx += extras;
		}

		// printing out what we have
		System.out.print("postfx: " + postfx);
		char c;
		for (int i = 0; i < stack.size(); i++) {
			c = stack.pop();
			System.out.print(c);
		}

	}

}
