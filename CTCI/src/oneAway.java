import java.util.HashMap;

public class oneAway {

	public boolean solution(String str1, String str2) {
		
		int i = 0;
		int j = 0;
		int differences = 0;
		
		// in this case more than 1 letter would have to be changed
		if (Math.abs(str1.length()- str2.length()) > 1) {
			return false;
		}
		
		while (i < str1.length() && j < str2.length() && differences <= 1) {
			if (str1.charAt(i) != str2.charAt(j)) {
				differences++;
				if (str1.charAt(i + 1) == str2.charAt(j)) {
					i++;
					continue;
				} else if (str1.charAt(i) == str2.charAt(j + 1)) {
					j++;
					continue;
				} else if (str1.charAt(i + 1) == str2.charAt(j + 1)) {
					i++;
					j++;
					continue;
				} else {
					return false;
				}
			}
			
			i++;
			j++;
		}
		
		if (i < str1.length() || j < str2.length()) {
			differences++;
		}
		
		return differences < 2 ? true : false;
	}
}
