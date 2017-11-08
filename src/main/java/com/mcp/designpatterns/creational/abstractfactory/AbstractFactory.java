package com.mcp.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {

	IColor getColor(ColorType type) {
		return null;
	}

	IShape getShape(ShapeType type) {
		return null;
	}
	IFruit getFruit(FruitType type) {
		return null;
	}
}
