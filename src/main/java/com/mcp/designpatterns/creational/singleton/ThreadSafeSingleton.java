package com.mcp.designpatterns.creational.singleton;

import org.apache.log4j.Logger;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton singleton = null;
	private static Logger logger = Logger.getLogger(ThreadSafeSingleton.class);
	private static boolean firstThread = true;

	protected ThreadSafeSingleton() {
		// Exists only to defeat instantiation.
	}

	// Not recommended; as per the Oracle doc.
	/**
	 * Unfortunately, double-checked locking causes problems. To wit, compiler
	 * optimizations can make the assignment of the new Singleton object before
	 * all its fields are initialized. The only practical solution is to
	 * synchronize the getInstance_Synchronized() method.
	 * 
	 */
	public static ThreadSafeSingleton getInstance() {
		if (singleton == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (singleton == null) {
					singleton = new ThreadSafeSingleton();
				}
			}
		}
		return singleton;
	}

	public static synchronized ThreadSafeSingleton getInstance_Synchronized() {
		if (singleton == null) {
			singleton = new ThreadSafeSingleton();
		}

		return singleton;
	}

}
