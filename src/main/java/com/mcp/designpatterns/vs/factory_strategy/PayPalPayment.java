package com.mcp.designpatterns.vs.factory_strategy;

public class PayPalPayment implements PaymentType {
	
	public void pay(Double amount) {
		System.out.println("Paypal payment done: "+ amount );
	}

	private String emailId;
	private String password;
	
	public PayPalPayment(){
	
	}
	
	public PayPalPayment(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
