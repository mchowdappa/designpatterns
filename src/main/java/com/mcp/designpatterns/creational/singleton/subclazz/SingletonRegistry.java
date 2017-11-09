package com.mcp.designpatterns.creational.singleton.subclazz;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class SingletonRegistry {

	private static HashMap<String, SingletonRegistry> map = new HashMap<String, SingletonRegistry>();
	private static Logger logger = Logger.getRootLogger();

	protected SingletonRegistry() {
		// Exists only to thwart instantiation
	}

	public static synchronized SingletonRegistry getInstance(String classname) {
		if (classname == null)
			throw new IllegalArgumentException("Illegal classname");
		SingletonRegistry singleton = (SingletonRegistry) map.get(classname);
		if (singleton != null) {
			logger.info("got singleton from map: " + singleton);
			return singleton;
		}
		if (classname.equals("SingletonRegistry_One"))
			singleton = new SingletonRegistry_One();
		else if (classname.equals("SingletonRegistry_Two"))
			singleton = new SingletonRegistry_Two();
		map.put(classname, singleton);
		logger.info("created singleton: " + singleton);
		return singleton;
	}
	
}