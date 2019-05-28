package com.mcp.ds;

public class LinkedListTest {
	public static void main(String... args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Hello");
		linkedList.add("world");
		linkedList.add("my ");
		linkedList.printList();
		linkedList.deleteNodeAt(2);
		linkedList.printList();
		linkedList.add("latest");
		linkedList.printList();
	}
}

class LinkedList<T> {
	private Node head;
	private Node first;

	class Node {
		private T item;
		private Node next;

		public Node(T item) {
			this.item = item;
			next = null;
		}

	}

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			first = newNode;
		} else {
			head.next = newNode;
			head = newNode;
		}
	}

	public void printList() {
		if (first == null) {
			System.out.println("List is empty");
			return;
		}
		Node tmp = first;
		do {
			System.out.println(tmp.item);
			tmp = tmp.next;
		} while (tmp != null);

	}

	public void deleteNodeAt(int position) {
		if (first == null) {
			System.out.println("List is empty. Delete can not be done");
			return;
		}

		if (position == 0) {
			first = first.next;
			return;
		}
		Node tmp = first.next;
		int i = 1;
		Node lastNode = first;
		while (tmp != null) {
			if (i == position) {
				lastNode.next = tmp.next;
				if(tmp == head) {
					 head = lastNode;
				}
				return;
			}
		lastNode = tmp;
		tmp = tmp.next;
		i++;
		}
		if(i>position) {
			System.out.println("List size is less than position.");
		}
		
	}
}
