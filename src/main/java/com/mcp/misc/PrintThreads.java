/**
 * 
 */
package com.mcp.misc;

/**
 * @author cm1
 *
 */
public class PrintThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Printer p1 = new Printer();
		Thread t1 = new Thread(new OddThread(p1, 10));
		Thread t2 = new Thread(new EvenThread(p1, 10));
		t1.start();
		t2.start();
	}

}

class Printer {

	volatile boolean isOddPrinted = true;

	public synchronized void printEven(int num) {
		while (!isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(" -- " + num);
		isOddPrinted = false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();

	}

	public synchronized void printOdd(int num) {
		
		
		while (isOddPrinted) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" -- " + num);
		isOddPrinted = true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}
}

class OddThread implements Runnable {
	int MAX;
	Printer p;

	public OddThread(Printer p, int max) {
		this.p = p;
		this.MAX = max;
	}

	@Override
	public void run() {
		int num = 1;
		while (num <= MAX) {
			p.printOdd(num);
			num += 2;
		}
	}

}

class EvenThread implements Runnable {
	int MAX;
	Printer p;

	public EvenThread(Printer p, int max) {
		this.p = p;
		this.MAX = max;
	}

	@Override
	public void run() {
		int num = 0;
		while (num <= MAX) {
			p.printEven(num);
			num += 2;
		}
	}

}