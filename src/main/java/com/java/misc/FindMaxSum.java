/**
 * 
 */
package com.java.misc;

/**
 * @author cm1
 *
 */
public class FindMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMaxSum fm = new FindMaxSum();
		fm.finMaxSum();

		fm.findMaxSumOf2();
	}

	private int finMaxSum() {

		int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };

		int incl = arr[0];
		int excl = 0;
		int excl_new;
		for (int i = 0; i < arr.length; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;
			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}

		/* return max of incl and excl */
		return ((incl > excl) ? incl : excl);

	}

	private int findMaxSumOf2() {
		int sum = 0;
		int arr[] = new int[] { 55, 65, 200, 100,50 };
		for (int i = 0; i < arr.length; i++) {
			for (int j=i+2;j<arr.length;j++) {
				int s = arr[i]+arr[j];
				sum = s>sum?s:sum;
			}
		}

		System.out.println(sum);
		return 0;
	}
}
