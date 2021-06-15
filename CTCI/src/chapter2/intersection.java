package chapter2;

public class intersection {

	public Node solution(Node node1, Node node2) {
		
		while (node1.next != null && node2.next != null) {
			if (node1.equals(node2)) {
				 return node1;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		
		while (node1.next == null && node2.next != null) {
			node2 = node2.next;
		}
		
		while (node1.next != null && node2.next == null) {
			node1 = node1.next;
		}
		
		
		
		
		return node1.equals(node2) ? node1 : null;
		
	}
}
