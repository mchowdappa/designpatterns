package com.mcp.designpatterns.creational.abstractfactory;

enum FruitType {APPLE,MANGO, BANANA};

public interface IFruit {

	public String getName();
}

class Apple implements IFruit {

	public String getName() {
		return "My Name is Apple";
	}
}

class Mango implements IFruit {

	public String getName() {
		return "My name is Mango";
	}

}

class Banana implements IFruit {

	public String getName() {
		return "My Name is Banana";
	}

}
