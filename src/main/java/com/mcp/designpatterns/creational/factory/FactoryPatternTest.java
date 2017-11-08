package com.mcp.designpatterns.creational.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		IFruit fruit = FruitFactory.getFruit(FruitType.APPLE);
		System.out.println(fruit.getName());
		fruit = FruitFactory.getFruit(FruitType.BANANA);
		System.out.println(fruit.getName());
		fruit = FruitFactory.getFruit(FruitType.MANGO);
		System.out.println(fruit.getName());

	}

}
