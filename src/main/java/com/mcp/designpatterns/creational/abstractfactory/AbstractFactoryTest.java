package com.mcp.designpatterns.creational.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
	
		AbstractFactory abf = FactoryProducer.getFactory("COLOR");
		System.out.println(abf.getColor(ColorType.GREEN).myColor());
		abf = FactoryProducer.getFactory("FRUIT");
		System.out.println(abf.getFruit(FruitType.BANANA).getName()); 
		abf = FactoryProducer.getFactory("SHAPE");
		
		System.out.println(abf.getShape(ShapeType.SQUERE).myShape()); 

	}

}
