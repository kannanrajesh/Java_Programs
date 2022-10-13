package Demo_Loops;

import java.util.Scanner;

public class Demo_Loop_Scanner {
	static int starting_Value;
	static int ending_Value;
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the starting value");
		starting_Value = s1.nextInt();
		
		System.out.println("Enter the ending value");
		ending_Value = s1.nextInt();
		
		System.out.println("****loopstarted****");
		
		for (int i = starting_Value; i <=ending_Value; i++) {
			
			System.out.println(i);
		}
	}
}
