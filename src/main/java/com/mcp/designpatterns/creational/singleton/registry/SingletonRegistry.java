package com.mcp.designpatterns.creational.singleton.registry;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class SingletonRegistry {
	   public static SingletonRegistry REGISTRY = new SingletonRegistry();
	   private static HashMap<String, Object> map = new HashMap<>();
	   private static Logger logger = Logger.getRootLogger();
	   protected SingletonRegistry() {
	      // Exists to defeat instantiation
	   }
	   public synchronized Object getInstance(String classname) {
	      Object singleton = map.get(classname);
	      if(singleton != null) {
	         return singleton;
	      }
	      try {
	         singleton = Class.forName(classname).newInstance();
	         logger.info("created singleton: " + singleton);
	      }
	      catch(ClassNotFoundException cnf) {
	         logger.fatal("Couldn't find class " + classname);    
	      }
	      catch(InstantiationException ie) {
	         logger.fatal("Couldn't instantiate an object of type " + 
	                       classname);    
	      }
	      catch(IllegalAccessException ia) {
	         logger.fatal("Couldn't access class " + classname);    
	      }
	      map.put(classname, singleton);
	      return singleton;
	   }
	}