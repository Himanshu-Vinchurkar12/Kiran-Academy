package com.str;

public class StringBasics {

	public static void main(String[] args) {

		String s1 = "java";

		String s2 = "java";

		System.out.println(s1 == s2); // true

		System.out.println(s1.concat(" world"));
		System.out.println(s1); // java

		s2 = s2.concat(" language");

		System.out.println(s2);

		System.out.println(s1 == s2); // false
//
//		System.out.println(s1.equals(s2)); // true

		// in String
		// == : to check the memory address
		// .equals() : to check the values

		String str1 = new String("java");
		String str2 = new String("java");

//		System.out.println(str1 == str2); // false
//		System.out.println(str1.equals(str2)); // true
//
//		System.out.println(s1 == str1); // false
//
//		System.out.println(s1.equals(str2)); // true

		// string has many inbuilt methods to manipulate the

		System.out.println(s1.toUpperCase());

		String a1 = "apple";

		String a2 = "Apple";

		System.out.println(a1 == a2);

		System.out.println(a1.equals(a2));

		System.out.println(a1.equalsIgnoreCase(a2));

		// 0 1 2 3 4
		// 'a' , 'p' , 'p' , 'l' , 'e'

		System.out.println(a1.charAt(0));
		System.out.println(a1.charAt(1));
		System.out.println(a1.charAt(2));
		System.out.println(a1.charAt(3));
		System.out.println(a1.charAt(4));

		System.out.println(a1.length());

		for (int i = 0; i < a1.length(); i++) {
			System.out.print(a1.charAt(i) + " ");
		}
		System.out.println();
		
		// reverse 
		
		for (int i = a1.length() - 1 ; i >= 0 ; i--) {
			System.out.print(a1.charAt(i) + " ");
		}
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("hello");  
		
		// methods : synchronized --> thread safe

		System.out.println(sb1.append(" world"));
		
		System.out.println(sb1); // hello world

		StringBuilder sb2 = new StringBuilder("hello");
		
		sb2.reverse();
		
		System.out.println(sb2);
		
		// methods : not synchronized --> are not thread safe
	}

}
