package HW08BinarySearchTrees;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MorseTree {
	
	public static File inputFile;
	public static Scanner fileScanner; // scans the file
	public static PrintWriter out; // to write to the file

	public MorseNode root;
	public int count;
	// public MorseNode travel;
	public String[][] tree = { { "ROOT", "" }, { "E", "." }, { "T", "-" }, { "I", ".." }, { "A", ".-" }, { "N", "-." },
			{ "M", "--" }, { "S", "..." }, { "U", "..-" }, { "R", ".-." }, { "W", ".--" }, { "D", "-.." },
			{ "K", "-.-" }, { "G", "--." }, { "O", "---" }, { "H", "...." }, { "V", "...-" }, { "F", "..-." },
			{ "L", ".-.." }, { "P", ".--." }, { "J", ".---" }, { "B", "-..." }, { "X", "-..-" }, { "C", "-.-." },
			{ "Y", "-.--" }, { "Z", "--.." }, { "Q", "--.-" } };

	public MorseTree() { // initializing an empty tree
		this.root = null;
	}

	public void fillTree() {

		for (int i = 0; i < tree.length; i++) { // going through each thing in the 2d array

			MorseNode travel = root;

			MorseNode temp = new MorseNode(tree[i][0], tree[i][1]);
			count++;

			if (root == null) { // only for the first time around
				root = temp;
			}

			else { // if the root is not == to null

				String morse = tree[i][1]; // that morse chracter
				
				
				if (morse.length() == 1) { // only for the first two childs (e and t) 
					if (morse.equals(".")) {
						travel.left = temp;
					}
					else {
						travel.right = temp;
					}
				}
				
				else { // if the length is greater than 1
					
				if (morse.charAt(0) == '.') { // if it starts with a period
					
					travel = travel.left;

					// need loop here to tell you where to go and traverse to go within tree and
					// where to add in the tree

					
					  /*while (travel.left != null) { // THE PROBLEM IS THAT IT JUST KEEPS PUTTING IT TO THE LEFT 
					  travel = travel.left; 
					  } 
					  travel.left = temp;*/
					for (int j = 1; j < morse.length(); j++) { // to go through the morse code
						if (morse.charAt(j) == '.') {
							
							if (travel.left != null) {
								travel = travel.left;
							} else {
								travel.left = temp;
							}
						} else {
							
							if (morse.charAt(j) == '-') {
								if (travel.right != null) {
									travel = travel.right;
								} else {
									travel.right = temp;
								}
							}
						}
					}
				}

				else { // if it starts with a DASH
					
					travel = travel.right;

					// need loop here to tell you where to go and traverse to go within tree

					  /*while (travel.right != null) { 
						  travel = travel.right; } 
					  travel.right = temp;*/
					 
					// System.out.println(travel.letter + " and " + travel.morse);
						
					for (int j = 1; j < morse.length(); j++) { // to go through the morse code
						if (morse.charAt(j) == '.') {
							
							if (travel.left != null) {
								travel = travel.left;
							} 
							
							else {
								travel.left = temp;
							}
						} else {
							
							if (morse.charAt(j) == '-') {
								
								if (travel.right != null) {
									travel = travel.right;
								} else {
									travel.right = temp;
								}
							}
						}
					}
					}
				}
			}
			
			}
		}
	

	// TO TRAVERSE THROUGH THE WHOLE TREE

	public void displayInOrder() { // method to display in order
		inOrderRecursive(root); // passing root from the start to inOrderRecursive method
	}

	private void inOrderRecursive(MorseNode travel) { // in order display method

		if (travel != null) {

			inOrderRecursive(travel.left); // goes all the way to the left until is equal to null

			System.out.println("Alphabet: " + travel.letter + " " + "      Letter: " + travel.morse); // think of it
																										// like a stack

			inOrderRecursive(travel.right); // goes all the way to the right until is equal to null
		}

	}

	public void count() {
		System.out.println("number of nodes: " + count);
	}

	public void traversed(String spotatarray) { // where we find that spot & return letter that the morse code
		MorseNode travel = root;
		
		if (spotatarray.equals("/") || spotatarray.equals("-----") || spotatarray.equals(".----")
				|| spotatarray.equals("..---") || spotatarray.equals("...--")
				|| spotatarray.equals("....-") || spotatarray.equals(".....") 
				|| spotatarray.equals("-....") || spotatarray.equals("--...")
				|| spotatarray.equals("---..") || spotatarray.equals("----.")
				|| spotatarray.equals(".-.-")  || spotatarray.equals("--..--")
				|| spotatarray.equals("..--..")){
			
			if (spotatarray.equals("/")) {
				System.out.print(" ");
				return ;
			}
			if (spotatarray.equals("-----")) {
				System.out.print("0");
				return;
			}
			if (spotatarray.equals(".----")) {
				System.out.print("1");
				return;
			}
			if (spotatarray.equals("..---")) {
				System.out.print("2");
				return;
			}
			if (spotatarray.equals("...--")) {
				System.out.print("3");
				return;
			}
			if (spotatarray.equals("....-")) {
				System.out.print("4");
				return;
			}
			if (spotatarray.equals(".....")) {
				System.out.print("5");
				return;
			}
			if (spotatarray.equals("-....")) {
				System.out.print("6");
				return;
			}
			if (spotatarray.equals("--...")) {
				System.out.print("7");
				return;
			}
			if (spotatarray.equals("---..")) {
				System.out.print("8");
				return;
			}
			if (spotatarray.equals("----.")) {
				System.out.print("9");
				return;
			}
			if (spotatarray.equals(".-.-")) {
				System.out.print(".");
				return;
			}
			if (spotatarray.equals("--..--")) {
				System.out.print(",");
				return;
			}
			if (spotatarray.equals("..--..")) {
				System.out.print("?");
				return;
			}
			if (spotatarray.equals("|")) {
				System.out.print("");
				return;
			}	
		}
		
		
		else  { // if the decoded is not a | or puncutation
			
		for (int i = 0; i < spotatarray.length(); i++) {

			// how we travel to where the right spot is

			if (spotatarray.charAt(i) == '.') { // if it is a period go to the left

				if (travel.left != null) {
					travel = travel.left;
				}

			} else {

				if (travel.right != null) {
					travel = travel.right;
				}
			}
		}
		System.out.print(travel.letter.toLowerCase());
		}
	}
	
	/*public void readFile () {
		
		Scanner in = new Scanner (System.in);
		try {
			inputFile = new File("/Users/andrewyip/Downloads/encodings.txt"); // input file // reading into eclipse
			fileScanner = new Scanner(inputFile); // scans the file
			
			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			
			//readFile();
			readingtofile();
			} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found.");
			} finally {
			fileScanner.close();
			}	
	}
	
	public static void input () {
		
		try {
			// INSTANTIATE AN OUTPUT FILE STREAM AND LINK IT TO THE OUTPUT FILE
			out = new PrintWriter("/Users/andrewyip/Downloads/encodings.txt"); // creates the file
			getInput(); // input to the file
			out.close(); // closes file
		} catch (FileNotFoundException e) {
			System.out.println("Error - This file could not be found."); // if file can't be found
		} finally {
			out.close(); // closes it finally if not // final chunk of code it runs
		}
	}
	
	public static void getInput() {
		Scanner in = new Scanner (System.in);
		System.out.println("What would you like to input? (Type in a number when finished)");
		while (!in.hasNextInt()) {
			out.println(in.next());
		}
	}
	
	public static void readingtofile() { // method for reading the file
		String s = "";
		System.out.println("Your input text: ");
		
		while(fileScanner.hasNext()) { // this reads the file
		s = fileScanner.next(); // ohhhh s is the input
		System.out.print(s + " ");
		}
		}
	
	public String [][] input2darray () {
		String [][] arr = new String [27][2];
		String letter;
		String morse;
		int i = 0;
		
		
		while (fileScanner.hasNext()) {
			letter = fileScanner.next();
			morse = fileScanner.next();
			arr[i][0] = letter;
			arr[i][1] = morse;
			
		}
		
		return arr;
	}*/
	}
