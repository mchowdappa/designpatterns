package com.mcp.designpatterns.factory;

/**
 * Choose this example to differentiate between Strategy pattern v/s Factory pattern.
 * @author cm1
 *
 */
public class FactoryDesignPatternTest {

	public static void main(String[] args) {
		PaymentFactory paymentFactory = new PaymentFactory();
		PaymentType paymentType = paymentFactory.gePaymentType("paypal");
		paymentType.pay(3234.234);
	}

}
