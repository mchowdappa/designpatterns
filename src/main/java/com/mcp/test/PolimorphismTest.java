package com.mcp.test;

public class PolimorphismTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		int x=1,y=2,z=4;      
		float o=3.0f,p=8.0f,q=5.9f; 
		
		
		c1.add(x,y);
		c1.add(o,p,q);
	}

	
	
	
}

class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(float a, float b) {
		System.out.println(a + b);
	}

	public void add(float a, float b, float c) {
		System.out.println(a + b + c);
	}

	public void add(int a, float b) {
		System.out.println(a + b);
	}

	public void add(float a, int b) {
		System.out.println(a + b);
	}
}
