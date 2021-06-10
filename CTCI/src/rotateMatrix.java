import java.util.ArrayList;

public class rotateMatrix {

	public int[][] solution(int[][] matrix) {
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		int j = matrix.length;
		
		for (int i = matrix[0].length; i >= 0; i--) {
			int temp = matrix[0][i];
			matrix[0][i] = matrix[matrix.length][j];
			matrix[matrix.length][j] = temp;
			j++;
		}
		
		return matrix;
	}
}
