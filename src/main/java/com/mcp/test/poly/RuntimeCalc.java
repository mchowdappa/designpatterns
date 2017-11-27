package com.test.poly;

public class RuntimeCalc {
	
	public static void main(String arg[] ){
		Calculator c1;
		c1=new AddCalculator();
		c1.calculate(2,3);
		c1=new SubCalculator();
		c1.calculate(5,3);
	}
	
}





class Calculator
{
	public void calculate(int x,int y){
		
	}
}
class AddCalculator extends Calculator{
	public void calculate(int x, int y){
		System.out.println(x+y);
	}
}
class SubCalculator extends Calculator{
	@Override
	public void calculate(int x, int y){
		System.out.println( (x-y));
	}
}
