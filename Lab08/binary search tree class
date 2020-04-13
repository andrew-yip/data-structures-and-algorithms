package HW08BinarySearchTrees;

public class BST {

	public Node root;
	public int count;
	public int singles;

	public BST() {
		// THE ROOT IS INITIALIZED TO NULL. TREES BEGIN EMPTY
		root = null;
	}

	// ADD A NODE
	public void addNode(int n) {

		// CREATE A TEMPORARY NODE
		Node temp = new Node(n);
		count++;

		// SCENARIO 1: IF THE TREE IS EMPTY, PLACE THE FIRST ITEM AT THE ROOT
		if (root == null) {
			root = temp;
		}

		// SCENARIO 2: ASSUME THERE WILL NOT BE DUPLICATE NODES

		// SCENARIO 3: SEARCH THE CORRECT LOCATION

		else { // if the tree is not empty

			Node travel = root; // start traveling at root

			while (true) { // like recursion (keep searching until breaks)

				// test 1: travel to the left

				if (temp.value < travel.value) { // if its less than the current root value

					if (travel.left != null) { // if there is something there run while loop again
						travel = travel.left; // reassigning travel to left node
					}

					else {

						travel.left = temp; // that spot is temp which is the new node
						break; // break when you set it equal to something
					}
				}

				// test 2: travel to the right

				else { // if the temp value is greater than the root

					if (travel.right != null) { // if there is something there run while loop again
						
						travel = travel.right; // reassigning travel to right node
						
					} else {
						
						travel.right = temp; // that spot is temp which is the new node
						break; // break when you set it equal to something
					
					}
				}
			}
		}

	}

	public void deleteNode(int num) {
		// TASK 1: DECLARE REFERENCES TO A CHILD AND PARENT NODE

		Node toBeRemoved = root; // initially what we're using to (traverse)
		Node parent = null; // who the parent is of that node that we are removing // reassign or by pass
							// the node (we don't know what the parent is yet)
		boolean found = false;
		count--;

		// TASK 2: LOCATE THE NODE (first thing we need to do is find the node) (see if it exists)

		while (!found && toBeRemoved != null) { // keeps running until it is found (will always run initially)

			// binary search tree is sorted so this method works

			// first we check if that toBeRemoved.value is the number we want to remove
			if (num == toBeRemoved.value) { 
				found = true; 
			}

			else { // how we are traversing down the tree

				parent = toBeRemoved; // always gets repositioned to the one above
				// to be removed moves faster than parent

				if (num > toBeRemoved.value) { // if greater than move to the right
					toBeRemoved = toBeRemoved.right;
				} else { // otherwise move to the left
					toBeRemoved = toBeRemoved.left;
				}
			}
		} // in the end, found will be true if it is found but if not its going to be
			// false the whole time
			// in the above is where we locate parents & toBeRemoved
		
		

		// TASK 3: IF THE NODE ISN'T FOUND END

		if (!found) {
			System.out.println("Node isn't found !");
			count++;
			return; // if nothing is found print not found and then exit loop immediately
		}
		
		

		// SCENARIO 1: ONE OF THE SUBTREES IS EMPTY (toBeRemoved is the parent of what
		// we're removing)
		// if the one to be removed has no child or one child

		// IF TOBEREMOVED HAS ONE OR NO CHILDREN (if one is equal to null)
		if (toBeRemoved.left == null || toBeRemoved.right == null) { // if one of the subtrees are empty

			// TASK 1: IF ONE OF THE CHILD NODES IS EMPTY. USE THE OTHER (determining which is the child)

			Node theChild; 

			if (toBeRemoved.left == null) { // if there is nothing there on the left side
				theChild = toBeRemoved.right; // the child is the right one
			}

			else { // wise versa if the right one is null
				theChild = toBeRemoved.left; // the child is the left one
			}
			
			
			// TASK 2: DEAL WITH THE SITUATION IF THE PARENT IS NULL (these are the changing
			// pointers from parent -> to new child)

			if (parent == null) { // WHAT DOES THIS MEAN
				root = theChild;
			} 
			
			else if (parent.left == toBeRemoved) { // if parent.left is the same as toBeRemoved
				parent.left = theChild; // parent.left point changes to the child
			} 
			
			else { // parent.right == removed
				parent.right = theChild; // parent points changes to the child
			}
			return; // return nothing go exit method
			
		}
		
		

		// SCENARIO 2: NEITHER SUBTREE IS EMPTY （if there are two childs or connections)

		// TASK 1: FIND THE SMALLEST ELEMENT OF THE RIGHT SUBTREE & swap it with the one removing

		Node smallestParent = toBeRemoved; // the parent of smallest
		Node smallest = toBeRemoved.right; // to find the smallest value

		// to find the smallest element node
		while (smallest.left != null) { // moving to find the smallest in that subtree
			smallestParent = smallest; // smallest parent of the subtree(one above the smallest element)
			smallest = smallest.left; // moving to the smallest (traversing to the smallest)
		}

		// TASK 2: NOW SMALLEST CONTAINS SMALLEST CHILD IN RIGHT SUBTREE
		// MOVE CONTENTS

		toBeRemoved.value = smallest.value; // swapping the values with the smallest

		if (smallestParent == toBeRemoved) { // this only runs if there is more to the tree than just two childs further
												// than 2 childs
			smallestParent.right = smallest.right;
		}

		else { // mainly focus on this line of code
			smallestParent.left = smallest.right; // bascially moving up a spot by moving to the left of the parent which is above
		}
	}

	// IN ORDER TRAVERSAL

	public void displayInOrder() { // method to display in order
		inOrderRecursive(root); // passing root from the start to inOrderRecursive method
	}

	private void inOrderRecursive(Node travel) { // in order display method

		if (travel != null) {

			inOrderRecursive(travel.left); // goes all the way to the left until is equal to null

			System.out.println(travel.value); // think of it like a stack

			inOrderRecursive(travel.right); // goes all the way to the right until is equal to null
		}
	}

	public void CountNodes() {
		System.out.println("Number of nodes: " + count);
	}

	public void countsingleParent(Node travel) {

		if (travel != null) {

			countsingleParent(travel.left); // goes all the way to the left until is equal to null

			if ((travel.left == null && travel.right != null) || (travel.right == null && travel.left != null)) {
				singles++;
				System.out.println("singles parent node is: " + travel.toString());
			}

			countsingleParent(travel.right); // goes all the way to the right until is equal to null
		}
	}

	public void singleParent() {
		singles = 0;
		countsingleParent(root);
		System.out.println("single parents: " + singles);
	}
}
