
public class zeroMatrix {
	public int[][] solution(int[][] input) {
		
		int[][] toReturn = new int[input.length][input[0].length];
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == 0) {
					int first = 0;
					int last = input.length;
					while (first < last) {
						toReturn[i][first] = 0;
						first++;
					}
					first = 0;
					last = input[0].length;
					while (first < last) {
						toReturn[first][j] = 0;
						first++;
					}
				} else {
					if (toReturn[i][j] != 0 ) {
						toReturn[i][j] = input[i][j];
					}
				}
			}
		}
		
		
		
		return toReturn;
	}
}
