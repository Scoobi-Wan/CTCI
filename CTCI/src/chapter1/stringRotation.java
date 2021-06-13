package chapter1;

public class stringRotation {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 1.9
	 * Notes: concatenates the string onto itself in order to get the letters of the word in order 
	 * 		  if the rotation exists.
	 * Requirements: str1 is the rotated word
	 * 				 str2 is the word to check for
	 */
	public boolean solution(String str1, String str2) {
		
		str1 = str1 + str1;
		return str1.contains(str2);
		
	}
}
