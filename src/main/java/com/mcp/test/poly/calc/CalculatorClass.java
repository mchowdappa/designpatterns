package com.mcp.test.poly.calc;
public class CalculatorClass{
	
	public static void main(String [] args){
	Calculator c1;
	c1=new AddCalc();
	System.out.println("sum="+c1.calculate(2,3));
	
	
	c1=new SubCalc();
 
 	System.out.println("diff="+c1.calculate(2,4)+"jhansi");
 	
 	
	c1=new MulCalc();
	System.out.println("prod="+c1.calculate(5,6));
	
	
	c1=new DivCalc();
	
	System.out.println("div="+c1.calculate(9,8));
	}
}
interface Calculator {
public int calculate(int x, int y);


}
class AddCalc implements Calculator{
	public int calculate(int x, int y){
		int sum=x+y;
	return sum;	
	}
}
class SubCalc implements Calculator{
	public int calculate(int x,int y){
		int diff=x-y;
		return diff;
}
}
class MulCalc implements Calculator{
	public int calculate(int x,int y){
		int prod=x*y;
		return prod;
		
	}
}
class DivCalc implements Calculator{
	public int calculate(int x,int y){
		int div=x/y;
		return div;
	}
}
