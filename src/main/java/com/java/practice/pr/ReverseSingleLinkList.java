package com.java.practice.pr;

import java.util.Scanner;

public class ReverseSingleLinkList<T> {

    private Node headNode;
    private Node tailNode;
    private int size;

    // public ReverseSingleLinkList() {
    // super();
    // this.tailNode = null;
    // this.size = 0;
    // }

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
            next = null;
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
            prevNode = curNode;
            curNode = nextNode;
        }
        // return prevNode;
        headNode = prevNode;
    }

    public static void main(String[] args) {
        ReverseSingleLinkList<Integer> list = new ReverseSingleLinkList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        list.display();
        list.reverse();
        list.display();
        list.display();
        list.display();
        list.display();

    }
}