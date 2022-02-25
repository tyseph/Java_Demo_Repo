package com.cg.feb22.oop.intro;

import java.util.Scanner;

public class Lab3ex1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers saperated by space");
		String input = sc.nextLine();

		String[] c = input.split(" ");

		int num = 0, sum = 0;
		for(String s: c) {
			num = Integer.parseInt(s);
			sum += num;
			//System.out.println(s);
		}
		System.out.println(sum);
		
		sc.close();
	}

}
