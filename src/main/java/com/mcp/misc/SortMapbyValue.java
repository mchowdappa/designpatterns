/**
 * 
 */
package com.mcp.misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author cm1
 *
 */
public class SortMapbyValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> kart = new HashMap<>();
		kart.put("abcd", 1234);
		kart.put("xd", 456);
		kart.put("fr", 2345);
		kart.put("sd", 88);
		kart.put("99", 12);
		kart.put("ghj", 789);
		
		System.out.println("Before sorting:" + kart);
		
		Map<String, Integer> sortedMap = new TreeMap<>(new ValueSorter(kart));
		sortedMap.putAll(kart);
		System.out.println(sortedMap);
		
		kart = new HashMap<>();
		kart.put("abcd", 1234);
		kart.put("xd", 456);
		kart.put("fr", 2345);
		kart.put("sd", 88);
		kart.put("99", 12);
		kart.put("ghj", 789);
		
		// Java 8 way
		System.out.println("In Java 8 way");
		sortedMap = kart.entrySet().stream().
				sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		
		System.out.println(sortedMap);
		
	}

	static class ValueSorter implements Comparator<String> {

		Map<String, Integer> tmpMap;
		public ValueSorter(Map<String, Integer> kart) {
			this.tmpMap = kart;
		}
		@Override
		public int compare(String o1, String o2) {
			return tmpMap.get(o1).compareTo(tmpMap.get(o2));
		}
		
	}
}
