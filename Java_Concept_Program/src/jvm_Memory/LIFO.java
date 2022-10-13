package jvm_Memory;

import javax.swing.plaf.SliderUI;

public class LIFO {

	public static void main(String[] args) {
		//int a = 20;
		//a = 45;
		//a = 700;	//LAST IN FIRST OUT NOW A = 700
		
		
		String s = "WELCOME TO STRING";

		int length_String = s.length();
		System.out.println(length_String);
		
		int index_String = s.length()-1;//s.length-1;
		System.out.println(index_String);
		
		boolean equals_String = s.equals("welcome");
		System.out.println(equals_String);
		
		boolean equalsIgnoreCase_String = s.equalsIgnoreCase("WELCoME");
		System.out.println(equalsIgnoreCase_String);
		
		String upperCase_String = s.toUpperCase();
		System.out.println(upperCase_String);
		
		String lowerCase_String = s.toLowerCase();
		System.out.println(lowerCase_String);
	
		char charAt_String= s.charAt(3);
		System.out.println(charAt_String);
	
		int indexOf_String = s.indexOf('W');
		System.out.println(indexOf_String);
		
		
		
		int lastIndexOf_String = s.lastIndexOf('e');
		System.out.println(lastIndexOf_String);
		
		boolean contains_String = s.contains("w");
		System.out.println(contains_String);
		
		boolean startsWith_String = s.startsWith("Wel");
		System.out.println(startsWith_String);
		
		boolean endsWith_String = s.endsWith("e");
		System.out.println(endsWith_String);
		
		String trim_String = s.trim();
		System.out.println(trim_String);
		
		String replace_String = s.replace('e', '$');
		System.out.println(replace_String);
		
		String concat_String = s.concat(" ARRAY");
		System.out.println(concat_String);
		
		String substring_String = s.substring(3);
		System.out.println(substring_String);
	
		CharSequence subSequence_String = s.subSequence(2, 16);
		System.out.println(subSequence_String);

		String join_String = String.join("-","hello"," hai");
		System.out.println(join_String);
		
		
		int indexOf_S = s.indexOf('h');
		System.out.println(indexOf_S);
		
		String[] split_S = s.split(" ");
		//System.out.println(split_S[0]);
		
		for (int i = 0; i < split_S.length; i++) {
			System.out.println(split_S[i]);
		}
		
		for (String string : split_S) {
			System.out.println(string);
		}
		
		
		String replaceAll_s = s.replaceAll("[^a-zA-Z]", "").trim();
		System.out.println(replaceAll_s);
		
		
		  String trim_ReplaceALL = replaceAll_s.trim();
		  System.out.println(trim_ReplaceALL);
		 
		
		int indexOf_e1 = s.indexOf('e');
		System.out.println(indexOf_e1);
		
		int lastIndexOf_e3 = s.lastIndexOf('e');
		System.out.println(lastIndexOf_e3);
		
		int indexOf_e2 = s.indexOf('e', 4);
		System.out.println(indexOf_e2);
		
		int lastIndexOf_e = s.lastIndexOf('e', 6);
		System.out.println(lastIndexOf_e);
	
		int indexOf_lowercasevalue = s.toLowerCase().indexOf('l');
		System.out.println(indexOf_lowercasevalue);
	}
}
