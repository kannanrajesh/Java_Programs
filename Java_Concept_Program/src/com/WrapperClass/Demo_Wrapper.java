package com.WrapperClass;

public class Demo_Wrapper {
	public static void main(String[] args) {
		
		System.out.println("Converting Primitive Datatype To Objects");
		byte a =25;
		Byte obj_A = new Byte(a);
		System.out.println(obj_A);
		
		short b = 3000;
		Short obj_B = new Short(b);
		System.out.println(obj_B);
		
		long c = 234567890l;
		Long obj_C = new Long(c);
		System.out.println(obj_C);
		
		int d = 500;
		Integer obj_D = new Integer(d);
		System.out.println(obj_D);
		
		float e = 25.000000f;
		Float obj_E = new Float(e);
		System.out.println(obj_E);
		
		double f = 36.00000000000000000000;
		Double obj_F = new Double(f);
		System.out.println(obj_F);
		
		char g = 'g';
		Character obj_G = new Character(g);
		System.out.println(obj_G);
		
		boolean h = true;
		Boolean obj_H = new Boolean(h);
		System.out.println(obj_H);
		
		System.out.println("Retriving Primitive Datatypes From Object");
		
		byte value1 = obj_A;
		System.out.println(value1);
		
		short value2 =obj_B;
		System.out.println(value2);
		
		long value3 = obj_C;
		System.out.println(value3);
		
		int value4 = obj_D;
		System.out.println(value4);
		
		float value5 = obj_E;
		System.out.println(value5);
		
		double value6 = obj_F;
		System.out.println(value6);
		
		char value7 = obj_G;
		System.out.println(value7);
		
		boolean value8 = obj_H;
		System.out.println(value8);
	}
}
