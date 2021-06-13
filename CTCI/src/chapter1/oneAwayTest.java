package chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class oneAwayTest {

	@Test
	void test() {
		oneAway myOneAway = new oneAway();
		assertTrue(myOneAway.solution("pale", "ple"));
		assertTrue(myOneAway.solution("pales", "pale"));
		assertTrue(myOneAway.solution("pale", "bale"));
		assertTrue(myOneAway.solution("ability", "ablity"));
		assertFalse(myOneAway.solution("pale", "bake"));
		assertFalse(myOneAway.solution("ppale", "apple"));
	}

}
