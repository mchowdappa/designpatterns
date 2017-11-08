package com.mcp.designpatterns.vs.factory_strategy;

/**
 * Just to elaborate how to differentiate between Strategy pattern v/s Factory pattern. <b>Not a complete implementation</b>.
 * @author cm1
 *
 */
public class FactoryDesignPatternTest {

	public static void main(String[] args) {
		PaymentFactory paymentFactory = new PaymentFactory();
		PaymentType paymentType = paymentFactory.gePaymentType("paypal");
		paymentType.pay(3234.234);
		
		paymentType = paymentFactory.gePaymentType("creditcard");
		paymentType.pay(3234.234);
	}

}
