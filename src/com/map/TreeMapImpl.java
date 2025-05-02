package com.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		TreeMap<Integer, String> tMap = new TreeMap<>();

		tMap.put(451, "Jalna");
		tMap.put(215, "Sangli");
		tMap.put(845, "Kolhapur");
		tMap.put(502, "Pune");
		tMap.put(502, "Mumbai"); // duplicate keys are not allowed, new key will override old one
		tMap.put(322, "Pune"); // duplicate values are allowed
		// tMap.put(null, "Pune"); Null is not allowed in TreeMap

		Set<Entry<Integer, String>> set = tMap.entrySet();

		System.out.println("Iterate the element in ascending : ");

		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// TreeMap iterate the elements in ascending order
		}

		System.out.println("########################################");

		System.out.println("Iterate the element in descending : ");

		TreeMap<Integer, String> tMap1 = new TreeMap<>(Collections.reverseOrder());

		tMap1.put(451, "Jalna");
		tMap1.put(215, "Sangli");
		tMap1.put(845, "Kolhapur");
		tMap1.put(502, "Pune");
		tMap1.put(502, "Mumbai");
		tMap1.put(322, "Pune");

		Set<Entry<Integer, String>> set2 = tMap1.entrySet();
		
		Iterator<Entry<Integer, String>> iterator2 = set2.iterator();
		
		while(iterator2.hasNext()) {
			Entry<Integer, String> entry = iterator2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		

	}
}
