package com.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapMethods {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<>();
		
		tMap.put(451, "Jalna");
		tMap.put(215, "Sangli");
		tMap.put(845, "Kolhapur");
		tMap.put(502, "Pune");
		tMap.put(502, "Mumbai");
		tMap.put(322, "Nagpur");

		System.out.println(tMap);
		
		//firstKey() : Returns the first (lowest) key currently in this map.
		System.out.println("firstKey() :"+ tMap.firstKey()); //op: 215
		
		//ceilingKey() : Returns the least key greater than or equal to the given key, or null if there is no such key.
		System.out.println("ceilingKey() :"+ tMap.ceilingKey(216)); //op:322
		System.out.println("ceilingKey() :"+ tMap.ceilingKey(915)); //op: null 
		
		//floorKey() : Returns the greatest key less than or equal to the given key, or null if there is no such key.
		System.out.println("floorKey() :" + tMap.floorKey(216)); //op: 215
		System.out.println("floorKey() :" + tMap.floorKey(505)); //op: 502
		System.out.println("floorKey() :" + tMap.floorKey(502)); //op: 502
		
		
		//higherKey() :Returns the least key strictly greater than the given key, or null if there is no such key. 
		System.out.println("higherKey() :" + tMap.higherKey(215)); //op : 322
		System.out.println("higherKey() :" + tMap.higherKey(322)); //op : 451
		System.out.println("higherKey() :" + tMap.higherKey(845)); //op : null
		
		
		//lowerKey() : return strictly less than the given key, or null if there is no such key.
		System.out.println("lowerKey() :"+ tMap.lowerKey(322)); //op: 215
		System.out.println("lowerKey() :"+ tMap.lowerKey(845)); //op: 502
		System.out.println("lowerKey() :"+ tMap.lowerKey(215)); //op: null
		
		/*ceilingEntry() : Returns a key-value mapping associated with the least key greater than or
		                   equal to the given key, or null if there is no such key.*/
		System.out.println("ceilingEntry() :" + tMap.ceilingEntry(214)); //op: 215=Sangli
		System.out.println("ceilingEntry() :" + tMap.ceilingEntry(502)); //op: 502=Mumbai
		System.out.println("ceilingEntry() :" + tMap.ceilingEntry(888)); //op: null 
		
		/*floorEntry() : Returns a key-value mapping associated with the greatest key less than or equal to the given key,
		                 or null if there is no such key.*/
		System.out.println("floorEntry() :"+ tMap.floorEntry(846)); // op:845=Kolhapur 
		System.out.println("floorEntry() :"+ tMap.floorEntry(845)); // op:845=Kolhapur 
		System.out.println("floorEntry() :"+ tMap.floorEntry(210)); // op:null
		
		//System.out.println(tMap.descendingKeySet());
		System.out.println("Iterate the key in descending order : ");
		NavigableSet<Integer> navigableSet= tMap.descendingKeySet();
		
		 Iterator<Integer> iterator = navigableSet.iterator();
		 while(iterator.hasNext()) {
			 Integer entry = iterator.next();
			 System.out.println(entry);
		 }
		 
		
	}
}
