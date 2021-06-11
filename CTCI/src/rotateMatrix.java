import java.util.ArrayList;

public class rotateMatrix {

	public int[][] solution(int[][] matrix) {
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		int k = matrix.length;
		
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				int l = i - j;
				int temp = matrix[j][k];
				matrix[j][k] = matrix[i][j];
				matrix[i][j] = matrix[k-l][i];
				matrix[k-l][i] = matrix[k][k-l];
				matrix[k][k-l] = matrix[i][k];
				matrix[i][k] = temp;
				
				
			}
			
			
			k--;
		}
		
		return matrix;
	}
}
