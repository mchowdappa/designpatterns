/**
 * 
 */
package com.mcp.ds.stack;

/**
 * @author cm1
 *
 */
public class CustomeStack<T>{
	private Node top;
	private class Node{
		private T item;
		private Node previous;
		public Node(T item) {
			this.item = item;
		}
	}
	
	public void push(T item) {
		Node node = new Node(item);
		if(top == null) {
			top = node;
		}else {
			node.previous = top;
			top = node;
		}
		
	}
	
	public T pop() {
		if(top == null) {
			System.out.println("Stack is empty");
			return null;
		}
		T item = top.item;
		top = top.previous;
		return item;
	}
	public boolean isEmpty() {
		if (top==null)
			return true;
		return false;
	}
}
