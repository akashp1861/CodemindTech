package com.map;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class LinkedHashMapImpl {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<>(Collections.reverseOrder());
		
		tMap.put(1, "Ak");
		tMap.put(2, "mp");
		tMap.put(3, "Sp");
		tMap.put(4, "Kp");
		
		//Set<Map.Entry<Integer, String>> s1 = tMap.entrySet();
		
		System.out.println("reverse order" + tMap);
		

		
			
		
		
		
		}
	}


