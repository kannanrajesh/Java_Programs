package practise.input;

public class Logical_Error {

	private void m1() {
		int a = 200/0;
		System.out.println(a);
	}
	private void m2() {		// void => no return type.
							// void did only their work ,it doesnt share any credit to other methods.

	}
	public static void main(String[] args) {
		Logical_Error ss = new Logical_Error();
		ss.m1();
		ss.m2();
	}
}
//output
//console
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at practise.input.Logical_Error.m1(Logical_Error.java:6)
//at practise.input.Logical_Error.main(Logical_Error.java:15)
//because int a = 200/0; is arithmatic exception (or) logical error 200/0 is cannot operate 
// this program is example for "RUN TIME ERROR".
//int a = 200/0  this line as a example for "COMPILE TIME ERROR" because ";" does not appers