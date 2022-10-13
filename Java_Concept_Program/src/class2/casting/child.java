package class2.casting;

import java.beans.PropertyChangeEvent;

public class child  extends parent{
		 
@Override
public void property() {
	System.out.println("this is the property of child class");
}	
	
	public static void main(String[] args) {
			child boy = new child();
			boy.property();
			System.out.println(System.identityHashCode(boy));
		}
}
