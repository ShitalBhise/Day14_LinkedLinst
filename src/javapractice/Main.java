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
		 * 2. Adding nodes to linksedList
		 */
		list.addNodeLast(56);
		list.addNodeLast(30);
		list.addNodeLast(70);

		/*
		 * 3. Printing linedList after adding nodes
		 */
		list.deleteNodeEnd();
		list.printLinkedList();

	}
}
