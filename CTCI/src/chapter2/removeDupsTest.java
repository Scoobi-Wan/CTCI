package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chapter2.removeDups.Node;

class removeDupsTest {

class Node {
		
		int val;
		Node next;
	
		public Node(int val) {
			this.val = val;
		}
	}
	@Test
	void test() {
		Node node = new Node(5);
		node.next = new Node(10);
		node.next.next = new Node(5);
		node.next.next.next = new Node(15);
		node.next.next.next.next = new Node(20);
		node.next.next.next.next.next = new Node(5);
		assertEquals(node.next.next.next.val, 15);
	}

}
