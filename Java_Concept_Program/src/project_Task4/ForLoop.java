package project_Task4;

import java.util.Scanner;


public class ForLoop {
	static int starting_Value;
	static int ending_Value;
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the starting Value");
		starting_Value = s1.nextInt();
		
		System.out.println("Enter the ending value");
		ending_Value = s1.nextInt();
		
		System.out.println("***LOOP START***");
		for (int i = starting_Value; i <=ending_Value; i++) {
			System.out.println(i);
			
		}
	}
}
