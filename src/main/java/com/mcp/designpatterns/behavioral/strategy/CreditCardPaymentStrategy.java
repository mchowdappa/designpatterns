package com.mcp.designpatterns.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardPaymentStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	public void pay(Double amount) {
		System.out.println("Credit card payment done: "+ amount);

	}

}
