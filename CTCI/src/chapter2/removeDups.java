package chapter2;

import java.util.ArrayList;

public class removeDups {
	
	

	public Node solution(Node node) {
		Node head = node;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Node prev = null;
		while (node != null) {
			if (nums.contains(node.val)) {
				prev.next = node.next;
				node = node.next;
			} else {
				nums.add(node.val);
				prev = node;
				node = node.next;
			}
			
		}
		return head;
	}
}
