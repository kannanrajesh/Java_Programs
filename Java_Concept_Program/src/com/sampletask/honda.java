package com.sampletask;

public class honda extends hero {
@Override
public void engine(int b) {
	System.out.println(b);
	
}
	public static void main(String[] args) {
	 honda engine2 = new honda();
	 engine2.engine(110);
	}
	
}
