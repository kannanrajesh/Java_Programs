package project_Task4;

import java.util.Scanner;

public class Loop_While {
	
	static int starting_Value;
	static int ending_Value;
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("Enter the starting value");
	starting_Value = s1.nextInt();
	
	System.out.println("Enter the ending value");
	ending_Value = s1.nextInt();
	
	System.out.println("***WHILE LOOP START");
	int i = starting_Value;
	while (i<=ending_Value) {
		System.out.println(i + " ");
		i++;
	}
}
}
