package com.mcp.designpatterns.creational.factory2;

public class SybaseConnection implements DBConnection {
	@Override
	public String connect() {
		return "Connecting to Sybase";
	}
}
