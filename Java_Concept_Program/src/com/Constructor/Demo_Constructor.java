package com.Constructor;

public class Demo_Constructor {
		int x;
	public Demo_Constructor() {
			x = 75;
			int a = 20;
			int b = 30;
			System.out.println(a+b+x);
	
	}
	public Demo_Constructor(int age,String name) {
		
		System.out.println(age+" "+name);
		

} 
	
	
	
	public static void main(String[] args) {
		Demo_Constructor d1 = new Demo_Constructor();
		Demo_Constructor d2 = new Demo_Constructor(29, "RAJESH");
		System.out.println(System.identityHashCode(d1));
		System.out.println(System.identityHashCode(d2));
	}

}
