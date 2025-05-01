package com.vector_stack;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<>();
		v1.add("Prathamesh");
		v1.add("Akash");
		v1.add("Chandan");
		v1.add("Nikhil");
		v1.add("Akashy");
		v1.add("Bharati");
		v1.add("Rutu");
		
		//capacity(): the current capacity (the length of its internal data array, kept in the field elementData of this vector)
		System.out.println(v1.capacity());  //op: 10 
		
		//contains(): Returns true if this vector contains the specified element.
		System.out.println(v1.contains("Akashd")); //op: false-> element is not present

		//elementAt(): Returns the component at the specified index.
		System.out.println(v1.elementAt(0)); //op: Prathamesh
		
		//getFirst():Gets the first element of this collection.
		System.out.println(v1.getFirst()); //op: prathamesh
		
		//getLast():Gets the last element of this collection.
		System.out.println(v1.getLast()); //op: Tulsi
		
		/*indexOf():Returns the index of the first occurrence of the specified element in this vector, 
		  or -1 if this vector does not contain the element.*/ 
		System.out.println("indexof (): "+ v1.indexOf("Prathamesha")); //op: -1 -> element is not present in vector
		
		//vector() : Removes the element at the specified position in this Vector. 
		System.out.println(v1.remove(4));
		System.out.println("After remove the index(4) :" + v1);
		
		
		//iterate the elements using Enumeration cursors
		Enumeration<String>E1 = v1.elements();
		while(E1.hasMoreElements()) {
			System.out.println(E1.nextElement());
		}
		
	}

}
