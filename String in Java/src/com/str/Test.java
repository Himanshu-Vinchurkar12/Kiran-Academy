package com.str;

public class Test {

	public static void main(String[] args) {

		Instagram ig = new Instagram();
		
		String str = "hack" ; 
		
		ig.setPassword(str.concat(str), "hack123");
		
		ig.login("hack123");
	}
}
