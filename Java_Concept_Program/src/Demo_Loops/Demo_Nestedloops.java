package Demo_Loops;

public class Demo_Nestedloops {
public static void main(String[] args) {
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <=3; j++) {
			
			System.out.print(j);
			
		}
		System.out.println();
	}
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("$ ");
		}
		System.out.println();
	}
	for (int i = 3; i >=1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for (int i = 3; i >=1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("* ");
	}
		System.out.println();
	}
		for (int i = 4; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
	}
}

}


