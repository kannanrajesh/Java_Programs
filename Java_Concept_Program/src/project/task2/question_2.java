package project.task2;

public class question_2 {
public static void main(String[] args) {
	 int a = 10;
	 int b = 20;
	 int c = a;
	 a = b;
	 b = c;
	 System.out.println("After swap");
	 System.out.println("a is :" + a);
	 System.out.println("b is :" + b);
	 System.out.println(System.identityHashCode(c));
}
}
