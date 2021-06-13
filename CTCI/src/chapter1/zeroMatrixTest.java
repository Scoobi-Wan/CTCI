package chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class zeroMatrixTest {

	@Test
	void test() {
		zeroMatrix myZ = new zeroMatrix();
		int[][] input = {{1,2,3,4,5},{6,7,0,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,0}};
		int[][] output = myZ.solution(input);
		assertEquals(output[2][2], 0);
		assertEquals(output[1][2], 0);
		assertEquals(output[1][1], 0);
		assertEquals(output[1][0], 0);
		assertEquals(output[3][3], 19);
		assertEquals(output[3][4], 0);
		assertEquals(output[3][1], 17);
		
	}
				
}
