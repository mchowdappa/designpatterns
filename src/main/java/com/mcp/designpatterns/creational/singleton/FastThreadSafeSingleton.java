package com.mcp.designpatterns.creational.singleton;

/**
 * 
 * @author cm1
 *
 * <b>Disadvantage:</b> You can't change your mind and allow multiple singleton instances later on.
 */
public class FastThreadSafeSingleton {
	public final static FastThreadSafeSingleton INSTANCE = new FastThreadSafeSingleton();

	private FastThreadSafeSingleton() {
		// Exists only to defeat instantiation.
	}

	public static FastThreadSafeSingleton getInstance(){
		return INSTANCE;
	}
}
