package com.mcp.designpatterns.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
	
	public void pay(Double amount) {
		System.out.println("Paypal payment done: "+ amount );
	}

	
	private String emailId;
	private String password;
	
	public PayPalPaymentStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	
}
