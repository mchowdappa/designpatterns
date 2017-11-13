package com.mcp.designpatterns.behavioral.chainofresponsibility;

public class Dispenser2000 implements DispenseChain {

	DispenseChain chain;
	
	ATMContainer container = null;
	
	public Dispenser2000(ATMContainer container) {
		this.container = container;
	}
	
	@Override
	public void nextDispenseChain(DispenseChain dispenseChain) {
		chain = dispenseChain;

	}

	@Override
	public void dispenseAmount(Double amount) {
		
		if(amount >= 2000){
			int  notes = (int) (amount/2000);
			if(notes > container.get_2000leaves()){
				chain.dispenseAmount(amount);
			}else {
				container.pop_2000leaves(notes);
				double remainder =  amount%2000;
				container.addToTray("Dispenced "+ notes+" of Rs 2000 notes");
				if(remainder != 0)
					chain.dispenseAmount(remainder);
			}
			
			
		} else
			chain.dispenseAmount(amount);
		
		// All chains completed.
		container.dispense();
		
	}
}
