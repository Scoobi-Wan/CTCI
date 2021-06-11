import java.util.ArrayList;

public class zeroMatrix {
	public int[][] solution(int[][] input) {
		class point{
			int x; int y;
			private point(int x, int y) {
				this.x = x; this.y = y;
			}
		}
		
		ArrayList<point> zeroLocs = new ArrayList<point>();
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == 0) {
					zeroLocs.add(new point(i, j));
				}
			}
		}
					
		for (point p : zeroLocs) {
					
			int first = 0;
			int last = input.length;
			while (first < last) {
				input[p.x][first] = 0;
				first++;
			}
			
			first = 0;
			last = input[0].length;
			while (first < last) {
				input[first][p.y] = 0;
				first++;
				}
			} 

			return input;
			
	}
}
