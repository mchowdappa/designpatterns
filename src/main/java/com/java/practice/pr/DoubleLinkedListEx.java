package com.java.practice.pr;

import java.util.Scanner;

public class DoubleLinkedListEx<T> {
    Node headNode;
    Node tailNode;
    int size;

    public DoubleLinkedListEx() {
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    private class Node {
        T value;
        Node next;
        Node previous;

        public Node(T value) {
            this.next = null;
            this.previous = null;
            this.value = value;
        }
    }

    public void insertFirst(T value) {
        size++;
        Node newNode = new Node(value);
        if (headNode == null) {
            headNode = newNode;
            tailNode = headNode;
        } else {
            newNode.next = headNode;
            headNode.previous = newNode;
            headNode = newNode;
        }
    }

    public void insertLast(T value) {
        size++;
        Node newNode = new Node(value);
        if (tailNode == null) {
            tailNode = newNode;
            headNode = tailNode;
        } else {
            tailNode.next = newNode;
            newNode.previous = tailNode;
            tailNode = newNode;
        }
    }

    public void removeFirst() {
        if (headNode == null) {
            System.out.println("List is empty");
            return;
        } else if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            headNode = headNode.next;
            headNode.previous = null;
        }
        size--;
    }

    public void removeLast() {
        if (tailNode == null) {
            System.out.println("List is empty");
            return;
        } else if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            tailNode = tailNode.previous;
            tailNode.next = null;
        }
        size--;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid request");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == (size - 1)) {
            removeLast();
        } else {
            int count = index - 1;
            Node curNode = headNode;
            while (count != 0) {
                count--;
                curNode = curNode.next;
            }
            curNode.next.next.previous = curNode;
            curNode.next = curNode.next.next;
        }
        size--;
    }

    public void insertAtIndex(int index, T value) {
        if (index < 0 || index > size) {
            System.out.println("Invalid request");
            return;
        }
        if (index == 0) {
            insertFirst(value);
        } else {
            int count = index - 1;
            Node newNode = new Node(value);
            Node curNode = headNode;
            while (count != 0) {
                count--;
                curNode = curNode.next;
            }
            newNode.previous = curNode;
            newNode.next = curNode.next;
            curNode.next.previous = newNode;
            curNode.next = newNode;
        }
        size++;
    }

    public void traverseFromFrontEnd() {
        Node displayNode = headNode;
        while (displayNode != null) {
            System.out.println("DoubleLinkedListEx.traverseFromFrontEnd() " + displayNode.value);
            displayNode = displayNode.next;
        }
    }

    public void traverseFromBackEnd() {
        Node displayNode = tailNode;
        while (displayNode != null) {
            System.out.println("DoubleLinkedListEx.traverseFromFrontEnd() " + displayNode.value);
            displayNode = displayNode.previous;
        }
    }

    public static void main(String[] args) {

        DoubleLinkedListEx<Integer> list = new DoubleLinkedListEx();
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
            System.out.println("7. Backend traverse");

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
            case 7:
                list.traverseFromBackEnd();
                break;
            default:
                break;
            }
            list.traverseFromFrontEnd();
            System.out.println("Do you want to continue the loop ? ");
            ch = input.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }

}
