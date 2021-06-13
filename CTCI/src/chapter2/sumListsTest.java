package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumListsTest {

	@Test
	void test() {
		sumLists sl = new sumLists();
		Node num1 = new Node(7);
		num1.next = new Node(1);
		num1.next.next = new Node(6);
		
		Node num2 = new Node(5);
		num2.next = new Node(9);
		num2.next.next = new Node(2);
		
		Node sum = sl.solution(num1, num2);
		assertEquals(sum.val, 2);
		assertEquals(sum.next.val, 1);
		assertEquals(sum.next.next.val, 9);
	}

}
