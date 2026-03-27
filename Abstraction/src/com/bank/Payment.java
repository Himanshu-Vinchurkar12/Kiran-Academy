package com.bank;

public abstract class Payment {

	int a; // constructor will provide default value

	public abstract void doPayment();

	public void display() {
		System.out.println("a = " + a);

	}
}

// abstraction : we can write normal as well as abstract method

// interface : only abstract methods are allowed