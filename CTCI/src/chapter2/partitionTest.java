package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class partitionTest {

	@Test
	void test() {
		Node node = new Node(25);
		node.next = new Node(10);
		node.next.next = new Node(15);
		node.next.next.next = new Node(45);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(30);
		int p = 25;
		partition part = new partition();
		Node newHead = part.solution(node, p);
		assertEquals(newHead.val, 10);
		assertEquals(newHead.next.val, 15);
		assertEquals(newHead.next.next.val, 5);
		assertEquals(newHead.next.next.next.val, 25);
		assertEquals(newHead.next.next.next.next.val, 45);
		assertEquals(newHead.next.next.next.next.next.val, 30);
	}

}
