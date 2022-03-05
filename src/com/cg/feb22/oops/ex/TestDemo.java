package com.cg.feb22.oops.ex;

public class TestDemo {

	public static int m1(int... point) {
		int sum = 0;
		for (int i : point) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(TestDemo.m1(1, 2, 3, 4, 5));

	}
}
