package com.cg.feb22.oops.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s1, s2, s3;
		int n1 = 0, n2 = 0, n3 = 0;
		try {
			n1 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Nope");

		}

		try {
			n2 = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Nope");

		}

		try {
			n3 = n1 / n2;
		} catch (ArithmeticException e) {
			System.out.println("Undefined");
		} finally {
			System.out.println(n3);
		}
		sc.close();
	}
}
