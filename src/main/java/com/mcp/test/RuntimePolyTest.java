package com.test;

public class RuntimePolyTest {

	public static void main(String[] args) {
		
		Animal a1;
		a1 = new Dog();
	

		a1= new Cat();
		
		a1=new Dog();
		a1.cry();
		a1.cry();
		a1.cry();

	}

}


class Animal{
	public void cry(){
		
	}
}
class Cat extends Animal{
	public void cry(){
		System.out.println("MEW");
			
		
	}
}
	
class Dog extends Animal{
	public void cry(){
		System.out.println("BOW");
	}
}