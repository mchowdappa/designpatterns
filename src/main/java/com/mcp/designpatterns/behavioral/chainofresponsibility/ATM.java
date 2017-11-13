package com.mcp.designpatterns.behavioral.chainofresponsibility;

public class ATM {

	private static ATM _atm = new ATM();
	private static ATMContainer container = null; 
	
	public static ATM getATM(int _2000leaves, int _1000leaves, int _500leaves, int _100leaves){
		container = new ATMContainer(_2000leaves, _1000leaves, _500leaves, _100leaves);
		return _atm;
	}
	
	public ATMContainer getContainer(){
		return container;
	}
	
	
	public void widthdraw(double amount){
			if (amount % 100 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			DispenseChain c1 = new Dispenser2000(container);
			DispenseChain c2 = new Dispenser1000(container);
			DispenseChain c3 = new Dispenser500(container);
			DispenseChain c4 = new Dispenser100(container);
			
			c1.nextDispenseChain(c2);
			c2.nextDispenseChain(c3);
			c3.nextDispenseChain(c4);
			// process the request
			c1 .dispenseAmount(amount);
	}
}
