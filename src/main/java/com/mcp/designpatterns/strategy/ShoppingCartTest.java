package com.mcp.designpatterns.strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10.0);
		Item item2 = new Item("5678",40.0);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PayPalPaymentStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardPaymentStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
