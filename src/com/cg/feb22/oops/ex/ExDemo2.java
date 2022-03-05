package com.cg.feb22.oops.ex;

public class ExDemo2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);
		}
		catch(ArithmeticException e) {
			System.err.print("Error");
		}
	}
}
