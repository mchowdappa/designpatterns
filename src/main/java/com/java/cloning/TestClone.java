/**
 * 
 */
package com.java.cloning;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chowdappa.m
 *
 */
public class TestClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClonableClass cc = new ClonableClass();
		cc.setSomeId(12345);
		cc.setSomeName("abcd");
		
		Map<String, String> map = new HashMap<>();
		map.put("abcd", "1234");
		map.put("kmln", "5000");
		map.put("pqr", "2500");
		map.put("xyz", "1000");
		cc.setSomeMaps(map);

		try {
			ClonableClass cc2 = (ClonableClass) cc.clone();
			if(cc.equals(cc2)){
				System.out.println("cc is equals to cc2");
			}
			if(cc == cc2){
				System.out.println("cc == cc2");
			}
			if(cc.hashCode()== cc2.hashCode()){
				System.out.println("cc's hashcode == cc2's hashcode");
			}
			
			map.put("extra", "new vale");
			
			
			System.out.println("CC values : " + cc.getSomeId() +"  "+ cc.getSomeName()+ "  "+cc.getSomeMaps());
			System.out.println("CC2 values : " + cc2.getSomeId() +"  "+ cc2.getSomeName()+ "  "+cc2.getSomeMaps());
			
			cc.setSomeId(555555);
			cc.setSomeName("New Value");
			cc2.setSomeId(88888);
			cc2.setSomeName("New Value22");
			
			System.out.println("CC values : " + cc.getSomeId() +"  "+ cc.getSomeName()+ "  "+cc.getSomeMaps());
			System.out.println("CC2 values : " + cc2.getSomeId() +"  "+ cc2.getSomeName()+ "  "+cc2.getSomeMaps());
			
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

class ClonableSubClass extends ClonableClass {

	public ClonableSubClass() {
		System.out.println("In Sub Constructor!!");
	}
	
}
class ClonableClass implements Cloneable {

	private int someId;

	private String someName;

	private Map<String, String> someMaps;

	public int getSomeId() {
		return someId;
	}

	public void setSomeId(int someId) {
		this.someId = someId;
	}

	public String getSomeName() {
		return someName;
	}

	public void setSomeName(String someName) {
		this.someName = someName;
	}

	public Map<String, String> getSomeMaps() {
		return someMaps;
	}

	public void setSomeMaps(Map<String, String> someMaps) {
		this.someMaps = someMaps;
	}

	public ClonableClass() {
		System.out.println("In Constructor");
	}

	public ClonableClass(String someStr, int someVal, Map<String, String> map) {
		
		System.out.println("In Parameter Constructor");

		this.someId = someVal;
		this.someName = someStr;
		this.someMaps = map;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
