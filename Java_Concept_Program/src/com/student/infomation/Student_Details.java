package com.student.infomation;
public class Student_Details {
public static void main(String[] args) {
	Student_Details overload = new Student_Details();
	overload.St_Fname();
	overload.St_Lname();
	overload.St_Age(19);
	overload.St_Gender();
	overload.St_Address();
	overload.St_Father();
	overload.St_Account(123456789);
}
public void St_Fname() {
	String name = "RAM";
	System.out.println("student first name "+name);
	System.out.println(System.identityHashCode(name));
}
public void St_Lname() {
	String lname = "KANNAN";
	System.out.println("student last name "+lname);
	System.out.println(System.identityHashCode(lname));
}
public void St_Age(int a) {
	System.out.println("student age is "+a);
	System.out.println(System.identityHashCode(a));
}
public void St_Gender() {
	//char male ='b';
	String b = "M";
	System.out.println("student Gender is "+b);
	System.out.println(System.identityHashCode(b));
}
public void St_Address() {
	String address = "TRICHY";
	System.out.println("student living address is "+address);
	System.out.println(System.identityHashCode(address));
}
public void St_Father() {
	String father = "RAJESH";
	System.out.println("student father name is "+father);
	System.out.println(System.identityHashCode(father));
}
public void St_Account(int c) {
	System.out.println("student account number is "+c);
	System.out.println(System.identityHashCode(c));
}
}
