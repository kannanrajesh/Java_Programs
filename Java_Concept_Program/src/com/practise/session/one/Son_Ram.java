package com.practise.session.one;

public class Son_Ram extends Father_Rajesh{
	@Override
		public void degree() {
		System.out.println("INDIAN ADMINISTRATIVE SERVICE");
	}
	public void car() {
System.out.println("TOYOTA LANDCRUISER");
	}
public void marriage() {
	System.out.println("LOVE MARRIAGE");
}
	
public static void main(String[] args) {
	Son_Ram boy = new Son_Ram();
	boy.tenth_std();
	boy.twelth_std();
	boy.degree();
	boy.car();
	boy.marriage();
	boy.giftS();
}

}
