import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringCompressionTest {

	@Test
	void test() {
		stringCompression mySC = new stringCompression();
		assertEquals(mySC.solution("aabccccaaa"), "a2b1c5a3");
	}

}
