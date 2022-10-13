package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_To_String {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add("RAM RAJESH");
		li.add(20);
		li.add("KOKILA");
		li.add(23);
		li.add(10.3f);
		li.add(true);
		li.add(20);
		System.out.println("list :"+li);
		String string = li.toString();			// List toString method
		System.out.println("String value :"+string);	
		System.out.println("Length :"+string.length());
		
		
	}

}
