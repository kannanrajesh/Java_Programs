package project_Task4;

import java.util.Scanner;

public class Dowhile_Loop {
	static int starting_Value;
	static int ending_Value;
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		
		System.out.println("Enter the starting value");
		 starting_Value = s1.nextInt();
		 
		System.out.println("Enter the ending value");
		 ending_Value = s1.nextInt();
		 
		 System.out.println("***DO WHILE LOOP START***");
		 
		 int a = starting_Value;
		 System.out.println("START");
		 do {
			System.out.print("* ");
			a++;
		} while (a<= ending_Value);
	System.out.println();
	System.out.println("END");
	}
	
	
}

