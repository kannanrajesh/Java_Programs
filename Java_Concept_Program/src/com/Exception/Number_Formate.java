package com.Exception;

public class Number_Formate {

	public static void main(String[] args) {
//			String s = "20@&";
//			//s=s.replaceAll("[^a-zA-Z0-9]","");
//			System.out.println(s+22); 	//---------->2022
//			//convert string into integer
//			int value = Integer.parseInt(s);
//			System.out.println(value+10 );	//--------->30
		
		int a = 21;
		System.out.println(a+2);
		String value = String.valueOf(a);
		System.out.println(value+10);
		System.out.println(System.identityHashCode(value));
	}

}
