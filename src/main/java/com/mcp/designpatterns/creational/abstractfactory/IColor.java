package com.mcp.designpatterns.creational.abstractfactory;

enum ColorType {RED,GREEN, BLACK};

public interface IColor {

	public String myColor();
}

class Black implements IColor {

	@Override
	public String myColor() {
		return "I am in BLACK color";
	}

}

class Green implements IColor {

	@Override
	public String myColor() {
		return "I am in GREEN color";
	}

}

class Red implements IColor {

	@Override
	public String myColor() {
		return "I am in RED color";
	}

}
