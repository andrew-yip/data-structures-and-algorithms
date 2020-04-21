package HW08BinarySearchTrees;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TASK 1: INSTANTIATE A BINARY TREE
		BST tree = new BST ();
		
		// TASK 2: ADD NODES TO THE BINARY TREE
		tree.addNode(8);
		tree.addNode(4);
		tree.addNode(2);
		tree.addNode(3);
		tree.addNode(1);
		tree.addNode(6);
		tree.addNode(7);
		tree.addNode(5); 
		tree.addNode(12);
		tree.addNode(14);
		tree.addNode(9);
		tree.addNode(11);
		tree.addNode(13);
		tree.addNode(15);
		
		
		// TASK 3: DISPLAY THE NODES IN ORDER
		System.out.println("Display the nodes in order: ");
		tree.displayInOrder();
		
		// TASK 4: Write a definition and implementation of the function, 
		//CountNodes, that returns the number of nodes in the binary tree.
		tree.CountNodes();
		
		// TASK 5: Write a definition and implementation of the function, singleParent, 
		// that returns the number of nodes in the binary tree that have only one child.
		//tree.singleParent();
		
		System.out.println();
		tree.addNode(10);
		//tree.singleParent();
		
		tree.addNode(16);
		tree.singleParent();
		tree.CountNodes();
		
		// with deleting
		System.out.println();
		tree.deleteNode(16);
		tree.singleParent();
		tree.CountNodes();

	}

}
