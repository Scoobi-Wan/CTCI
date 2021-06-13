package chapter2;

import java.util.ArrayList;

public class returnKthToLast {

	public Node solution1(Node node, int toLastIndex) {
		
		Node head = node;
		
		int len = 0;
		
		while (node != null) {
			len++;
			node = node.next;
		}
		
		node = head;
		
		int targetIndex = len - toLastIndex - 1;
		int i = 0;
		
		while (i < targetIndex) {
			node = node.next;
			i++;
		}		
		return node;
		
	}
	
	public Node solution2(Node node, int toLastIndex) {
		ArrayList<Node> myList = new ArrayList<Node>();
		while (node != null) {
			myList.add(node);
			node = node.next;
		}
		
		int target = myList.size() - 1 - toLastIndex;
		return myList.get(target);
	}
	
}
