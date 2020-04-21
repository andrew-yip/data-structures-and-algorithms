// INCLUDES SORTING THE LINKED LIST

package HW06FilesandLinkedLists;

public class LinkedListRedo {
	// Attributes:
	private Student first; // just pointers because not initialized
	private Student last;

	// Constructor:
	public LinkedListRedo() {
		first = null;
		last = null;
	}

	// Member Methods:
	public void addNode(String fn, String ln, int n) { // add node to back
		Student s = new Student(fn, ln, n);

		// Scenario 1: No Nodes in the list
		if (first == null) { // if the first is currently null then you set first/last as temp
			first = s;
			last = s;
		} else {
			last.next = s; // connecting the last to current temp
			last = s; // last points to temp
		}
	}

	public void display() {
		Student travel = first;

		while (travel != null) {
			System.out.println(travel.fn + travel.ln + " scored: " + travel.score + " ");
			travel = travel.next;
		}
	}
	
	public int count () { // to find the size of the linked list
		int counter = 0;
		Student travel = first;
		while (travel!= null) {
			counter++;
			travel = travel.next;
		}
		return counter;
	}
	
	public void sort (LinkedListRedo list ) { // outer while loop like ours
		for (int i = 0; i< (list.count())-1; i++) {
			Student temp = first; // temp is what is traversing through the linked list
			Student before = first;
			
			while (temp.next != null) { // we do temp.next because were checking two values at a time
				Student after = temp.next; // after is the value after temp
				if (temp == first) { // only for the very first numbers in the list
					if (temp.score > after.score) { // checking the next score but only for first score
						temp.next = after.next;
						first = after;
						first.next = temp;
						before = first;
					} else {
						temp = temp.next; // otherwise iterates the temp
					}
				}
				else {
					if (temp.score > after.score) { // if temp is > after which is temp.next
						temp.next = after.next; // pointing to itself
						before.next = after;
						after.next = temp;
						before = before.next; // iterating before
					}
					else { // otherwise iterate before and temp
						before = before.next;
						temp = temp.next;
					}
				}
			}
		}
	}

}
