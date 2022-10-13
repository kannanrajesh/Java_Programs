package project.Task3;

public class Demo_InterfaceB implements Demo_Interface{
	@Override
	public void sum() {
System.out.println(a + b);	
}
	public static void main(String[] args) {
	Demo_InterfaceB I = new Demo_InterfaceB();
	I.sum();
}


}

