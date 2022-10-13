package com.practise.Array;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {	//mainmethod
		Multi_Dimensional_Array aa = new Multi_Dimensional_Array();//object creation
		//datatype refName[]={value1, value2, value3.......};
			int b[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
};
			int length = b.length;		// return type for length of array.
			int index = b.length-1;		//return type for index of array.
			
			System.out.println(b.length);
			System.out.println(index);
		
			/*for (int i = 0; i < b.length; i++) {	//for loop
				System.out.println(b[i]);
			}
			System.out.println(b[3]);*/
			for (int number : b) {			//foreach loop
				System.out.println(number);
				//System.out.println(System.identityHashCode(b));
			}
			
	}
	
	
	
	
}
