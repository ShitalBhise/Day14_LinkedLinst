package javapractice;

public class LinkedList {

	/**
	 * addNode - this method is created to add data to linedList
	 *
	 * @param head - accepting head pointer of LinkedList to manipulate it
	 * @param data - accepting data to put it in linkedList
	 * @return head - it returns head of linkedList
	 *
	 */
	public MyNode addNode(MyNode head, int data) {
		MyNode newNode = new MyNode(data);

		if (head == null) {
			head = newNode;
		} else {
			MyNode pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}

		return head;
	}

	public void printLinkedList(MyNode head) {
		if (head == null) {
			System.out.println("LinkedList is empty");
		} else {
			MyNode pointer = head;
			while (pointer != null) {
				System.out.print(pointer.data + " ");
				pointer = pointer.next;
			}
		}
	}

}