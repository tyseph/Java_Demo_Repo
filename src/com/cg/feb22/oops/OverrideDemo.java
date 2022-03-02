package com.cg.feb22.oops;

class BasicPhone {

	void music() {
		System.out.println("Chuckles in danger....");
	}
}

class SmartPhone extends BasicPhone {

	@Override
	void music() {
		System.out.println("Troubled with danger...");
	}
}

//class SuperClass {
//
//	void addNums(int i, int j) {
//		System.out.println(i + j);
//	}
//}
//
//class SubClass extends SuperClass {
//
//	@Override
//	void addNums(int i, int j) {
//		int gst = 18;
//		System.out.println(i + j + gst);
//	}
//}
 
public class OverrideDemo {

	public static void main(String[] args) {

		BasicPhone PHONE_1 = new BasicPhone();
		PHONE_1.music();

		SmartPhone PHONE_2 = new SmartPhone();
		PHONE_2.music();
		
		BasicPhone ph = new SmartPhone();
		ph.music();

//		SubClass obj = new SubClass();
//		obj.addNums(10, 20);
//
//		SuperClass obj2 = new SubClass();
//		obj2.addNums(10, 20);
	}
}
