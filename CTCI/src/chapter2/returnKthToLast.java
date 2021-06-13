package chapter2;

public class returnKthToLast {

	public Node solution(Node node, int toLastIndex) {
		
		Node head = node;
		
		int len = 0;
		
		while (node != null) {
			len++;
			node = node.next;
		}
		
		node = head;
		
		int targetIndex = len - toLastIndex;
		int i = 0;
		
		while (i < targetIndex) {
			node = node.next;
			i++;
		}
		
		
		
		return node;
		
	}
	
}
