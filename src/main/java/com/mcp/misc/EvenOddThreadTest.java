/**
 * 
 */
package com.mcp.misc;

/**
 * @author cm1
 *
 */
public class EvenOddThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OddEvenRunnable odd = new OddEvenRunnable(1);
		OddEvenRunnable even = new OddEvenRunnable(0);
		Thread t2 = new Thread(even, "evenThread");
		Thread t1 = new Thread(odd, "oddThread");
		t1.start();
		t2.start();
	}

}

class OddEvenRunnable implements Runnable{

	private int MAX = 10;
	static Object lock = new Object();
	int number = 2;
	int remainder;
	public OddEvenRunnable(int r) {
		this.remainder = r;
	}
	@Override
	public void run() {
		while(number<=MAX) {
			synchronized (lock) {
				while (number % 2 == remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Name:"+Thread.currentThread().getName()+" - "+number);
				number++;
				lock.notify();
			}
		}
		
	}
	
}