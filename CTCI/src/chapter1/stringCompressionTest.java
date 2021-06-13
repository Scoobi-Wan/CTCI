package chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCompressionTest {

	@Test
	void test() {
		stringCompression mySC = new stringCompression();
		assertEquals(mySC.solution("aabcccccaaa"), "a2b1c5a3");
		assertEquals(mySC.solution("aaaaaaaaaaa"), "a11");
		assertEquals(mySC.solution("aaba"), "aaba");
		assertEquals(mySC.solution("a"), "a");
	}

}
