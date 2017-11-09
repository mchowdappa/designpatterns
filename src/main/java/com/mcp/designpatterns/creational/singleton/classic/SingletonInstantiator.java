package com.mcp.designpatterns.creational.singleton.classic;

public class SingletonInstantiator {
	public SingletonInstantiator() {
		ClassicSingleton instance = ClassicSingleton.getInstance();
		ClassicSingleton anotherInstance = new ClassicSingleton();

	}
}