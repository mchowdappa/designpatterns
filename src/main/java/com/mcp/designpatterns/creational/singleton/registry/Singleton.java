package com.mcp.designpatterns.creational.singleton.registry;

public class Singleton {
	protected Singleton() {
		// Exists only to thwart instantiation.
	}

	public static Singleton getInstance(String classname) {
		return (Singleton) SingletonRegistry.REGISTRY.getInstance(classname);
	}
}
