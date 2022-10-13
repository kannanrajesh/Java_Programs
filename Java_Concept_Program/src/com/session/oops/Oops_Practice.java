//package
package com.session.oops;
//class
public class Oops_Practice {
//main method
	public static void main(String[] args) {
		System.out.println("hello");
		Oops_Practice hero = new Oops_Practice();
		Oops_Practice director = new Oops_Practice();
	//object
		hero.st_Name();
		hero.st_Age();
		hero.St_Name();
		hero.st_Id();
		director.st_Id();
		director.st_Name();
		director.st_Age();
	}
	//this method contains student details
	//customized method
	private void st_Name() {
		System.out.println("I am student");
	}
	private void St_Name() {
		System.out.println("i am student1");
	}
	private void st_Age() {
		System.out.println("i am age");
	}
	private void st_Id() {
		System.out.println("i am id");
	}
}

