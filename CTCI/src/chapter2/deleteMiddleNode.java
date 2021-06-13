package chapter2;

public class deleteMiddleNode {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 2.3
	 * Notes: Does not mean delete the exact middle, but rather deleting a node not at the start or end of a linked list.
	 * 		  Only given access to the node to delete
	 *
	 */
	public void solution(Node node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
