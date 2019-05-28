/**
 * 
 */
package com.mcp.ds.stack;

import java.util.Stack;

/**
 * @author cm1
 *
 */
public class OriginalStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> expression = new Stack<>();
		expression.push(1234);
		System.out.println(expression.pop());
		System.out.println(expression.pop());
	}

}
