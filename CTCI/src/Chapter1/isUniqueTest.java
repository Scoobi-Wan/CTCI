package Chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isUniqueTest {

	@Test
	void test() {
		isUnique mytest = new isUnique();
		assertEquals(mytest.solution("apple"), false);
		assertEquals(mytest.solution("orange"), true);
		assertEquals(mytest.solution("p"), true);
		assertEquals(mytest.solution("abcdefghijklmnopqrstuvwxyz"), true);
	}
	
	@Test
	void test2() {
		isUnique mytest = new isUnique();
		assertEquals(mytest.solution2("apple"), false);
		assertEquals(mytest.solution2("pear"), true);
		assertEquals(mytest.solution2("xylophone"), false);
		assertEquals(mytest.solution2("tuba"), true);
	}

}
