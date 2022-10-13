package com.Collections.SetMethods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Set_Demo {

	public static void main(String[] args) {
		 
		Set<Object> s = new HashSet<Object>();			//HashSet method
		s.add("RAM");
		s.add(4);
		s.add("SUBIKSHA");
		s.add(55);											// prints Random order 
		s.add(100);
		s.add(21);
		s.add("RAJESH");
		System.out.println("HashSet Method :"+s);
		
		Set<Object> s1 = new LinkedHashSet<Object>();		//linkedHashSet method
		s1.add("RAM");
		s1.add(4);
		s1.add("SUBIKSHA");									//prints Insertion Order
		s1.add(55);
		s1.add(100);
		s1.add(21);
		s1.add("RAJESH");
		System.out.println("LinkedHashSet method :"+s1);
		
		Set<Object> s2 = new TreeSet<Object>();				//TreeSet method
		s2.add(4);
		s2.add(55);
		s2.add(100);										//prints small value to higher value
		s2.add(21);
		System.out.println("TreeSet method :"+s2);

	
	}
	
}
