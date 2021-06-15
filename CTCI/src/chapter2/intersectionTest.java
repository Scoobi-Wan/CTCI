package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intersectionTest {

	@Test
	void test() {
		Node node1 = new Node(1);
		Node node2 = new Node(10);
		intersection i = new intersection();
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(5);
		node1.next.next.next.next.next = new Node(20);
		
		node2.next = new Node(12);
		node2.next.next = new Node(13);
		node2.next.next.next = new Node(14);
		node2.next.next.next.next = node1;
		
		assertEquals(node1, i.solution(node1, node2));
	}

}
