package com.Exception;

public class Try_Catch_block {

	public static void main(String[] args) {
		String a ="20";
		int a1 = 20;
		//System.out.println(a);
		//Exception
//		try {
//			System.out.println(a/2);			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Process completed");
//		}
		//NullPointerException
//		try {
//			System.out.println(a/0);			//ArithmeticException
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("Process completed");
//		}
		//ArrayIndexOutOfBoundsException
//		try {
//			System.out.println(a/0);			//ArithmeticException
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("Process completed");
//		}
		//ArithmericException
		try {
			System.out.println(a1/0);
		System.out.println(Integer.parseInt(a+23));			//ArithmeticException
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(" ArithmeticException Process completed");
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(" Process completed");
		}
		
	}
}
