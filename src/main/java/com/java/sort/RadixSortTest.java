/**
 * 
 */
package com.java.sort;

/**
 * @author chowdappa.m
 *
 */
public class RadixSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 10;
		recursiveMethod(x);
		
	}

	private static int recursiveMethod(int x) {
		if(x<=0){
			return 25;
		}
		//x--;
		System.out.println(x);
		recursiveMethod(--x);
		return 0;
	}

}
