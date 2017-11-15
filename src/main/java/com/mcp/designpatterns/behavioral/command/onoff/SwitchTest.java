package com.mcp.designpatterns.behavioral.command.onoff;

import com.mcp.designpatterns.behavioral.command.Command;

public class SwitchTest {

	public static void main(String... args) {

		Light light = new Light();
		Command lightOff = new LightOffCommand(light);
		Command lightOn = new LightOnCommand(light);

		Switch switch1 = new Switch(lightOn, lightOff);
		switch1.flipDown();
		switch1.flipUp();

		Fan fan = new Fan();
		Command fanOff = new FanOffCommand(fan);
		Command fanOn = new FanOnCommand(fan);

		Switch switch2 = new Switch(fanOn, fanOff);
		switch2.flipDown();
		switch2.flipUp();
	}

}
