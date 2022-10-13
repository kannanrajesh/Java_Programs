package com.practise.string;

public class Method_Overloading {
public static void main(String[] args) {
	Method_Overloading overload = new Method_Overloading();
	overload.st_Id(20.30000f);
	overload.st_Id(50);
	overload.st_Id(30.333 , 600);
	System.out.println("Hello");
	System.out.println(System.identityHashCode(overload));
	
}
public void st_Id(int a) {
System.out.println("my value is "+a);
System.out.println(System.identityHashCode("a"));
}
public void st_Id(double b,int d) {
System.out.println("my value is "+b+ " and " +d);
System.out.println(System.identityHashCode("b"+"d"));
}
public void st_Id(float c) {
System.out.println("my value is "+c);
System.out.println(System.identityHashCode("c"));
}


}

