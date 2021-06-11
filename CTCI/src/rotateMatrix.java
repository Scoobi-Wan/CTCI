import java.util.ArrayList;

public class rotateMatrix {

	public int[][] solution(int[][] matrix) {
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		int k = matrix.length;
		
		for (int i = matrix.length; i >= 0; i--) {
			for (int j = 0; j < matrix.length; j++) {
				int temp = matrix[j][k];
				matrix[j][k] = matrix[i][j];
				
			}
			
			
			k--;
		}
		
		return matrix;
	}
}
