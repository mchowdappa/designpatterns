package com.mcp.designpatterns.behavioral.command;

public class Engineer implements Command {

	@Override
	public void execute() {
		System.out.println("Sell bugs, charge for fixes");
	}

}
