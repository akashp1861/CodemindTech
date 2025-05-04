package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ProgramsMap {

	public static void main(String[] args) {

		String str = "welcome to codemind";

		LinkedHashMap<Character, Integer> LMap = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < 0; i++) {

			if (!(LMap.containsKey(str.charAt(i)))) {
				LMap.put(str.charAt(i), 1);
			} else {
				LMap.put(str.charAt(i), LMap.get(str.charAt(i))+1);
			}
		}

		Set<Entry<Character, Integer>> s1 = LMap.entrySet();

		Iterator<Entry<Character, Integer>> i1 = s1.iterator();
		
		   while (i1.hasNext()) {
			Entry<Character, Integer> entry = i1.next();
			System.out.println(entry.getKey() + entry.getValue());
		}

	}
}
