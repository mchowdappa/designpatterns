package com.java.misc;


import java.util.Arrays;

public class MergeSort
{
   public static void merge(double[] a, 
                            int iLeft, int iMiddle, int iRight, 
                            double[] tmp)
   {
      int i, j, k;

      i = iLeft;
      j = iMiddle;
      k = iLeft;

      while ( i < iMiddle || j < iRight )
      {
         if ( i < iMiddle && j < iRight )
         {  // Both array have elements
            if ( a[i] < a[j] )
               tmp[k++] = a[i++];
            else
               tmp[k++] = a[j++];
         }
         else if ( i == iMiddle )
            tmp[k++] = a[j++];     // a is empty
         else if ( j == iRight )
            tmp[k++] = a[i++];     // b is empty
      }
   }

   public static void sort(double[] a, double[] tmp)
   {
      int width;

      for ( width = 1; width < a.length; width = 2*width )
      {
         // Combine sections of array a of width "width"
         int i;

         for ( i = 0; i < a.length; i = i + 2*width )
         {
            int left, middle, right;

	    left = i;
	    middle = i + width;
	    right  = i + 2*width;

            merge( a, left, middle, right, tmp );

         }

         /* ================================================
	    Copy tmp[ ] back to a[ ] for next iteration
	    ================================================ */
         for ( i = 0; i < a.length; i++ )
            a[i] = tmp[i];

       	 System.out.println("After 1 iter: " + Arrays.toString(a) );
      }
   }
}