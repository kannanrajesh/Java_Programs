package project_Task4;

import java.util.Scanner;

public class Starac {
	static int Starting_Value;
	static int Ending_Value;
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the Starting Value");
		Starting_Value = s1.nextInt();
		
		System.out.println("Enter the Ending Value");
		 Ending_Value = s1.nextInt();
		 int i=Starting_Value;
		 System.out.println("START");
		 while (i<=Ending_Value) {
			 System.out.print(" * ");
			 i++;
		}
		 System.out.println();
		 System.out.println("END");
	}
}
