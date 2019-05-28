/**
 * 
 */
package com.mcp.designpatterns.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author cm1
 *
 */
public class SingletonPatternTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		SingletonClass sc = SingletonClass.getInstance();
//		SingletonClass sc1 = SingletonClass.getInstance();
		
//		System.out.println("First instance - "+ sc);
//		System.out.println("Second instance - "+sc1);

	//	SingletonClass sc2 = (SingletonClass)sc1.clone();
//		System.out.println("cloned - "+sc2);

		Class cls = SingletonClass.class;
		Constructor constructor = cls.getDeclaredConstructor();
	    constructor.setAccessible(true);
	    SingletonClass singleton = (SingletonClass) constructor.newInstance();
	    
	    System.out.println(singleton);
	    SingletonClass singleton2 = SingletonClass.getInstance();
System.out.println("After call to singleton2");
	    System.out.println(singleton2);

	}

}

final class SingletonClass implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonClass instance;
	
	private SingletonClass() throws Exception {
		System.setSecurityManager(new SecurityManager());
	}
	public static SingletonClass getInstance() {
		if(instance == null) {
			try {
				instance= new SingletonClass();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
		//throw new CloneNotSupportedException("Clone not allowed");
	}
	private Object readResolve(){
		return instance;
	}
}
