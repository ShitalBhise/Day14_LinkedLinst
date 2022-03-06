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

	public void addNodeLast(int new_data) {
		MyNode new_node = new MyNode(new_data);
		/*
		 * If the Linked List is empty, then make the new node as head
		 */
		if (headMyNode == null) {
			headMyNode = new MyNode(new_data);
			return;
		}
		/*
		 * new node is going to be the last node, so make next of it as null
		 */
		new_node.next = null;

		/* else traverse till the last node */
		MyNode temp = headMyNode;
		while (temp.next != null)
			temp = temp.next;

		/* Change the next of last node */
		temp.next = new_node;
		return;

	}
}