package class2.casting;

public class parent {
	public void property()
	{
		System.out.println("this is the property of parent class");
	}
public static void main(String[] args) {
	parent girl = new child();
	girl.property();
	System.out.println(System.identityHashCode(girl));
}
}
