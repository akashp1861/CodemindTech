package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPracticeExamples {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(55);
		l1.add(44);
		l1.add(52);
		l1.add(100);
		l1.add(445);

		// access the value using for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("####################################");

		// iterate the value using foreach loop
		for (Integer integer : l1) {
			System.out.println(integer);
		}

		System.out.println("####################################");
		
	    //iterate through iterator 
		Iterator <Integer> i1 = l1.iterator();
		 while(i1.hasNext()) {
			 System.out.println(i1.next());
		 }
		
		 System.out.println("####################################");
		 
		 
		 ArrayList<String> l2 = new ArrayList<>();
		 l2.add("Welcome");
		 l2.add("to");
		 l2.add("Codemind");
		 
		 ListIterator<String> ls = l2.listIterator(l2.size());
		 while(ls.hasPrevious()) {
			 System.out.println(ls.previous());
		 }
	
	}

}
