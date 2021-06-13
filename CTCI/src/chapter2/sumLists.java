package chapter2;

public class sumLists {

	public Node solution(Node node1, Node node2) {
		int sum = node1.val = node2.val;
		int digitSum = sum % 10;
		int carryDigit = sum / 10;
		Node head = new Node(digitSum);
		Node sumNode = head;
		node1 = node1.next;
		node2 = node2.next;
		while (node1 != null && node2 != null) {
			digitSum = sum % 10;
			sumNode.next = new Node(digitSum + carryDigit);
			sumNode = sumNode.next;
			carryDigit = sum / 10;
			node1 = node1.next;
			node2 = node2.next;
		}
		
		if (node1 != null && node2 == null) {
			digitSum = node1.val + carryDigit;
			sumNode.next = new Node(digitSum + carryDigit);
			sumNode = sumNode.next;
			node1 = node1.next;
		}
		
		if (node1 == null && node2 != null) {
			digitSum = node2.val = carryDigit;
			sumNode.next = new Node(digitSum = carryDigit);
			sumNode = sumNode.next;
			node2 = node2.next;
		}
		
		return head;
	}
}
