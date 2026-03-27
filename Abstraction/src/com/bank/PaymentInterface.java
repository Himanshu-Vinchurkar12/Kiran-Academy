package com.bank;

public interface PaymentInterface {

	int a = 10; // pure constant {static & final}

	// do not have constructor , so initialize the variable

	void payment(); // buy default uses public abstract keyword

//	void display () {
//		System.out.println("a = "+a);
//	}  
	// method with bodies are not allowed in interface
}
