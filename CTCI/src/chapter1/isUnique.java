package chapter1;
import java.util.HashMap;

public class isUnique {

	public isUnique() {
		
	}
	
	public boolean solution(String str) {
		
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			if (charMap.containsKey(currChar)) {
				return false;
			} else {
				charMap.put(currChar, 1);
			}
		}
		
		return true;
		
	}
	
	
	public boolean solution2(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
