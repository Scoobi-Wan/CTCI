package chapter2;

public class partition {

	public Node solution(Node node, int partitionVal) {
		Node lessNode = null;
		Node greaterNode = null;
		Node headNode = null;
		
		while (node != null) {
			if (node.val < partitionVal) {
				if (lessNode == null) { 
					lessNode = node; 
					headNode = node; 
				} else {
					lessNode.next = node;
					lessNode = lessNode.next;
				}
			} else {
				if (greaterNode == null) greaterNode = node;
				else {
					greaterNode.next = node;
					greaterNode = greaterNode;
				}
			}
			node = node.next;
		}
		
		lessNode.next = greaterNode;
		
		return headNode;
	}
}
