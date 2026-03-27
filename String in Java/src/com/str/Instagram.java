package com.str;

public class Instagram {

	private String password = "tka123";

	public void setPassword(String oldPass, String newPass) {

		if (oldPass.equals(password)) {
			
			password = newPass;
		} else {
			System.out.println("old password is incorrect");
		}
	}

	public void login(String password) {

		if (password == this.password) {

			System.out.println("login success");
		} else {
			System.out.println("login failed");

		}
	}

}
