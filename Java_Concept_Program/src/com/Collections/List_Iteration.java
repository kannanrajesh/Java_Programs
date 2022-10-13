package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Iteration {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		
		li.add("Ram RAjesh");		//0
		
		li.add(20);					//1
		
		li.add(null);				//2
		
		li.add(23);					//3
		
		li.add(10.3f);				//4
		
		li.add(true);				//5
		
		li.add(20);					//6
		
		li.add(2, "Ocean");			//add method
		
		li.set(2, "KOKILA");		//replace method
		
		System.out.println("after replace :"+li);
		
//		System.out.println("before remove method :"+li);
//		li.remove(0);										//remove method
//		System.out.println("after remove method :"+li);
//		
		
//		for (int i = 0; i <li.size(); i++) {
//			System.out.println(li.get(i));
//		}
//		for (Object a : li) {
//			System.out.println(a);
//		}
	}
}
