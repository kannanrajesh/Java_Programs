package project_Task4;

import java.util.Scanner;

public class Do_While {
	static int starting_Value;
	static int ending_Value;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s1 =new Scanner(System.in);
		
		System.out.println("Enter the starting value");
		 starting_Value = s1.nextInt();
		 
		System.out.println("Enter the ending value");
		 ending_Value = s1.nextInt();
		 System.out.println("***DO WHILE LOOP START***");
		 
		 int a = starting_Value;
		 do {
			System.out.println(a);
			a++;
		} while (a<= ending_Value);
		 System.out.println(System.identityHashCode(s1));
	}

}
