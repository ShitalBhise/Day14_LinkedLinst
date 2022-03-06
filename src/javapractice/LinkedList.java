package javapractice;

public class LinkedList {

	/*
	 * Created local variable Head
	 */
	MyNode headMyNode;

	/**
	 * addNode - this method is created to add data to linedList
	 *
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */

	public void addNodeStart(int new_data) {

		/*
		 * Allocate the Node and Put in the data
		 * 
		 */

		MyNode new_node = new MyNode(new_data);

		/* making next of new Node as head */
		new_node.next = headMyNode;

		/* head is moving to point to new Node */
		headMyNode = new_node;
	}

	/*
	 * Here we are printing contents of linked list starting from the given node
	 */
	public void printLinkedList() {
		if (headMyNode == null) {
			System.out.println("LinkedList is empty");
		} else {
			MyNode pointer = headMyNode;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}
}