package com.cg.feb22.oops.ex;

public class ExDemo4 {

	static void printNums() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}

	static void m1() {
//		ExDemo4.printNums();
	}

	static void m2() {
		try {
			ExDemo4.printNums();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

//		ExDemo4.printNums();
		ExDemo4.m2();
	}
}
