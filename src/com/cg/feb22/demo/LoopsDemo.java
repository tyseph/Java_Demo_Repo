package com.cg.feb22.demo;

public class LoopsDemo {

	public static void main(String[] args) {
		
		System.out.println("While Loop");
		
		int num = 1;
		
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("Do while Loop");
		
		int num2 = 1;
		
		do {
			System.out.println(num2);
			num2++;
		}while(num2 <= 10);
		
		System.out.println("For Loop");
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("For each Loop");
		
		int[] arr = {10, 12, 20, 25};
		
		for(int a : arr)
			System.out.println(a);
	}
	
}
