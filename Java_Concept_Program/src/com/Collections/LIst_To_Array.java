package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class LIst_To_Array {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(34);
		System.out.println(li);
		Object[] array = li.toArray();	//list to array method
		for (Object object : array) {
			System.out.println(object);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("length :"+array.length);
	}

}
