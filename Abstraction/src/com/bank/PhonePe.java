package com.bank;

public class PhonePe extends Payment {

	@Override
	public void doPayment() {
		System.out.println("payment done via PhonePe");

	}

	public void paymentToScammer() {
		System.out.println("payment done to scammer");
	}

}
