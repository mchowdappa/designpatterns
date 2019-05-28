package com.java.practice.pr;

public class ReverseDoubleLinkList<T> {

    Node headNode;
    Node tailNode;
    int size;

    public ReverseDoubleLinkList() {
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

    public void display() {
        Node displayNode = headNode;
        while (displayNode != null) {
            System.out.println("SingleLinkedListEx.display() " + displayNode.value);
            displayNode = displayNode.next;
        }
    }

    public void reverse() {
        Node curNode = headNode;
        Node prevNode = null;
        Node nextNode = null;
        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            curNode.previous = nextNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        // return prevNode;
        tailNode = headNode;
        headNode = prevNode;
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
        ReverseDoubleLinkList<Integer> list = new ReverseDoubleLinkList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        // list.display();
        list.reverse();
        list.display();
        list.traverseFromBackEnd();

    }
}
