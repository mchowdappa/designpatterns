package com.mcp.designpatterns.creational.factory2;

public class DBConnectionTest {

	public static void main(String[] args) {
		
		DBConnection conn = DBConnectionType.getConnection("oracle");
		System.out.println(conn.connect());
		conn = DBConnectionType.getConnection("sybase");
		System.out.println(conn.connect());
		conn = DBConnectionType.getConnection("mongodb");
		System.out.println(conn.connect());
	}

}
