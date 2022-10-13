package com.vari.demo;

public class Demo {
		
	boolean a;
	int b;
	float c;
	char d;
	long e;
	byte f;
	
	public static void main(String[] args) {
		//int a = 20;
		 //a = 30;// = sign is called assigining operator
		// System.out.println(a);
		
		 
		 Demo D = new Demo();
		D.m1();
		D.m2();
		D.m3();
	}
	
	private void m1() {
			int a = 50;
			System.out.println(a);
			System.err.println(a);
	}
	private void m2() {
			//int a = 100;
			System.out.println(a+""+b+c  +d +e  +f);
	}
	private void m3() {
		//int a = 200;
		//System.out.println(a);
	}
}
