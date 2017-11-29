/**
 * 
 */
package com.java.search;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

import com.java.sort.InsertionSortTest;

/**
 * @author chowdappa.m
 *
 */
public class BinarySearchTest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		int size = 10;
		int a[] = new int[size];
		createArray(a);
	//	displayArray(a);
//		leniarSearch(a);
		sortArray(a);
		displayArray(a);
		binarySearch(a);

	}

	private static void binarySearch(int[] a) {
		System.out.println("Enter number to search : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		sc.close();
		int low = 0;
		int high = a.length;
		
		
		while(low != high){
			int mid = high/2;
			if(key < a[mid]){
				high = mid;
			}else if(key> a[mid]){
				low = mid;
			}else if(key == a[mid]) {
				System.out.println("Found "+ key +" at "+ mid );
				return;
			}
		}
		
		System.out.println("Not found");
	}

	private static void sortArray(int[] a) {
	
		InsertionSortTest.doInsertionSort(a);
	}

	private static void leniarSearch(int[] x) {
		System.out.println("Enter number to search : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		sc.close();
		int count = 0;
		for(int i = 0; i<x.length; i++){
			if(key== x[i]){
				count++;
				System.out.println(count+ ". "+key+" found at "+ i);
			}
		}
		if(count >0 )
			System.out.println(key+" found "+ count + "time(s)" );
	}

	private static void displayArray(int[] x) {
		for(int i = 0; i<x.length;i++ ){
			System.out.println(x[i]);
		}
	}

	private static void createArray(int[] x) {

		for(int i =0; i<x.length; i++){
			Random random = new SecureRandom();
			x[i] = random.nextInt(25);
		}

	}

}
