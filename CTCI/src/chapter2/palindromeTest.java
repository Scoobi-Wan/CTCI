package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class palindromeTest {

	@Test
	void test1() {
		palindrome p = new palindrome();
		Node node = new Node('r');
		node.next = new Node('a');
		node.next.next = new Node('d');
		node.next.next.next = new Node('a');
		node.next.next.next.next = new Node('r');
		assertTrue(p.solution1(node));
		
	}
	
	
	@Test
	void test2() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		node.next = new Node('l');
		node.next.next = new Node('o');
		node.next.next.next = new Node('o');
		node.next.next.next.next = new Node('l');
		node.next.next.next.next.next = new Node('g');
		assertTrue(p.solution1(node));	
	}
	
	@Test
	void test3() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		node.next = new Node('l');
		node.next.next = new Node('o');
		node.next.next.next = new Node('o');
		node.next.next.next.next = new Node('o');
		node.next.next.next.next.next = new Node('l');
		node.next.next.next.next.next.next = new Node('g');
		assertTrue(p.solution1(node));	
	}
	
	@Test
	void test4() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		node.next = new Node('l');
		node.next.next = new Node('v');
		node.next.next.next = new Node('o');
		node.next.next.next.next = new Node('o');
		node.next.next.next.next.next = new Node('l');
		node.next.next.next.next.next.next = new Node('g');
		assertFalse(p.solution1(node));	
	}
	
	@Test
	void test5() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		assertTrue(p.solution1(node));	
	}
	
	@Test
	void test6() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		node.next = new Node('g');
		assertTrue(p.solution1(node));	
	}
	
	@Test
	void test7() {
		palindrome p = new palindrome();
		Node node = new Node('g');
		node.next = new Node('l');
		assertFalse(p.solution1(node));	
	}

}
