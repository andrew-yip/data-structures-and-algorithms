package HW07StacksandQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// abstract class that implementing a linked list
		// remove from the front and adds to the back
		
		Queue<String> list = new LinkedList<String>(); // the linked list class implements queue interface

		// adding to the queue (linked list)
		addNames(list);
		
		System.out.println(list);

		while (list.size() > 1) {
			
			// remove 2 people at a time & add them to the back of the list
			for (int i = 0; i < 2; i++) {
				String removed = list.remove();
				list.add(removed);
			}
			
			// display the queue
			System.out.println(list);
			
			// removes the first one
			list.remove();
			System.out.println(list);
		}
	}
	
	public static void addNames (Queue<String> list) { // method to add the necessary names
		list.add("Bobo");
		list.add("Ruth");
		list.add("Ned");
		list.add("Sam");
		list.add("Ari");
		list.add("Barb");
		list.add("Lucy");
	}
}
