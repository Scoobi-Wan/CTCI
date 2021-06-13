package chapter1;
import java.util.HashMap;

public class palinPerm {
	
	/*
	 * Author: Paul Rich
	 * Problem: Cracking the Coding Interview 1.4
	 * Notes: loops through the string and adds characters to a HashMap, then loops
	 * 		  the key, value pairs in the HashMap to determine if the string is a 
	 * 		  permutation of a palindrome.
	 */
	public boolean solution(String str) {
		// Use the HashMap to track occurrences of characters
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		// Loop through the string and add each char to the map
		for (int i = 0; i < str.length(); i++) {
			
			// Get the current char to examine
			char currChar = str.charAt(i);
			
			// ignore spaces, dont add to the map
			if (currChar != ' ') {
				// increase the count if the char is already in map, else add with init val of 1
				if (myMap.containsKey(currChar)) {
					myMap.put(currChar, myMap.get(currChar) + 1);
				} else {
					myMap.put(currChar, 1);
				}
			}
			
		}
		
		// use to track how many unpaired characters are in the string
		int soloCount = 0;
		
		// loop through the map to check the character counts
		for (Character c : myMap.keySet()){
			
			// if greater than 1, fails requirement of a palindrome
			if (soloCount > 1) {
				return false;
			}
			// char count can be > 2 but only 1 char can be unpaired overall.
			if (myMap.get(c) % 2 == 1) {
				soloCount++;
				if (soloCount > 1) {
					return false;
				}
			}
		}
		
		// if we made it this far, its a permutation of a palindrome. Super!
		return true;
		
	}

	
	
	
	
}
