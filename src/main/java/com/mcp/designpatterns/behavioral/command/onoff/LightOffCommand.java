package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class LightOffCommand implements Command {

	private Light light;
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.lightOff();
	}

}
