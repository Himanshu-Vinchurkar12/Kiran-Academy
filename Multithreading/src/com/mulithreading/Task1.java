package com.mulithreading;

public class Task1 extends Thread{
	void task1() {
		for (int i = 1; i < 10; i++) {

			System.out.println("task1 --> " + i);
		}
	}
	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println("task1 --> " + i);
		}
	}
}
