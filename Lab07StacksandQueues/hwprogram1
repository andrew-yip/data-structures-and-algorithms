package HW07StacksandQueues;

import java.util.Stack;

public class Problem1Redo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s1 = new Stack<String>(); // made a new stack
		Stack<String> restored1 = new Stack<String>(); // restored stack
		String input = "Twinkle twinkle little star. How I wish I was where you are.";
		System.out.println("Input: " + input);
		System.out.println();

		String[] arr = input.split(" "); // splitting the string with spaces
		
		countPeriods(arr); // not used but good practice

		// placing each word into the stack
		System.out.print("Output: ");
		
		for (int i = 0; i < arr.length; i++) {

			String str = arr[i].toLowerCase(); // saying the array[i] is this string
			
			if (str.equals("i")) { // no matter what if it is 'i' we want to capitalize it
				str = str.toUpperCase(); 
			}

			if (str.contains(".")) { // if it has a period make it capitalize
				str = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1, arr[i].length() - 1);
			}
			
			// if it is no 'i' or a string with a period it just pushes original onto the stack

			s1.push(str); // no matter what pushes it onto the stack

			// if this string has a period, it displays it after it is pushed onto the stack
			if (arr[i].contains(".")) { // we stop when we see a period
				display(s1, restored1); // display what exists as soon as you see a period (LAST IN FIRST OUT)
			}
		}
		
		// Restoring the original stack (not needed but good practice for keeping stack alive)
		restore (s1, restored1);
	}

	public static void display(Stack<String> s1, Stack <String> restored1) {
		
		String word;
		
		while (!s1.isEmpty() && s1.size() > 1) { // we do this because
			word = s1.pop();
			restored1.push(word);
			System.out.print(word + " ");
		}
		
		// gets the last word and adds a period to the end
		word = s1.pop();
		System.out.print(word);
		System.out.print(". ");
	
	}
	
	public static void restore (Stack<String> s1, Stack <String> restored1) {
		while (!restored1.isEmpty()) { // this puts it back into s1 (restoring s1)
			s1.push(restored1.pop());
		}
	}
	
	public static int countPeriods (String [] arr) { // method for counting how many periods are in the string
		
		// to count how many periods there are in the array
		int periodCount = 0;
		for (int i = 0; i < arr.length; i++) { // IN THE END THIS IS NOT NEEDED
			if (arr[i].contains(".")) {
				periodCount++;
			}
		}
		return periodCount;
	}
	
	
}
