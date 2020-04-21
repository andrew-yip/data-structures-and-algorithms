package HW09MapsAndHashMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1Redo {
	
	public static Scanner in = new Scanner(System.in); // to scanner for input
	public static PrintWriter out; // to write to the file
	public static File inputFile;
	public static Scanner fileScanner; // scans the file
	public static Map<String, Integer> HashmaptoCountWords = new HashMap<String, Integer>(); // creating a map

	public static void main(String[] args) {
		
		
		// TASK 1: READ IN THE STRING THAT WAS INPUT:
		
		System.out.println("using a hashmap, enter a text to count the number of words that are in an entered string: ");
		
		String str = in.nextLine(); // takes an input string
		
		HashmaptoCountWords = getWordData(str); // updating the hash map after you update all the 'count' values
		
		for (String key : HashmaptoCountWords.keySet()) {
			System.out.println(key + ": " + HashmaptoCountWords.get(key)); // prints the key along with the value
		}
		
		
	}
	
	public static Map<String,Integer> getWordData(String str){
		
		String [] arr = str.split(" "); // takes tin the whole input string and places it in an array and splits it by spaces
		
		for (int i = 0; i< arr.length; i++) {
			
			String wordatspot = arr[i].toLowerCase(); // converts the whole word to lowercase
			
			if (wordatspot.contains(".") || wordatspot.contains(",")) { // if there is a period or comma, it removes it
				
				if (wordatspot.contains(".")) {
					
				wordatspot = wordatspot.replace(".", ""); // how to remove the period
				}
				
				if (wordatspot.contains(",")) {
					
					wordatspot = wordatspot.replace(",", ""); // how to remove the comma
					
					}
			}
			
			
			// TASK 2: CHECK IF THE KEYWORD EXISTS - IF NOT ADD IT, OTHERWISE INCREMENT THE VALUE
			
			// this also really works because HashMaps can only have one key (there are no duplicate keys)
			
			if (HashmaptoCountWords.containsKey(wordatspot)) { // if the key is there already there
				
				HashmaptoCountWords.put(wordatspot, HashmaptoCountWords.get(wordatspot) + 1); // add one to the count
			}
			
			else {
				HashmaptoCountWords.put(wordatspot, 1); // just have one
			}
		}
		
		return HashmaptoCountWords;
	}
	

}
