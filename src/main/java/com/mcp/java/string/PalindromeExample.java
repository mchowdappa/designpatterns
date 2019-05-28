package com.mcp.java.string;

import java.util.Scanner;

public class PalindromeExample {
	public static void main(String args[]) {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		char chars[] = original.toCharArray();
		int length = original.length();
		boolean isPalindrom = true;
		for (int i=0; i<length/2; i++) {
			if(chars[i]==chars[length-1-i]) {
				continue;
			}
			else {
				isPalindrom = false;
				break;
			}
		}
		if(isPalindrom) {
			System.out.println("Entered string/number is a palindrome.");
		}else
			System.out.println("Entered string/number isn't a palindrome.");

	}
}