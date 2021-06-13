package Chapter1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class palinPermTest {

	@Test
	void test() {
		palinPerm myTest = new palinPerm();
		assertTrue(myTest.solution("radar")); 
		assertTrue(myTest.solution("radarrr")); 
		assertFalse(myTest.solution("rada")); 
		assertTrue(myTest.solution("dood")); 
		assertFalse(myTest.solution("whoa")); 
		assertTrue(myTest.solution("mom")); 
		assertTrue(myTest.solution("taco cat")); 
		
	}

}
