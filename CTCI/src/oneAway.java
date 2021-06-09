import java.util.HashMap;

/*
 * Author: Paul Rich
 * Problem: Cracking The Coding Interview 1.5
 * Notes: loop though both strings in same pass with separate indexes.
 * 		  Increment independent indexes to check for equality of next letters
 * 		  and use a 'edits' value to track how many edits would have to be made.
 */
public class oneAway {

	public boolean solution(String str1, String str2) {

		int i = 0;
		int j = 0;
		int edits = 0;

		// in this case more than 1 letter would have to be changed
		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}

		// 3 conditions in the while loop: (1) str1 and (2) str2 have chars remaining
		// (3) edits needed is 1 or less.
		while (i < str1.length() && j < str2.length() && edits <= 1) {

			// if the current character comparison is unequal, increment the edits value
			if (str1.charAt(i) != str2.charAt(j)) {
				edits++;
				// if the next char in str1 equals str2's current char, increment 'i' index and
				// continue
				// *Represents the 'add/remove' type of edits
				if (str1.charAt(i + 1) == str2.charAt(j)) {
					i++;
					continue;
					// if the next char in str2 equals str1's current char, increment 'j' index and
					// continue
					// *Represents the 'add/remove' type of edits
				} else if (str1.charAt(i) == str2.charAt(j + 1)) {
					j++;
					continue;
					// if the next char in each is equal, increment both indexes and continue
					// *Represents the 'replace' type of edit
				} else if (str1.charAt(i + 1) == str2.charAt(j + 1)) {
					i++;
					j++;
					continue;
				} else {
					return false;
				}
			} else {
				// compared characters are equal, increment both indexes
				i++;
				j++;
			}

		}

		// Final check to see if there is an extra char left on one of the strings
		// If this is the case, it represents another edit needed
		if (i < str1.length() || j < str2.length()) {
			edits++;
		}

		// Finally if edits needed is 1 or 0 return true, otherwise false
		return edits < 2 ? true : false;
	}
}
