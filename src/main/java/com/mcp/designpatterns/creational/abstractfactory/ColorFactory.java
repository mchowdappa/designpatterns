package com.mcp.designpatterns.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

	public IColor getColor(ColorType type){
		IColor color = null;
		switch(type){
		case GREEN:
			color = new Green();
			break;
		case BLACK:
			color = new Black();
			break;
		case RED:
			color = new Red();
			break;

		}
		return color;
	}
}
