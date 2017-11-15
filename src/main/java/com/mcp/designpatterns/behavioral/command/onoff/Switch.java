package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class Switch {

	private Command onCommand, offCommand;
	public Switch(Command onCommand, Command offCommand) {
		this.offCommand = offCommand;
		this.onCommand = onCommand;
	}
	
	public void flipUp(){
		onCommand.execute();
	}
	
	public void flipDown(){
		offCommand.execute();
	}
	
}
