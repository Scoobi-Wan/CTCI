package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class returnKthToLastTest {

	@Test
	void test() {
		returnKthToLast ktl = new returnKthToLast();                   
		Node node = new Node(5);                             
		node.next = new Node(10);                            
		node.next.next = new Node(5);                        
		node.next.next.next = new Node(15);                  
		node.next.next.next.next = new Node(20);             
		node.next.next.next.next.next = new Node(5);         
		node.next.next.next.next.next.next = new Node(25);   
		assertEquals(node.next.next.next.val, 15);           
		assertEquals(ktl.solution(node, 3).val, 15);     
		assertEquals(ktl.solution(node, 2).val, 20);    
		assertEquals(ktl.solution(node, 1).val, 5);  
		assertEquals(ktl.solution(node, 0).val, 25); 
		assertEquals(ktl.solution(node, 4).val, 5);    
		assertEquals(ktl.solution(node, 5).val, 10);    
		assertEquals(ktl.solution(node, 6).val, 5);    
		                                                     
	}

}
