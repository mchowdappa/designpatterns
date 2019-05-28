/**
 * 
 */
package com.mcp.ds.stack;

/**
 * @author cm1
 *
 */
public class ArrayStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayStack<Integer> intStack = new ArrayStack<>(10);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		intStack.push(123);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
	}

}


class ArrayStack<T> {
	private T[] stack;
	int pointer = -1;
	int size;
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		stack = (T[]) new Object[size];
		this.size = size;
	}
	public T pop() {
		if(pointer<0) {
			System.out.println("Stack is empty");
			return null;
		}
		return stack[pointer--];
	}
	
	public void push(T item) {
		if(pointer>=size-1) {
			System.out.println("Overflow");
			return;
		}
		stack[++pointer] = item;
	}
}