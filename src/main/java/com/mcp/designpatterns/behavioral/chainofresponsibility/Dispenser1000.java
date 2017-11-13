package com.mcp.designpatterns.behavioral.chainofresponsibility;

public class Dispenser1000 implements DispenseChain {

	private DispenseChain chain;
	private ATMContainer container;
	
	public Dispenser1000(ATMContainer container) {
		this.container = container;
	}
	@Override
	public void nextDispenseChain(DispenseChain dispenseChain) {
		chain = dispenseChain;

	}

	@Override
	public void dispenseAmount(Double amount) {
		
		if(amount >= 1000){
			int  notes = (int) (amount/1000);
			if(notes > container.get_1000leaves()){
				chain.dispenseAmount(amount);
			}else {
				container.pop_1000leaves(notes);
				double remainder =  amount%1000;
				container.addToTray("Dispenced "+ notes+" of Rs 1000 notes");
				if(remainder > 0)
					chain.dispenseAmount(remainder);
			}
			
			
		}else
			chain.dispenseAmount(amount);

	}

}
