package com.cg.feb22.demo;
import java.util.Scanner;
import java.util.Random;

public class ScannerDemo {
	public static void main(String[] args) {
		//Scanner
		Scanner object = new Scanner(System.in);
		System.out.println("Enter your name");
		
		//String name = object.next();
		String name = "Random";
		System.out.println(name);
		object.close();
		
		//Random
		Random ran = new Random();
		System.out.println(ran.nextInt());
		
		for(int i=0;i<5;i++) {
			int num = ran.nextInt(100);
			if(num>50) {
				System.out.println(num);
			}
		}
	}

}
