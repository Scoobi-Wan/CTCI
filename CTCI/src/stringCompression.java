
public class stringCompression {
	
	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 1.6
	 * Notes: 
	 */
	public String solution(String str) {
		String compressed = "";
		
		for (int i = 0; i < str.length();) {
			int inARow = 1;
			while (i + inARow < str.length() && str.charAt(i + inARow) == str.charAt(i)) {
				inARow++;
			}
			compressed += String.valueOf(str.charAt(i)) + inARow;
			i += inARow;
		}
		
		return compressed.length() > str.length() ? compressed : str;
	}
}
