package com.java.misc;

public class RecursionSum {

	public static void main(String[] args) {
		RecursionSum test = new RecursionSum();
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