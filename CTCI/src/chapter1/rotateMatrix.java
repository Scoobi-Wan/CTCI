package chapter1;
import java.util.ArrayList;

public class rotateMatrix {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 1.7
	 * Notes: Had to use the provided solution for guidance on this one.
	 * 		  The rotating of the different layers in place was tripping me up.
	 * 		  Ended up very close before looking at solution.
	 * 
	 *		  Uses an outer loop which goes layer by layer swapping values with new
	 *		  layer all trhe way around the square. (i.e. 4 swaps instead of 2)
	 *
	 */
	public int[][] solution(int[][] matrix) {
		
		int len = matrix.length;
		
		for (int layer = 0; layer < matrix.length / 2; layer++) {
			int first = layer;
			int last = len - 1 - layer;
			for (int i = 0; i < last; i++) {
				int offset = i - first;
				int temp = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = temp;

			}
			
			
			len--;
		}
		
		return matrix;
	}
}
