package chapter2;

import java.util.ArrayList;

public class returnKthToLast {

	
	/*
	 * Author: Paul Rich
	 * Program: Cracking The coding Interview 2.2
	 * Notes: Did 2 different solutions, put solution2 on top because it is the cleaner and faster way of doing it.
	 * 		  Kept solution1 as an option if restricted on using additional Data Structures
	 */
	public Node solution2(Node node, int toLastIndex) {
		ArrayList<Node> myList = new ArrayList<Node>();
		while (node != null) {
			myList.add(node);
			node = node.next;
		}
		
		int target = myList.size() - 1 - toLastIndex;
		return myList.get(target);
	}
	
	
	
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
	
	
	
}
