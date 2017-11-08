package com.mcp.designpatterns.creational.abstractfactory;

enum ShapeType {SQUERE,CIRCLE, TRAINGLE};

public interface IShape {
	public String myShape();
}


class Circle implements IShape{

	@Override
	public String myShape() {
		return "I am looks like Circle";
	}
	
}

class Traingle implements IShape{
	
	@Override
	public String myShape() {
		return "I am looks like Traingle";
	}
}

class Squere implements IShape {
	
	@Override
	public String myShape() {
		return "I am looks like Squere";
	}
	
}