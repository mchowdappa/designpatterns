package com.java.practice.pr;

import java.util.Arrays;
import java.util.Scanner;

public class CircularLinkedList<T> {
    private Node headNode;
    private Node tailNode;
    private int size;

    public CircularLinkedList() {
        headNode = null;
        tailNode = null;
        size = 0;
    }

    private class Node {
        T value;
        Node next;

        public Node(T value) {
            super();
            this.value = value;
            this.next = null;
        }
    }

    public void insertFirst(T value) {
        size++;
        if (headNode == null) {
            headNode = new Node(value);
            headNode.next = headNode;
            tailNode = headNode;
        } else {
            Node newNode = new Node(value);
            tailNode.next = newNode;
            newNode.next = headNode;
            headNode = newNode;
        }
    }

    public void insertLast(T value) {
        size++;
        if (headNode == null) {
            headNode = new Node(value);
            headNode.next = headNode;
            tailNode = headNode;
        }  else {
            Node newNode = new Node(value);
            newNode.next = headNode;
            tailNode.next = newNode;
            tailNode = newNode;
        }
    }

    public void display() {
        if (headNode != null) {
            System.out.println(headNode.value);
            Node tempNode = headNode;
            while (tempNode.next != headNode) {
                tempNode = tempNode.next;
                System.out.println(tempNode.value);
            }
        }
    }

    public void removeFirst() {
        size--;
        if (headNode == null) {
            System.out.println("list is empty");
        } else if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            headNode = headNode.next;
            tailNode.next = headNode;
        }

    }

    public void removeLast() {
        size--;
        if (tailNode == null) {
            System.out.println("list is empty");
        } else if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            Node tempNode = headNode;
            Node previousNode = headNode;
            while (tempNode != tailNode) {
                previousNode = tempNode;
                tempNode = tempNode.next;
            }
            previousNode.next = headNode;
            tailNode = previousNode;
        }
    }

    public void removeAtIndex(int index) {

        if (index < 0 && index > size) {
            System.out.println("INVALID POSITION !!!");
        } else if (index == 0) {
            removeFirst();
        } else if (index == (size - 1)) {
            removeLast();
        } else {
            Node tempNode = headNode;
            for (int i = 0; i < (index - 1); i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
        size--;
    }

    public void insertAtIndex(int index, T value) {

        if (index < 0 && index > size) {
            System.out.println("INVALID POSITION !!!");
        } else if (index == 0) {
            insertFirst(value);
        } else if (index == (size - 1)) {
            insertLast(value);
        } else {
            
            Node tempNode = headNode;
            for (int i = 0; i < (index - 1); i++) {
                tempNode = tempNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public static void main(String arg1) {
        System.out.println("main(String arg1)");
    }

    public static void main(String[] args) {
        System.out.println("CircularLinkedList.main() " + Arrays.toString(args)) ;
        CircularLinkedList<Integer> list = new CircularLinkedList();
        Scanner input = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Select choices from below");
            System.out.println("1. Insert At begining");
            System.out.println("2. Insert At End");
            System.out.println("3. Delete At begining");
            System.out.println("4. Insert At End");
            System.out.println("5. Removing element at position");
            System.out.println("6. Inserting element at position");

            int choice = input.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter integer to insert");
                list.insertFirst(input.nextInt());
                break;
            case 2:
                System.out.println("Enter integer to insert");
                list.insertLast(input.nextInt());
                break;
            case 3:
                list.removeFirst();
                break;
            case 4:
                list.removeLast();
                break;
            case 5:
                System.out.println("Enter the index");
                int index1 = input.nextInt();
                list.removeAtIndex(index1);
                break;
            case 6:
                System.out.println("Enter the index and value");
                int index2 = input.nextInt();
                int value = input.nextInt();
                list.insertAtIndex(index2, value);
                break;
            default:
                break;
            }
            list.display();
            System.out.println("Do you want to continue the loop ? ");
            ch = input.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }
}

