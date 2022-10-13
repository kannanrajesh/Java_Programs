package project_Task4;

public class Pattern_2 {
	public static void main(String[] args) {
		
	
	int value =1;
	 for (int i = 4; i >=1; i--) {
		for (int j = 1; j <=i; j++) {
			
			System.out.print(" ");
		}
		for (int k = 4; k >=i; k--) {
			System.out.print(value+ " ");
			value++;
		}
		System.out.println();
	}
}
}
