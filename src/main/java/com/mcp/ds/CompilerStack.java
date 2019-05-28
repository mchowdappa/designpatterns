/**
 * 
 */
package com.mcp.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.mcp.ds.stack.CustomeStack;

/**
 * @author cm1
 *
 */
public class CompilerStack {

	/**
	 * @param args
	 */

	private static String closeTags = "}])";
	private static String openTags = "{[(";
	private static Map<Character, Character> tagsMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char[] chars = input.toCharArray();
		CustomeStack<Character> stack = new CustomeStack<>();
		boolean notFound = false;
		for (int i = 0; i < chars.length; i++) {
			if (closeTags.contains(String.valueOf(chars[i]))) {
				if (!stack.pop().equals(tagsMap.get(chars[i]))) {
					notFound = true;
				}
			} else if (openTags.contains(String.valueOf(chars[i]))) {
				stack.push(chars[i]);
			}
		}
		if (!notFound && stack.isEmpty()) {
			System.out.println("True");
		} else
			System.out.println("False");

		sc.close();
	}

	static {
		tagsMap.put('}', '{');
		tagsMap.put(']', '[');
		tagsMap.put(')', '(');
	}

}
