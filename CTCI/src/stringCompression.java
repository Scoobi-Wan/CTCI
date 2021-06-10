
public class stringCompression {

	/*
	 * Author: Paul Rich 
	 * Problem: Cracking The Coding Interview 1.6 
	 * Notes: Loops the string char by char, uses nested while loop to peek ahead for equal
	 *  characters and returns the compressed information as a new string.
	 * *Compressed string is only returned if it is shorter than original string
	 */
	public String solution(String str) {
		String compressed = "";

		// Go char by char, peek ahead to see if following chars are equal, and add to
		// compressed string
		for (int i = 0; i < str.length();) {

			// Always going to have at least 1 in a row (the current char)
			int inARow = 1;

			// Peek ahead and check if following chars are equal
			while (i + inARow < str.length() && str.charAt(i + inARow) == str.charAt(i)) {
				inARow++;
			}

			// Add the current char + the number of those chars in a row to compressed
			// string
			compressed += String.valueOf(str.charAt(i)) + inARow;

			// Increment i by the number of equal chars in a row
			i += inARow;
		}

		// return whatever is smaller, the compressed string or the original string
		return compressed.length() < str.length() ? compressed : str;
	}
}
