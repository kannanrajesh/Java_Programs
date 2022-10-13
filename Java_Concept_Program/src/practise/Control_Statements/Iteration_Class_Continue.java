package practise.Control_Statements;

public class Iteration_Class_Continue {
 
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i==5||i==3||i==7) {
				continue; 
				
			}else {
				System.out.println(i);
			}
			
		}
	}
}
