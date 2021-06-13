package chapter1;

public class URLify {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 1.3
	 * Notes: 
	 */
	public char[] solution(char[] str, int strlen) {
		 
		 // newlen will be used to find needed length of the URLified character array
		 int newlen = strlen;
		 
		 // int i: used as index for loops
		 int i = 0;
		 
		 // first loop: if current char is a space, increase newlen by 2 (for '20' in '%20')
		 while (i < strlen) {
			 if (str[i] == ' ') {
				 newlen += 2;
			 }	
			 i++;
		 }
		 
		 // Declaration of URLified character array
		 char[] updatedArray = new char[newlen];
		 
		 // reset the index
		 i = 0;
		 // int j: used to index the URLified character array since indexes will be out of sync
		 int j = 0;
		 
		 // second loop: traverse character array, if character is a space, add %,2,0 to the character array
		 // otherwise add the original character
		 while (j < newlen) {
			 if (str[i] == ' ') {
				 updatedArray[j] = '%';
				 updatedArray[j + 1] = '2';
				 updatedArray[j + 2] = '0';
				 i++;
				 j += 3;
			 } else {
				 updatedArray[j++] = str[i++];
			 }
		 }
		 return updatedArray;
	}
}
