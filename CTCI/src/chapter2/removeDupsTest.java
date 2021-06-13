package chapter2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class removeDupsTest {

	@Test
	void test() {
		removeDups rd = new removeDups();
		Node node = new Node(5);
		node.next = new Node(10);
		node.next.next = new Node(5);
		node.next.next.next = new Node(15);
		node.next.next.next.next = new Node(20);
		node.next.next.next.next.next = new Node(5);
		node.next.next.next.next.next.next = new Node(25);
		assertEquals(node.next.next.next.val, 15);
		Node head = rd.solution(node);
		assertEquals(head.next.next.val, 15);
		assertEquals(head.next.next.next.val, 20);
		assertEquals(head.next.next.next.next.val, 25);
	}

}
