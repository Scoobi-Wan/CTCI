import java.util.HashMap;

public class checkPerm {

	public checkPerm() {
		
	}
	/*
	 * Author: Paul Rich
	 * Problem: Cracking the Coding Interview 1.2
	 * Notes: Uses 2 HashMaps to track character counts and then compares equality
	 * 		  of the HashMaps to determine if the strings are permutations of each
	 * 		  other.
	 */
	public boolean solution(String str1, String str2) {
		// Two HashMaps to hold the characters and their counts from the string
		HashMap<Character, Integer> str1Map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> str2Map = new HashMap<Character, Integer>();
		
		// First the easy check, if they are different lengths, they cant be permutations of each other
		if (str1.length() != str2.length()) {
			return false;
		}
		
		// Next loop the 2 strings inserting their contents into the Map
		for (int i = 0; i < str1.length(); i++) {
			
			// Get the current char of each string
			char char1 = str1.charAt(i);
			char char2 = str2.charAt(i);
			
			// First check String 1s current character
			
			if (str1Map.containsKey(char1)) {
				// the Map contains the character, increase its count value
				str1Map.put(char1, str1Map.get(char1) + 1);
			} else {
				// the map does not have the character, add it and set count value to 1
				str1Map.put(char1, 1);
			}
			
			// Now check String 2s current character
			
			if (str2Map.containsKey(char2)) {
				// the Map contains the character, increase its count value
				str2Map.put(char2, str2Map.get(char2) + 1);
			} else {
				// the map does not have the character, add it and set count value to 1
				str2Map.put(char2, 1);
			}
			
		}
		
		// Compare the HashMaps, only equal if all same key, value pairs are equal in each
		return str1Map.equals(str2Map);
		
	}
}
