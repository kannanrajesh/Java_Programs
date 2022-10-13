package practise.input;

public class Return_Type {
 private int m1() {
	 int a 	= 200/5;
	 return a;
}
 public static void main(String[] args) {
	Return_Type ss = new Return_Type();
	//ss.m1();
	//int m1 = ss.m1();//ctrl+2,l
	int method_One = ss.m1();
	System.out.println(method_One);
}
 
}
//this program is example for "RETURN TYPE"