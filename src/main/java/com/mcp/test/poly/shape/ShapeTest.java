package com.mcp.test.poly.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c1;
		c1 = new Circle();
		System.out.println(c1.display());
		c1 = new TriAngle();
		System.out.println(c1.display());
		c1 = new Squre();
		System.out.println(c1.display());

	};

}

interface Shape {

	public String display();
}

class Circle implements Shape {
	public String display() {
		return "circle";
	}
}

class TriAngle implements Shape {
	public String display() {
		return "Triangle";
	}
}

class Squre implements Shape {
	public String display() {
		return "Squre";
	}
}