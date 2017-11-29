package com.java.misc;

public class Example {
	private int[] originalArray;
	private int[] sortedArray;
	
	public void mergeSort(int[] array) {
		this.originalArray = array;
		this.sortedArray = new int[array.length];
		divide(0, array.length - 1);
	}

	private void divide(int low, int high) { 
		System.out.println("Divide => Low: "+ low +" High: "+ high);
		if (low < high) {
			int middle = (low + high) / 2; 
			divide(low, middle); // {0,7},{0,3}, {0,1} ;
			divide(middle + 1, high); // {0,0};  high = 1; // 2nd divide
			combine(low, middle, high);
		}
	}

	private void combine(int low, int middle, int high) { 
		System.out.println("Combine => low: " + low + " middle: "+ middle + " high: "+high);
		for (int i = low; i <= high; i++) {
			sortedArray[i] = originalArray[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (sortedArray[i] <= sortedArray[j]) {
				originalArray[k] = sortedArray[i];
				i++;
			} else {
				originalArray[k] = sortedArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			originalArray[k] = sortedArray[i];
			k++;
			i++;
		}
	}
public static void main(String[] args) {
	int [] unsortedArray = {-4,7,-9,11,8,22,98,5};
	
	Example example = new Example();
	example.mergeSort(unsortedArray);
}

public int recur(int count) {
	   if (count < 10) {
	       return recur(count++);
	   }
	   return count;
	}
	
}