package javapractice;

public class LinkedList {

	Node headNode = null;

	class Node {
		Object dataObject;
		Node nextNode = null;

		public Node(Object dataObject) {
			this.dataObject = dataObject;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Linked List !");
	}
}
