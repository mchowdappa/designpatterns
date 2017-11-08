package com.mcp.designpatterns.creational.factory2;

public class DBConnectionType {

	public static DBConnection getConnection(String type){
		DBConnection connection = null;
		if ("ORACLE".equalsIgnoreCase(type)){
			connection = new OracleConnection();
		}else if("Sybase".equalsIgnoreCase(type)){
			connection = new SybaseConnection();
		}else if("MongoDB".equalsIgnoreCase(type))
			connection = new MongoDBConnection();
		
		return connection;
	}
}
