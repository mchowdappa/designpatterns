/**
 * 
 */
package com.java.misc;

/**
 * @author chowdappa.m
 *
 */
public class RecursionTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 10;
		recursiveMethod(x);

	}

	private static int recursiveMethod(int x) {
		if (x <= 0) {
			return 0;
		}
		// x--;
		System.out.println(x);
		recursiveMethod(--x);
		return 0;
	}

}
