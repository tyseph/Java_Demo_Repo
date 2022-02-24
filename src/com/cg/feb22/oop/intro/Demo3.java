package com.cg.feb22.oop.intro;

public class Demo3 {
	public static void main(String[] args) {
		Demo3.addNums(10, 20); //parameters
		
		int sum = Demo3.addNumsAndReturns(20, 50);
		System.out.println(sum);
		
	}
	
	static void addNums(int i, int j) { //argument
		System.out.println(i + j);
	}
	
	static int addNumsAndReturns(int i, int j) {
		return i+j;
	}

}
