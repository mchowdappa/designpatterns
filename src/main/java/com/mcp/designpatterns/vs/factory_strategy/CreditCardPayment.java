package com.mcp.designpatterns.vs.factory_strategy;

public class CreditCardPayment implements PaymentType {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardPayment(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	public CreditCardPayment() {
		// TODO Auto-generated constructor stub
	}
	public void pay(Double amount) {
		System.out.println("Credit card payment done: "+ amount);

	}

}
