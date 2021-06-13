package chapter2;

import java.util.ArrayList;

public class removeDups {
	
	class Node {
		
		int val;
		Node next;
	
		public Node(int val) {
			this.val = val;
		}
	}

	public Node solution(Node node) {
		Node head = node;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Node prev = null;
		while (node != null) {
			if (nums.contains(node.val)) {
				prev.next = node.next;
				node = node.next;
			}
			nums.add(node.val);
			prev = prev.next;
			node = node.next;
		}
		return head;
	}
}
