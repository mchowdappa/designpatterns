package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class FanOnCommand implements Command {

	Fan fan;
	public FanOnCommand(Fan fan) {
		this.fan = fan;
	}
	@Override
	public void execute() {
		fan.rotateOn();
	}

}
