package com.java.practice.pr;

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTreeEx {
    private static Node root;

    private class Node {
        public Node(int data) {
            super();
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }

    public void delete(int data) {

        root = deleteNode(root, data);
    }

    private Node deleteNode(Node root, int data) {

        if (root == null)
            return root;

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // node with no leaf nodes
            if (root.left == null && root.right == null) {
                System.out.println("deleting " + data);
                return null;
            } else if (root.left == null) {
                // node with one node (no left node)
                System.out.println("deleting " + data);
                return root.right;
            } else if (root.right == null) {
                // node with one node (no right node)
                System.out.println("deleting " + data);
                return root.left;
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                int minValue = minValue(root.right);
                root.data = minValue;
                root.right = (deleteNode(root.right, minValue));
                System.out.println("deleting " + data);
            }
        }

        return root;
    }

    private int minValue(Node node) {

        if (node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }

    // public void add(int value) {
    // Node newNode = new Node(value);
    // if (root == null) {
    // root = newNode;
    // return;
    // }
    //
    // Node curNode = root;
    // Node parent = null;
    // while (curNode != null) {
    // parent = curNode;
    // if (value > curNode.data) {
    // curNode = curNode.right;
    // if (curNode == null) {
    // parent.right = newNode;
    // return;
    // }
    // } else {
    // curNode = curNode.left;
    // if (curNode == null) {
    // parent.left = newNode;
    // return;
    // }
    // }
    // }
    // }

    public Node addRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = addRecursive(node.left, value);
        } else if (value > node.data) {
            node.right = addRecursive(node.right, value);
        }
        return node;
    }

    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.println("BinarySearchTreeEx.display() " + root.data);
            display(root.right);
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        BinarySearchTreeEx tree = new BinarySearchTreeEx();
        
        do {
            System.out.println("Select choices from below");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");

            int choice = input.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter integer to insert");
                tree.add(input.nextInt());
                break;
            case 2:
                System.out.println("Enter integer to Delete");
                tree.delete(input.nextInt());
                break;
            default:
                break;
            }
            tree.display(root);
            System.out.println("Do you want to continue the loop ? ");
            ch = input.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }

}
