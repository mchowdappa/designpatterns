package com.mcp.designpatterns.creational.factory2;

public class MongoDBConnection implements DBConnection {
	
	@Override
	public String connect() {
		return "Connecting to MongoDB";
	}

}
