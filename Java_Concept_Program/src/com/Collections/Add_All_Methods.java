package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Add_All_Methods {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(34);
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(14);
		li1.add(3);
		li1.add(23);
		li1.add(34);
	
//		li.addAll(li1);									//AddAll method
//		System.out.println("after addAll in li  :"+li);
//		System.out.println("After addAll in li1:"+li1);
//		li.retainAll(li1);								//retainAll method
//		System.out.println("after retainAll in li :"+li);
//		System.out.println("after retainAll in li1:"+li1);
		li.removeAll(li1);								//removeAll method
		System.out.println("after removeAll in li : "+li);
		System.out.println("After removeAll in li1 :"+li1);
	}

}
