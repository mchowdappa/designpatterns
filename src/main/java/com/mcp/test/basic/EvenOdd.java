package com.test.basic;
import java.util.*;
public class EvenOdd {
public static void main(String [] args){
	Scanner se=new Scanner(System.in);
	int x=se.nextInt();
	int mod=x%2;
	if(mod==0){
		System.out.println( x +"is even");
	
	}
	else {
		System.out.println(x + "is odd");
	}
		
}
}
