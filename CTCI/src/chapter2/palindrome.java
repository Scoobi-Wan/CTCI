package chapter2;

import java.util.ArrayList;

public class palindrome {

	/*
	 * Author: Paul Rich
	 * Problem: Cracking The Coding Interview 2.6
	 * Notes: 
	 */
	public boolean solution1(Node node) {
		
		ArrayList<Character> myStack = new ArrayList<Character>();
		
		while (node != null) {	
			myStack.add(node.charVal);
			node = node.next;
		}
		
		int first = 0;
		int last = myStack.size();
		while (first < myStack.size() / 2) {
			if (myStack.get(first) != myStack.get(last)) {
				return false;
			} else {
				first++;
				last--;
			}
		}

		return true;
	}
}
