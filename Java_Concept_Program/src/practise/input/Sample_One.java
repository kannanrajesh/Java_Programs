package practise.input;

public class Sample_One {

	String name;
	
	private void m1() {
	String name = "RAJESH";
	System.out.println(name);
}
	private void m2() {
		System.out.println(name);
}

	public static void main(String[] args) {
		Sample_One ss = new Sample_One();
		ss.m1();
		ss.m2();
	}
}
