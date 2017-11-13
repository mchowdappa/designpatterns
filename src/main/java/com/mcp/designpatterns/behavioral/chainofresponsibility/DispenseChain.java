package com.mcp.designpatterns.behavioral.chainofresponsibility;

import java.util.Stack;

public interface DispenseChain {

	static Stack<String> stray = new Stack<>();
	void nextDispenseChain(DispenseChain dispenseChain);
	
	void dispenseAmount(Double amount);
}
