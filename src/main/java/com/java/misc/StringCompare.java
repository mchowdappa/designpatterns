/**
 * 
 */
package com.java.misc;

/**
 * @author cm1
 *
 */
public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string1 = new String("Chowdappa");
		String string2 = new String("Practice");
		String string3 = new String("Chandu");
		String string4 = new String("Java");
		
	//	ASCII value of A=65  and a=97
		
		
		System.out.println(stringCompare(string1, string2));
		System.out.println(stringCompare(string1, string3));
		System.out.println(stringCompare(string2, string1));
		System.out.println(stringCompare(string1, string4));
		System.out.println(stringCompare(string4, string1));
	}

	public static int stringCompare(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
				continue;
			} else {
				return (int) str1.charAt(i) - (int) str2.charAt(i);
			}
		}

		if (str1.length() < str2.length()) {
			return (str1.length() - str2.length());
		} else if (str1.length() > str2.length()) {
			return (str1.length() - str2.length());
		} else {
			return 0;
		}
	}
}
