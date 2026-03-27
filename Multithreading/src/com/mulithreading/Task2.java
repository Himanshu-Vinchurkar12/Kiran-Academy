package com.mulithreading;

public class Task2 extends Person implements Runnable   {

	void task2() {
		for (int i = 1; i < 10; i++) {

			System.out.println("task2 ==> " + i);
		}
	}
	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {

			System.out.println("task2 ==> " + i+"-------");
		}
	}
}
