package com.practise.typecasting;

public class Casting_Session1 {
// casting its a converting one data type into another data type
	public static void main(String[] args) {
		//widening  is convert smaller value to bigger value 
		 byte a = 100; // 1 byte
		 short b = a;  //2 byte
		 long c = b; //8 byte
		System.out.println(c);
		
		float f = 100.47f;
		double g = f;
		System.out.println(g);
		
		//narrowing is convert bigger value to smaller value
		long value = 234567892l; //8 byte
		int value2 = (int) value; 
		System.out.println(value2);
	}
	
}
