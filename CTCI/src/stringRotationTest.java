import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringRotationTest {

	@Test
	void test() {
		stringRotation sr = new stringRotation();
		assertTrue(sr.solution("erbottlewat", "waterbottle"));
		assertTrue(sr.solution("ulpa", "paul"));
		assertTrue(sr.solution("h spacewit", "with space"));
		assertFalse(sr.solution("erbottleat", "waterbottle"));
	}

}
