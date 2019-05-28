package com.java.practice.pr;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheEX<T, P> {
    int capacity;
    Node headNode;
    Node tailNode;
    HashMap<T, Node> map = new HashMap<>();

    public LRUCacheEX(int capacity) {
        headNode = null;
        tailNode = null;
        this.capacity = capacity;
    }

    private class Node {
        T key;
        P value;
        Node next;
        Node previous;

        Node(T key, P value) {
            this.key = key;
            this.value = value;
            next = null;
            previous = null;
        }
    }

    private void set(T key, P value) {
        Node node;
        if ((node = map.get(key)) != null) {
            node.value = value;
            remove(node);
            setHead(node);
        } else {
            node = new Node(key, value);
            if (map.size() >= capacity) {
                remove(tailNode);
                map.remove(tailNode.key);
            }
            setHead(node);
            map.put(key, node);
        }
    }

    public void remove(Node node) {
        if (node == headNode) {
            headNode = headNode.next;
            headNode.previous = null;
        } else if (node == tailNode) {
            tailNode = node.previous;
            tailNode.next = null;
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
    }

    public void setHead(Node node) {
        if (headNode == null) {
            headNode = node;
            tailNode = headNode;
        } else {
            node.next = headNode;
            headNode.previous = node;
            headNode = node;
        }
    }

    void display() {
        Node curNode = headNode;
        while (curNode != null) {
            System.out.println("key " + curNode.key + " value " + curNode.value);
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        LRUCacheEX<Integer, Integer> cache = new LRUCacheEX<>(5);
        cache.set(1, 100);
        cache.set(20, 70);
        cache.set(27, 76);
        cache.set(35, 90);
        cache.display();
        System.out.println("============================");
        cache.set(27, 79);
        cache.display();
        System.out.println("============================");
        cache.set(57, 29);
        cache.display();
        System.out.println("============================");
        cache.set(101, 44);
        cache.display();

    }
}

//public class LRUCacheEX<T, P> {
//
//    private Node headNode;
//    private Node tailNode;
//    Map<T, Node> cache = new HashMap<>();
//    int capacity;
//
//    public LRUCacheEX(int capacity) {
//        super();
//        this.capacity = capacity;
//    }
//
//    private class Node {
//        T key;
//        P value;
//        Node next;
//        Node previous;
//
//        public Node(T key, P value) {
//            this.key = key;
//            this.value = value;
//            next = null;
//            previous = null;
//        }
//    }
//
//    public int get(T key) {
//        if (cache.containsKey(key)) {
//            Node n = cache.get(key);
//            remove(n);
//            setHead(n);
//            return 1;
//        }
//        return -1;
//
//    }
//
//    public void remove(Node n) {
//
//        if (n.previous == null) {
//            headNode = headNode.next;
//            headNode.previous = null;
//        } else {
//            n.previous.next = n.next;
//        }
//
//        if (n.next == null) {
//            tailNode = n.previous;
//            tailNode.next = null;
//        } else {
//            n.next.previous = n.previous;
//        }
//    }
//
//    public void setHead(Node n) {
//        n.previous = null;
//        n.next = headNode;
//
//        if (headNode != null) {
//            headNode.previous = n;
//        }
//        headNode = n;
//
//        if (tailNode == null) {
//            tailNode = headNode;
//        }
//    }
//
//    public void set(T key, P value) {
//
//        if (cache.containsKey(key)) {
//            Node n = cache.get(key);
//            n.value = value;
//            remove(n);
//            setHead(n);
//        } else {
//            Node n = new Node(key, value);
//            System.out.println("cache size " + cache.size());
//            if (cache.size() >= capacity) {
//                cache.remove(tailNode.key);
//                remove(tailNode);
//            }
//            setHead(n);
//            cache.put(key, n);
//        }
//    }
//    
//    public void display() {
//        Node tempNode = headNode;
//        while (tempNode != null) {
//            System.out.println(tempNode.value);
//            tempNode= tempNode.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        LRUCacheEX<Integer, Integer> lruCache= new LRUCacheEX<>(5);
//        lruCache.set(1, 1);
//        lruCache.set(2, 2);
//        lruCache.set(3, 3);
//        lruCache.set(4, 4);
//        lruCache.set(5, 5);
//        lruCache.set(1, 1);
//        lruCache.display();
//        lruCache.set(6, 6);
//        lruCache.display();
//    }
//
//}