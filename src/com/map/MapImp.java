package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImp {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<>();

		m1.put(101, "Ajit");
		m1.put(102, "Bhavesh");
		m1.put(103, "Neel");
		m1.put(104, "Bharati");
		//m1.put(101, "Aishwarya");

		/*
		 * Set<Entry<Integer, String>> s1 = m1.entrySet();
		 * 
		 * for (Entry<Integer, String> entry : s1) { System.out.println(entry. getKey()
		 * + " : "+ entry.getValue()); }
		 */
		
	   
		/*
		 * for(Entry<Integer, String> entry: m1.entrySet()) { Integer i =
		 * entry.getKey(); String s1 = entry.getValue(); System.out.println(i + " : ");
		 * 
		 * }
		 */
		
		
		Set<Entry<Integer, String>> set = m1.entrySet();

		Iterator<Entry<Integer, String>> e = set.iterator();
		while (e.hasNext()) {
			
				 Entry<Integer, String> entry = e.next();
		         System.out.println(entry.getKey() + " : "+ entry.getValue());
		  
		}
		
		System.out.println("###############");

		for(Entry<Integer, String> e2: m1.entrySet()) {
			if (e2.getValue()=="Neel") {
			continue;
			}
		else {
			System.out.println(e2.getKey() + " : "+ e2.getValue());
		}
		
	}
	}
	}


