/**
 * 
 */
package com.java.ds.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cm1
 *
 */
public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Emp, String> map = new HashMap<>();
		Emp emp = new Emp();
		emp.name= "acddd";
		map.put(emp , "name");
		System.out.println(map.get(null));
		map.forEach((k, v)-> System.out.println(k +" - "+v));
	}

}


class Emp {
	String name;
	
	@Override
	public int hashCode() {
		return 0;
	}
	
	
}