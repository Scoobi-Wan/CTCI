import java.util.HashMap;

public class checkPerm {

	public checkPerm() {
		
	}
	
	public boolean solution(String str1, String str2) {
		HashMap<Character, Integer> str1Map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> str2Map = new HashMap<Character, Integer>();
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		for (int i = 0; i < str1.length(); i++) {
			
			char char1 = str1.charAt(i);
			char char2 = str2.charAt(i);
			
			if (str1Map.containsKey(char1)) {
				str1Map.put(char1, str1Map.get(char1) + 1);
			} else {
				str1Map.put(char1, 1);
			}
			
			if (str2Map.containsKey(char2)) {
				str2Map.put(char2, str2Map.get(char2) + 1);
			} else {
				str2Map.put(char2, 1);
			}
			
		}
		
		return str1Map.equals(str2Map);
		
	}
}
