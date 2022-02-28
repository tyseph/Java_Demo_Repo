package com.cg.feb22.oops;

class BasicPhone {
	void music() {
		System.out.println("PLays Music....");
	}
}

class SmartPhone extends BasicPhone{
	
	@Override
	void music() {
		System.out.println("PLays dolby music...");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		phone.music();
	}
}
