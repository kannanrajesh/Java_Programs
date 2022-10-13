package project_Task4;

import java.util.Scanner;

public class For_Loop {

	static int starting_Value;
	static int ending_Value;
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the starting Value");
		starting_Value = s1.nextInt();
		
		System.out.println("Enter the ending value");
		ending_Value = s1.nextInt();
		
		System.out.println("***LOOP START***");
		System.out.println("START");
		for (int i = starting_Value; i <=ending_Value; i++) {
			System.out.print("* ");
			
		}
		System.out.println();
		System.out.println("END");
	}
}

