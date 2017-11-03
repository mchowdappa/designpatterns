package com.mcp.designpatterns.factory;

public class PaymentFactory {
	
	private static String PAY_PAL = "PAY_PAL";
	private static String CREDIT_CARD = "CREDIT_CARD";
	public PaymentType gePaymentType(String type){
		PaymentType paymentType = null;
		if(PAY_PAL.equalsIgnoreCase(type))
			paymentType = new PayPalPayment();
		else if(CREDIT_CARD.equalsIgnoreCase(type))
			paymentType = new CreditCardPayment();
		return paymentType;
	}
	
}
