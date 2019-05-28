package com.java.practice.pr;

import java.util.Scanner;

public class SingleLinkedListEx {

    private Node headNode;
    private Node tailNode;
    private int size;

    public SingleLinkedListEx() {
        super();
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }

    private class Node {
        Integer value;
        Node next;

        Node(Integer value) {
            this.value = value;
            next = null;
        }
    }
    
    public void print( Integer data) {
        Node tempNode = headNode;
        while (tempNode.next != null) {
            if (tempNode.value > data) {
                System.out.printf(headNode.toString());
                if (tempNode == headNode) {
                    tempNode = tempNode.next;
                    headNode = tempNode;
                } else {
                    tempNode.next = tempNode.next.next;
                }
            }
            tempNode = tempNode.next;
        }
    }

    public void insertFirst(Integer value) {
        size++;
        Node newNode = new Node(value);
        if (headNode == null) {
            headNode = newNode;
            tailNode = headNode;
        } else {
            newNode.next = headNode;
            headNode = newNode;
        }
    }

    public void insertLast(Integer value) {
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

    public void removeFirst() {

        if (headNode == null) {
            System.out.println("List is empty");
            return;
        } else if (headNode == tailNode) {
            headNode = null;
            tailNode = null;
        } else {
            headNode = headNode.next;
        }
        size--;
    }

    public void removeLast() {

        if (tailNode == null) {
            System.out.println("List is empty");
            return;
        } else if (tailNode == headNode) {
            tailNode = null;
            headNode = null;
        } else {
            Node curNode = headNode;
            while (curNode.next != tailNode) {
                curNode = curNode.next;
            }
            curNode.next = null;
            tailNode = curNode;
        }
        size--;
    }

    public void removeAtIndex(int index) {
        if (index > size || index < 0) {
            System.out.println("Invalid request");
            return;
        } else if (index == 0) {
            removeFirst();
        } else if (index == (size - 1)) {
            removeLast();
        } else {
            int count = index -1;
            Node curNode = headNode;
            while (count != 0) {
                count--;
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
        }
        size--;
    }

    public void insertAtIndex(int index, Integer value) {
        size++;
        if (index > size || index < 0) {
            System.out.println("Invalid request");
            return;
        } else if (index == 0) {
            insertFirst(value);
        } else if (index == (size - 1)) {
            insertLast(value);
        } else {
            Node newNode = new Node(value);
            int count = index;
            Node curNode = headNode;
            Node prevNode = headNode;
            while (count != 0) {
                count--;
                prevNode = curNode;
                curNode = curNode.next;
            }
            prevNode.next = newNode;
            newNode.next = curNode;
        }
    }

    public void display() {
        Node displayNode = headNode;
        while (displayNode != null) {
            System.out.println("SingleLinkedListEx.display() " + displayNode.value);
            displayNode = displayNode.next;
        }
    }
    
    public void reverseDisplay() {
        display1(headNode);
    }
    
    public void display1(Node node){
        if (node != null) {
            display1(node.next);
            System.out.println("SingleLinkedListEx.display() " + node.value);
        }
    }

    public static void main(String[] args) {
        SingleLinkedListEx list = new SingleLinkedListEx();
        Scanner input = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Select choices from below");
            System.out.println("1. Insert At begining");
            System.out.println("2. Insert At End");
            System.out.println("3. Delete At begining");
            System.out.println("4. Delete At End");
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
            case 7:
                list.reverseDisplay();
                break;
            case 8 :
                list.print(Integer.valueOf(5));
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