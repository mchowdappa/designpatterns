package com.java.misc;

public class RecursionTest {

	public static void main(String[] args) {
		RecursionTest test = new RecursionTest();
		System.out.println(test.recur(10));
		
	}

	private int recur(int count) {
		if (count > 0) {
			System.out.println(count);
			return count + recur(--count);
		}
		return count;
	}

}