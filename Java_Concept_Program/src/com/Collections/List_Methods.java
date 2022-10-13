package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Methods {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add("Ram RAjesh");
		li.add(20);
		li.add(null);
		li.add(23);
		li.add(10.3f);
		li.add(true);
		li.add(20);
		li.add(2, "Ocean");
		//	System.out.println(li);
		//size
		int size = li.size();
		System.out.println("size :"+size);
		//index
		int index = size-1;
		System.out.println("Index:"+index);
		//indexOf
		int index_20 = li.indexOf(20);
		System.out.println("20 first occurence:"+index_20);
		//lastIndexOf
		int lastIndexOf = li.lastIndexOf(23);
		System.out.println("last occurence :"+lastIndexOf);
		//contains
		boolean contains = li.contains("Ocean");
		System.out.println("contins:"+contains);
		//get
		Object object = li.get(2);
		System.out.println(object);		
		Object object2 = li.get(2);
		System.out.println(object2);
		//set
		 li.set(4, "UNIVERSE");
		System.out.println("after replace:"+li);
		//isEmpty
		boolean empty = li.isEmpty();
		System.out.println("list is Empty or not:"+empty);
		//clear
		li.clear();
		System.out.println("after clear:"+li);	
		}
	}
