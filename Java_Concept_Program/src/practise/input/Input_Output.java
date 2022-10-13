package practise.input;

import java.util.Scanner;

public class Input_Output {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//in ->inputstream
		//out->output stream
		//byte
		System.out.println("what is your age");
		byte age = s.nextByte();
		System.out.println("your age is  "+age);
		//short
		System.out.println("what is your height");
		short height = s.nextShort();
		System.out.println("your height  "+height);
		//int
		System.out.println("what is your mobile number");
		int mobile = s.nextInt();
		System.out.println("moblie number is  "+mobile);
		//long
		System.out.println("Account number");
		long accno = s.nextLong();
		System.out.println("your account number is  "+accno);
		//float
		System.out.println("what is your weight");
		float weight = s.nextFloat();
		System.out.println("your weight  "+weight +"kg");
		//double
		System.out.println("what is your cgpa");
		float cgpa = s.nextFloat();
		System.out.println("your cgpa is  "+cgpa);
		//boolean
		System.out.println("true or false");
		boolean answer = s.nextBoolean();
		System.out.println(answer);
		//string
		System.out.println("next");
		String next = s.next();
		System.out.println(next);
		//string nxtline
		System.out.println("nextline");
		String nxtLine = s.nextLine();
		System.out.println(nxtLine);
		
		System.out.println("Address");
		String Add = s.nextLine();
		System.out.println("Address is "+Add);
	}
	
}
