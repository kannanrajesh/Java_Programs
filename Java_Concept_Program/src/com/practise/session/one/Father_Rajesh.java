package com.practise.session.one;

public abstract class Father_Rajesh {

	public static void main(String[] args) {
		Father_Rajesh dad = new Son_Ram();
		dad.degree();
		dad.twelth_std();
		dad.tenth_std();
		dad.giftS();
		Father_Rajesh dad1 = new Daughter_Suiksha();
		dad1.degreeD();
		dad1.marriageD();
		dad1.giftD();
		dad1.tenth_std();
		dad1.twelth_std();
		
	}

	public void tenth_std() {
		System.out.println("10th standard");
	}
	public void twelth_std() {
System.out.println("12th standard");
	}
	public abstract void degree();
	public abstract void marriage();
	
	public void degreeD() {
System.out.println("Engineering");
}
	public void marriageD() {
System.out.println("ARRANGE MARRIAGE");
}
	public void giftS() {
System.out.println("BMW CAR");
System.out.println("1200 sqft PLOT");
System.out.println("BIKE");
	}
	public void giftD() {
System.out.println("50 pound Gold");
System.out.println("BMW CAR");
System.out.println("1200 sqft PLOT");
	}
}

