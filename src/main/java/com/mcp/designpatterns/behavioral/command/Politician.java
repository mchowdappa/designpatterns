package com.mcp.designpatterns.behavioral.command;

public class Politician implements Command {

	@Override
	public void execute() {
		System.out.println("Take money from rich and take votes from poor");

	}

}
