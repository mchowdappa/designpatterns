package com.mcp.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public IShape getShape(ShapeType type){
		IShape shape = null;
		switch(type){
		case CIRCLE:
			shape = new Circle();
			break; 
		case TRAINGLE:
			shape = new Traingle();
			break;
		case SQUERE:
			shape = new Squere();
			break;
		}
		
		return shape;
	}
}
