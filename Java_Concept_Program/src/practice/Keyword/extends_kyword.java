package practice.Keyword;

public class extends_kyword extends sta_Keyword {

	 static int a =20000;
 public void add() {
	 /*	System.out.println(super.a);
	 	System.out.println(this.a);*/
	 this.math();//keyword->this
	super.math();//keyword->super
}
 public void math() {
System.out.println("i am from extends_kyword");
}
	
	public static void main(String[] args) {
		extends_kyword s1 = new extends_kyword();
		/*int value = s1.b;
		System.out.println(value);
		int value1 = s1.a;
		System.out.println(value1);
		m1();*/
		s1.add();
}
}
