package com.practise.access2;

public class Student_Class {
	
	public static void main(String[] args) {
		Student_Class boy = new Student_Class();
		boy.bag();
		boy.pen();
		boy.note_Book();
		boy.pencil();
	}
	
	
	private void note_Book() {

		System.out.println("note_Book");
	}
	
	public void pen() {
		System.out.println("Pen");
	}
	
	protected void pencil() {
		System.out.println("Pencil");
	}
	
	 void bag() {
System.out.println("Bag");
	}
	
	
	
	
	
	
}
