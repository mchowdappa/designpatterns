package com.mcp.designpatterns.creational.singleton;

/**
 * 
 * @author cm1
 *
 *  1. ClassicSingleton employs a technique known as lazy instantiation to create the singleton; 
 *  as a result, the singleton instance is not created until the getInstance() method is called for the first time. 
 *  This technique ensures that singleton instances are created only when needed.
 *  
 *  2. Notice that ClassicSingleton implements a protected constructor so clients cannot instantiate ClassicSingleton instances; 
 *  However, you may be surprised to see ClassicSingleton anotherInstance = new ClassicSingleton(); in different class of same package is legal.
 *  
 *  3. It's possible to have multiple singleton instances if classes loaded by different class loaders access a singleton.
 *  
 *  4. If ClassicSingleton implements the java.io.Serializable interface, the class's instances can be serialized and deserialized. 
 *  However, if you serialize a singleton object and subsequently deserialize that object more than once, you will have multiple singleton instances.
 *  
 *  5. ClassicSingleton class is not thread-safe. If two threads(t1 and t2) call ClassicSingleton.getInstance() at the same time, 
 *  two ClassicSingleton instances can be created if t1 is preempted just after it enters the if block and control is subsequently given to t2.
 */
public class ClassicSingleton {
	private static ClassicSingleton instance = null;

	protected ClassicSingleton() {
		// Exists only to defeat instantiation.
	}

	public static ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
}