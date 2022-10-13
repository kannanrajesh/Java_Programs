package com.practise.Array;

public class Single_Dimensional_Array {

	
	public static void main(String[] args) {
		//datatype refName[] = new datatype[length];
		
		int a[]=new int[5];    int b[]=new int[5];
		a[0]=10;				b[0]=60;
		a[1]=20;				b[1]=70;		
		a[2]=30;				b[2]=80;
		a[3]=40;				b[3]=90;
		a[4]=50;				b[4]=100;
		
		//int length = a.length;		//return type
		//int index=  a.length-1;
		//System.out.println(length);
		//System.out.println(index);
		//System.out.println(a[2]);
		/*for (int i = 0; i < a.length; i++) {	//for loop
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}*/ 
		//foreach loop
		for (int i : a) {
			System.out.println(i);
		}
		for (int i : b) {
			System.out.println(i);
		}
		
		
	}
}
