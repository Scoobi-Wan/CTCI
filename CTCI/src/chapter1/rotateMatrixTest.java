package chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rotateMatrixTest {

	@Test
	void test() {
		rotateMatrix myTest = new rotateMatrix();
		int[][] input = {{0,1,2},{3,4,5},{6,7,8}};
		int[][] outputTest = {{6,3,0}, {7,4,1}, {8,5,2}};
		assertEquals(myTest.solution(input), outputTest);
	}
}
