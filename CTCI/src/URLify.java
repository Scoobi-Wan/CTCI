
public class URLify {

	public char[] solution(char[] str, int strlen) {
		 int newlen = strlen;
		 int i = 0;
		 while (i < strlen) {
			 if (str[i] == ' ') {
				 newlen += 2;
			 }	
			 i++;
		 }
		 char[] updatedArray = new char[newlen];
		 i = 0;
		 int j = 0;
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
