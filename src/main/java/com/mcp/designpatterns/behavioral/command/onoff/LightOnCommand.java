package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
				
	}
	@Override
	public void execute() {
		light.lightOn();
	}

}
