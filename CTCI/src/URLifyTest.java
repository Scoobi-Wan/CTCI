import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class URLifyTest {

	@Test
	void test() {
		URLify mytest = new URLify();
		char[] testCharArray = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' '};
		char[] testCheckArray = {'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
		assertEquals(mytest.solution(testCharArray, 13)[2], '%');
		assertEquals(mytest.solution(testCharArray, 13)[3], '2');
		assertEquals(mytest.solution(testCharArray, 13)[4], '0');
	}

}
