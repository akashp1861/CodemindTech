package com.vector_stack;

import java.util.Stack;

public class StackPracticeImp {

	public static void main(String[] args) {
	
	/* Stack is a legacy class introduced in java 1.0 version
	 * It is a child class of Vector 
	 * stack allows multiple null 
	 * stack allows duplicates
	 * stack maintain insertion order 
	*/
     Stack<Integer> s1 = new Stack<>();
     
     s1.add(45);
     s1.add(55);
     s1.add(100);
     s1.add(10);     
     s1.add(150);
     s1.add(null);  
     s1.add(null);   
     s1.add(10);    
     
     for (Integer integer : s1) {
		System.out.println(integer);  
	}
     
     System.out.println("#########################");
     
     System.out.println("peek(): "+ s1.peek());
     
     System.out.println("#########################");
     
     System.out.println(s1);
     
     System.out.println("#########################");
     
     System.out.println("pop(): "+ s1.pop());
     
     System.out.println("#########################");
     
     System.out.println(s1);
     
     System.out.println("#########################");
     
     System.out.println("push() : "+ s1.push(60));
     
     System.out.println("#########################");
     
     System.out.println(s1);
     
     System.out.println("#########################");
     
     System.out.println("peek(): "+ s1.peek());
     
	}
}
