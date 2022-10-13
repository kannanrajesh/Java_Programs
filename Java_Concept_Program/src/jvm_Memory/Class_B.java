package jvm_Memory;

public class Class_B {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "";
		String s3 = "  ";
		String s4 = null;
		
		
		/*boolean empty1 = s1.isEmpty();
		System.out.println(empty1);

		boolean empty2 = s2.isEmpty();
		System.out.println(empty2);
		
		boolean empty3 = s3.isEmpty();
		System.out.println(empty3);
		
		boolean empty4 = s4.isEmpty();
		System.out.println(empty4);*/
		
		System.out.println(s1.length());
		System.out.println(System.identityHashCode(s1));
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
	}
}
