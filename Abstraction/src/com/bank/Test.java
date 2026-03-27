package com.bank;

public class Test {

	public static void main(String[] args) {

		PhonePe p = new PhonePe();
		p.doPayment();
		p.paymentToScammer(); // no dynamic dispatch is done

		System.out.println("***********************************");
		
		Payment pay = new PhonePe();
		pay.doPayment();
		pay.display();
		// pay.paymentToScammer(); // not showing the method because of dynamic dispatch
		
		System.out.println("***********************************");

		Payment google = new GooglePay();
		google.doPayment();
		google.display();

	}
}


