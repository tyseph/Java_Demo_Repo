package com.cg.feb22.oop.intro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers saperated by space");
		String input = sc.nextLine();
		
		
		StringTokenizer token = new StringTokenizer(input, ",");
		
		System.out.println(input);
		
		int num = 0, sum = 0;
		
		while(token.hasMoreTokens()) {
			String str = token.nextToken();
			num = Integer.parseInt(str);
			System.out.println(num);
			sum = num + sum;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
