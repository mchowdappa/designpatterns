package com.mcp.designpatterns.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}else if(choice.equalsIgnoreCase("FRUIT"))
			return new FruitFactory();

		return null;
	}
}