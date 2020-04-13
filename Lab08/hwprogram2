package HW08BinarySearchTrees;

import java.util.Scanner;

public class Problem2Redo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MorseTree tree = new MorseTree();
	//	tree.input();
	//	tree.readFile();
	//	System.out.println(tree.input2darray());
		tree.fillTree();
		tree.displayInOrder();
		tree.count();
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter a text in morse code with spaces in between letters and / in between words");
		String str = in.nextLine();
		String [] arr = str.split(" ");
		
		// going through the array (need to make a traverse thing)
		for (int i = 0; i< arr.length; i++) {
			tree.traversed(arr[i]);
		}
		
		//System.out.println(stringToEnglish(str));
		return ;

	}

}
