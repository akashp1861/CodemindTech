package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(45);
		linkedHashSet.add(null);
		linkedHashSet.add(100);
		linkedHashSet.add(70);
		linkedHashSet.add(10);
		
	    Iterator<Integer> iterator2 = linkedHashSet.iterator();
	       while(iterator2.hasNext()) {
	    	   System.out.println(iterator2.next());   //LinkedHashSet maintain insertion order 
	       }
	       
	  System.out.println("Reverse the set: "+ linkedHashSet.reversed()); //reversed(): Returns a reverse-ordered view of this collection.
	  
	  System.out.println("get first element: "+ linkedHashSet.getFirst());//getFirst():Gets the first element of this collection.
	  
	  System.out.println("get last element: "+ linkedHashSet.getLast()); //getLast(): Gets the last element of this collection.
	  
	 
	  
	  
	  
	  
	  
	  
	  
	}
}
