package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetPracticeExample {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(null);                           //null allow only once 
		h1.add(51);
		h1.add(45);
		h1.add(100);
		h1.add(10);
		h1.add(100);                           //Duplicates are not allowed 
		
		Iterator<Integer>iterator = h1.iterator();
		
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());  //Hashset does not maintain insertion order 
		  }
		  
	System.out.println("###################################");
		  
		
	     
	}
	
	    
}