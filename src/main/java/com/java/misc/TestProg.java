package com.java.misc;


import java.util.Arrays;

public class TestProg
{
   public static void main( String[] args )
   {
      double[] x = {6.4, 3.5, 7.5, 2.5, 8.9, 4.2, 9.2, 1.1, 5.7, 6.8} ;
      double[] help = new double[x.length];

      System.out.println("Before sort:  " + Arrays.toString(x) );

      MergeSort.sort( x, help );  // Merge sort

      System.out.println("\nAfter sort:   " + Arrays.toString(x) );
   }
}