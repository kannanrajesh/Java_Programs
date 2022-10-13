package String_Types;

public class String_Types_Mutable_ImMutable {

	public static void main(String[] args) {
		
		// MUTABLE or NON-LITERAL STRING
		//StringBuffer refName = new StringBuffer("DATA");
		
//		StringBuffer s = new StringBuffer("HELLO");
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));			//To Find Out Memory->System.identityHashCode(refName);
//		
//		StringBuffer s1  = new StringBuffer("HELLO");
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s1));
//		
//		StringBuffer append_s_with_s1 = s.append(s1);
//		System.out.println(append_s_with_s1);
//		System.out.println(System.identityHashCode(append_s_with_s1));
//		
		
		//system.identityHashCode(refName);
		//StringBuffer refName = new StringBuffer("DATA");
		
//		StringBuilder s = new StringBuilder("HAI HELLO");
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));
//
//		StringBuilder s1  = new StringBuilder("HELLO HAI");
//		System.out.println(s1);
//		System.out.println(System.identityHashCode(s1));
//		
//		StringBuilder append_s_with_s1 = s.append(s1);		//APPEND 
//		System.out.println(append_s_with_s1);
//		System.out.println(System.identityHashCode(append_s_with_s1));

		//IM-MUTABLE STRING		or LITERAL STRING
		//String refName = "DATA";
		
		String s = "HELLO";
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));
//		
//		String s1 = "HELLO";
//		System.out.println(s1);
//		System.out.println(System.identityHashCode(s1));
//		
////		String concat_1 = s.concat(s1);					//concat method 1
////		System.out.println(concat_1);
////		System.out.println(System.identityHashCode(concat_1));
//		
//		s = s+s1;						//concat method 2
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));				
////																	o/p     HELLO
//																				366712642
//																				HELLO
//																				366712642
//																				HELLOHELLO
//																				1829164700
		String rev ="";
		for (int i = s.length()-1; i <=0; i--) {
			rev  =rev+ s.charAt(i);
			
		}
		System.out.println(rev);
	}
}
