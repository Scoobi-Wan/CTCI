import java.util.ArrayList;

public class rotateMatrix {

	public int[][] solution(int[][] matrix) {
		
		ArrayList<Integer> row = new ArrayList<Integer>();
		
		int k = matrix.length;
		
		for (int layer = 0; layer < matrix.length / 2; layer++) {
			int first = layer;
			int last = k - 1 - layer;
			for (int i = 0; i < last; i++) {
				int offset = i - first;
				int temp = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = temp;

			}
			
			
			k--;
		}
		
		return matrix;
	}
}
