package chapter2;

public class partition {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview
	 * Notes: partitions linked-list around partitionVal. nums < partitionVal come first, then nums >= partitionVal
	 */
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
