/**
 * 
 */
package com.java.misc;

/**
 * @author cm1
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s2);
		
	}

}
