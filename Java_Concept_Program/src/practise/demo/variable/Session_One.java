package practise.demo.variable;

public class Session_One {
	 final int a = -5+8*6;
	final int b = (55+9)%9;
	final int c = 20+-3*5/9;
	public static void main(String[] args) {
		Session_One s1 = new Session_One();
		s1.m1();
		s1.m2();
		s1.m3();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
	}
	public void m1() {
		int a = -5+8*10;
		System.out.println(a);
		System.err.println(a);
	}
	
	public void m2() {
		//int b = (55+9)%9;
		//System.out.println(b);
	}
	public void m3() {
		//int c = 20+-3*5/9;
		//System.out.println(c);
	}
}


