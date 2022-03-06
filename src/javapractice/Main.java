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
		System.out.println("Welcome!!");
		LinkedList list = new LinkedList();

		/*
		 * 2. Adding nodes to linkedList
		 */
		list.addNodeStart(70);
		list.addNodeStart(30);
		list.addNodeStart(56);
		/*
		 * 3. Printing linedList after adding nodes
		 */
		list.printLinkedList();

	}

}
