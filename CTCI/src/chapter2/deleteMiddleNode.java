package chapter2;

public class deleteMiddleNode {

	public void solution(Node node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
