package chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkPermTest {

	@Test
	void test() {
		checkPerm myCheck = new checkPerm();
		assertEquals(myCheck.solution("paper", "apper"), true);
		assertEquals(myCheck.solution("poop", "oppo"), true);
		assertEquals(myCheck.solution("tarantula", "marntler"), false);
		assertEquals(myCheck.solution("valterri", "bottas"), false);
		assertEquals(myCheck.solution("v", "bottas"), false);
		assertEquals(myCheck.solution("v", "v"), true);
		
	}

}
