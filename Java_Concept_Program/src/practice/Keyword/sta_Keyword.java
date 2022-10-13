package practice.Keyword;

public class  sta_Keyword {
	 static int a =20;
	 public static int b = 30;
	 final int c = 200;//keyword->final
public void math() {
System.out.println("i am from sta_keyword");
}
	public static void m1() {
		System.out.println("Hello i am m1");
	}
	public final void m2() {
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		sta_Keyword s = new sta_Keyword();
		System.out.println(s.b);
		System.out.println(s.a);
		s.m1();
		s.m2();
		System.out.println(s.c);
		
	}
	
}
