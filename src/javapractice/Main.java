package javapractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Main method for manipulation linkedList
		 * 
		 * @param args - Default Java param (Not used)
		 */

		/*
		 * PROCEDURE 1. Creating Lined list
		 */

		/*
		 * 1. Creating Lined list
		 */
		LinkedList list = new LinkedList();

		/*
		 * 2. Adding nodes to linkedList
		 */
		MyNode head = list.addNode(null, 30);
		list.addNode(head, 56);
		list.addNode(head, 70);

		/*
		 * 3. Printing linedList after adding nodes
		 */
		list.printLinkedList(head);
		System.out.println();

	}

}
