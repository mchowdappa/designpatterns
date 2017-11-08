package com.mcp.designpatterns.creational.abstractfactory;

class FruitFactory extends AbstractFactory{
	 
	public IFruit getFruit(FruitType type){
		IFruit fruit = null;
		switch(type){
		case APPLE:
			fruit = new Apple();
			break;
		case BANANA:
			fruit = new Banana();
			break;
		case MANGO:
			fruit = new Mango();
			break;

		}
		return fruit;
	}
}
