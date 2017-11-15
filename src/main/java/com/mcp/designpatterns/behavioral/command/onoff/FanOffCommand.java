package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class FanOffCommand implements Command {

	private Fan fan;
	
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}
	@Override
	public void execute() {
		fan.rotateOff();
	}

}
