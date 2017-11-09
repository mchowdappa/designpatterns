package com.mcp.designpatterns.creational.singleton.subclazz;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class SingletonReflection {

	private static HashMap<String, SingletonReflection> map = new HashMap<>();
	private static Logger logger = Logger.getRootLogger();

	protected SingletonReflection() {
		// Exists only to thwart instantiation
	}

	public static synchronized SingletonReflection getInstance(String classname) {
		SingletonReflection singleton = (SingletonReflection) map.get(classname);
		if (singleton != null) {
			logger.info("got singleton from map: " + singleton);
			return singleton;
		}
		try {
			singleton = (SingletonReflection) Class.forName(classname).newInstance();
		} catch (ClassNotFoundException cnf) {
			logger.fatal("Couldn't find class " + classname);
		} catch (InstantiationException ie) {
			logger.fatal("Couldn't instantiate an object of type " + classname);
		} catch (IllegalAccessException ia) {
			logger.fatal("Couldn't access class " + classname);
		}
		map.put(classname, singleton);
		logger.info("created singleton: " + singleton);
		return singleton;
	}
}
