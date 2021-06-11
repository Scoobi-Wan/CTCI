import java.util.ArrayList;


/*
 * Author: Paul Rich
 * Problem: Cracking The Coding Interview 1.8
 * Notes: Uses a point class to track coordinates of zeros in the 2D array, then uses each point 
 * 		  to set row and columns to 0 after initial pass is complete. 2 passes is necessary to avoid
 * 	      setting numbers to 0 before they are checked. Otherwise the whole array will be 0s.
 */
public class zeroMatrix {
	public int[][] solution(int[][] input) {
		
		// inner class used to hold x, y coordinate point
		class point {
			int x; int y;
			private point(int x, int y) {
				this.x = x; this.y = y;
			}
		}
		
		// ArrayList used to hold locations (points) of the 0s in the array
		ArrayList<point> zeroLocs = new ArrayList<point>();
		
		// Initial loop to look for 0s in array
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == 0) {
					zeroLocs.add(new point(i, j));
				}
			}
		}
					
		// Look through the array list and for each point set its row and column to 0
		for (point p : zeroLocs) {
			
			// Set first/last variables to loop row
			int first = 0;
			int last = input.length;
			
			// First set the row to 0s
			while (first < last) {
				input[p.x][first] = 0;
				first++;
			}
			
			// Reset the first/last variables to loop column
			first = 0;
			last = input[0].length;
			
			// set the column to 0s
			while (first < last) {
				input[first][p.y] = 0;
				first++;
				}
			} 

			return input;
			
	}
}
