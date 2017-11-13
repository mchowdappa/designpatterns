package com.mcp.designpatterns.behavioral.chainofresponsibility;

public class Dispenser100 implements DispenseChain {

	
	private DispenseChain chain;
	private ATMContainer container;

	public Dispenser100(ATMContainer container) {
		this.container = container;
	}
	@Override
	public void nextDispenseChain(DispenseChain dispenseChain) {
		chain = dispenseChain;

	}

	@Override
	public void dispenseAmount(Double amount) {
		
		if(amount >= 100){
			int  notes = (int) (amount/100);
			if(notes > container.get_100leaves()){
				container.clear();
				container.addToTray("Out of cash..!!");
				return;
			}else {
				container.pop_100leaves(notes);
				double remainder =  amount%100;
				container.addToTray("Dispenced "+ notes+" of Rs 100 notes");
				if(remainder != 0)
					chain.dispenseAmount(remainder);
			}
			
		} else 
			chain.dispenseAmount(amount);

	}

}
