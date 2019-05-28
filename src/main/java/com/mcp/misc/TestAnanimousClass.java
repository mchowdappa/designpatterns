/**
 * 
 */
package com.mcp.misc;

/**
 * @author cm1
 *
 */
public class TestAnanimousClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread t1 = new MyThread() {
			@Override
			public void run() {
				System.out.println("in inner class");
			}
		};
		
	}

}


class MyThread implements Runnable{

	String name;
	
	public MyThread() {
		System.out.println("In contsruction");
	}
	@Override
	public void run() {
		System.out.println("Running thread+"+name);
	}
	
	
}