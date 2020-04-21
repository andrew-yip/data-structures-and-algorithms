package HW06FilesandLinkedLists;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num;

		Node first = null;
		Node last = null;

		// Task 1: Enter integers
		System.out.println("Enter integer " + 1 + ":");
		num = in.nextInt();
		Node temp = new Node(num); // creating a new node for every input
		first = temp;
		last = temp; // understand that they are all pointing to temp

		for (int i = 2; i <= 10; i++) { // for loop for filling nodes // and adding nodes
			System.out.println("Enter integer " + i + ":");
			num = in.nextInt();

			// Adding a new node to the end
			temp = new Node(num); // creating a new node for every input
			last.next = temp; // the previous last pointer is now pointing to the new temp
			last = temp; // last is now pointing to temp

		}

		// Task 2: Display the linked list
		Node travel = first; // travel is pointing to first
		System.out.println("Linked List: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(travel.n + " ");
			travel = travel.next;
		}

		// Task 3: Display every other node
		displayEveryOther(first);

		// Task 4: Delete all odd numbers in the linked list
		removeOddNodes(first);

	}
	
	public static void displayEveryOther (Node first) {
		Node travel2 = first; // travel is pointing to first // how we traverse through the linked list
		System.out.println("\nLinked List (displaying every other node): ");
		for (int i = 0; i < 5; i++) { // 5 times
			System.out.print(travel2.n + " ");
			travel2 = travel2.next.next;
		}
	}
	
	public static void removeOddNodes (Node first) {
		Node travel3 = first; // travel is pointing to first // how we traverse through the linked list
		System.out.println("\nLinked List (deleting odd #'s in linked list): ");

		while (travel3 != null && travel3.next != null) { // this while loop checks all the values from 2nd element fwd
			if (travel3.next.n % 2 == 1) {

				if (travel3.next == null) { // statement is just preventing the error
					// nothing happens
				} else {
					// how we want to remove it
					travel3.next = travel3.next.next; // points to the next one
				}

			} else {
				travel3 = travel3.next; // traverse
			}
		}
		
		// Outside the while loop & BEOFRE BECAUSE ONLY OUR FIRST NODE AFTER THE LOOP CAN BE ODD
		if (first.n % 2 == 1) { // if the first value is odd then change pointer
			first = first.next;
		}
		
		Node travel4 = first;
		while(travel4 != null) {
			System.out.print(travel4.n + " ");
			travel4 = travel4.next;
		}
	}
}
