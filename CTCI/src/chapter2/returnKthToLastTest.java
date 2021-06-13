package chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class returnKthToLastTest {

	@Test
	void test1() {
		returnKthToLast ktl = new returnKthToLast();                   
		Node node = new Node(5);                             
		node.next = new Node(10);                            
		node.next.next = new Node(5);                        
		node.next.next.next = new Node(15);                  
		node.next.next.next.next = new Node(20);             
		node.next.next.next.next.next = new Node(5);         
		node.next.next.next.next.next.next = new Node(25);   
		assertEquals(node.next.next.next.val, 15);           
		assertEquals(ktl.solution1(node, 3).val, 15);     
		assertEquals(ktl.solution1(node, 2).val, 20);    
		assertEquals(ktl.solution1(node, 1).val, 5);  
		assertEquals(ktl.solution1(node, 0).val, 25); 
		assertEquals(ktl.solution1(node, 4).val, 5);    
		assertEquals(ktl.solution1(node, 5).val, 10);    
		assertEquals(ktl.solution1(node, 6).val, 5);    
		                                                     
	}
	
	@Test
	void test2() {
		returnKthToLast ktl = new returnKthToLast();                   
		Node node = new Node(5);                             
		node.next = new Node(10);                            
		node.next.next = new Node(15);                        
		node.next.next.next = new Node(20);                  
		node.next.next.next.next = new Node(25);             
		node.next.next.next.next.next = new Node(30);         
		node.next.next.next.next.next.next = new Node(35);   
		assertEquals(node.next.next.next.val, 20);           
		assertEquals(ktl.solution2(node, 0).val, 35); 
		assertEquals(ktl.solution2(node, 1).val, 30); 
		assertEquals(ktl.solution2(node, 2).val, 25);   
		assertEquals(ktl.solution2(node, 3).val, 20);     
		assertEquals(ktl.solution2(node, 4).val, 15);    
		assertEquals(ktl.solution2(node, 5).val, 10);    
		assertEquals(ktl.solution2(node, 6).val, 5);    
		  
	}
	

}
