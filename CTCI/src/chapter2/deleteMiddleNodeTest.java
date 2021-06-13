package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class deleteMiddleNodeTest {

	@Test
	void test() {
		Node node = new Node(5);
		node.next = new Node(10);
		node.next.next = new Node(15);
		node.next.next.next = new Node(20);
		node.next.next.next.next = new Node(25);
		node.next.next.next.next.next = new Node(30);
		deleteMiddleNode dmn = new deleteMiddleNode();
		Node toDelete = node.next.next.next;
		dmn.solution(toDelete);
		assertEquals(node.next.next.next.val, 25);
		assertEquals(node.next.next.next.next.val, 30);
		dmn.solution(toDelete);
		assertEquals(node.next.next.next.val, 30);
	}

}
