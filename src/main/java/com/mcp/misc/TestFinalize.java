/**
 * 
 */
package com.mcp.misc;

/**
 * @author cm1
 *
 */
public class TestFinalize {
	public static void main(String[] args) throws InterruptedException {
		TestFinalize t1 = new TestFinalize();
		t1.method1();
		Thread.sleep(50000);
	}

	
	private void method1() {
		Animal lion = new Animal();
		System.out.println("Main is completed.");
		lion = null;
	}
}

class Animal {
	private String name;

	protected void finalize() {
		System.out.println("Rest in Peace!");
	}
}