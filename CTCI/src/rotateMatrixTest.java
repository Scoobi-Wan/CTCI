import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rotateMatrixTest {

	@Test
	void test() {
		rotateMatrix myTest = new rotateMatrix();
		int[][] input = {{0,1,2},{3,4,5},{6,7,8}};
		int[][] outputTest = {{2,5,8}, {1,4,7}, {0,3,6}};
	}
}
