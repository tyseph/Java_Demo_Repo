package com.cg.feb22.oops.ex;

public class ExDemo5 {

	static void chkElg(int age) {
		RuntimeException obj = new RuntimeException("No Vote");
		if (age >= 18) {
			System.out.println("votable");
		} else {
			throw obj;
		}
	}

	public static void main(String[] args) {
		ExDemo5.chkElg(15);
	}
}
