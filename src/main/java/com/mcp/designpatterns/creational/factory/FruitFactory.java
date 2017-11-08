package com.mcp.designpatterns.creational.factory;

 class FruitFactory {
	 
	public static IFruit getFruit(FruitType type){
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
