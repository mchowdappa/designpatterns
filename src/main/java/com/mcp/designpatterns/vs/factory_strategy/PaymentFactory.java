package com.mcp.designpatterns.vs.factory_strategy;

public class PaymentFactory {
	
	private static String PAY_PAL = "PAYPAL";
	private static String CREDIT_CARD = "CREDITCARD";
	public PaymentType gePaymentType(String type){
		PaymentType paymentType = null;
		if(PAY_PAL.equalsIgnoreCase(type))
			paymentType = new PayPalPayment();
		else if(CREDIT_CARD.equalsIgnoreCase(type))
			paymentType = new CreditCardPayment();
		return paymentType;
	}
	
}
