/**
 * 
 */
package com.java.sort;

/**
 * @author chowdappa.m
 *
 */
public class SelectionSortTest {
	 
    public static int[] doSelectionSort(int[] arr) throws Exception{
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            printArray(i, arr);
            Thread.sleep(5000);
        }
        return arr;
    }
     
    public static void main(String a[]) throws Exception{
        int[] arr1 = {10,34,2,56,7,67,88,42};
        printArray(-1, arr1);
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
    
    private static void printArray(int n, int[] a) {
    	System.out.println("-----------  "+n+"   -----------------"); 
    	for(int i:a){
    		 
             System.out.print(i);
             System.out.print(", ");
         }
    	 System.out.println("\n\n");
    }
}
