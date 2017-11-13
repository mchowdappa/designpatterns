package com.mcp.designpatterns.behavioral.chainofresponsibility;

public class Dispenser500 implements DispenseChain {

	private DispenseChain chain;
	private ATMContainer container;
	
	public Dispenser500(ATMContainer container) {
		this.container = container;
	}
	@Override
	public void nextDispenseChain(DispenseChain dispenseChain) {
		chain = dispenseChain;

	}

	@Override
	public void dispenseAmount(Double amount) {
		if(amount >= 500){
			int  notes = (int) (amount/500);
			if (notes > container.get_500leaves()){
				chain.dispenseAmount(amount);
			}else {
				container.pop_500leaves(notes);
				double remainder =  amount%500;
				container.addToTray("Dispenced "+ notes+" of Rs 500 notes");
				if(remainder != 0)
					chain.dispenseAmount(remainder);	
			}
			
			
		}else
			chain.dispenseAmount(amount);
	}

}
