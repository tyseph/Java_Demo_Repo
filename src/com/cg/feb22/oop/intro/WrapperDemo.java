package com.cg.feb22.oop.intro;

public class WrapperDemo {

	public static void main(String[] args) {
		
//		Employee obj = new Employee();
//		//obj.
//		
//		int num =  10;
//		//num.
//		
//		//Wrapper classs
//		Integer num2=10;
//		//num2.
//		
////		doube d1 = 10;
////		Double d2 = 10;
//		
////		byte b1 = 10;
////		Byte b2 = 10;
//		
//		//and so on
		
		//use of wrapper classes
		
		String s1 = "10", s2 = "20", s3;
		
		int i = Integer.parseInt(s1), j = Integer.parseInt(s2), k = i + j;
		s3 = Integer.toString(k);
		
		System.out.println(s3);
		
		
		Byte num1 = 10, num2 = 20;
		int num3 =  num1 + num2;
		System.out.println(num3);
		
		
		
	}
}
