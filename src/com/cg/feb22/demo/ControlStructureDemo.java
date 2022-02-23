package com.cg.feb22.demo;

public class ControlStructureDemo {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3;
		
		if(num1>num2)
			num3 = num1;
		else
			num3 = num2;
		System.out.println(num3);
		
		num3 = (num1 > num2) ? num1 : num2;
		System.out.println(num3);
	}
}
