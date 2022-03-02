package com.cg.feb22.oops;

// super

class Parent {
	int num = 10;
	static int num4 = 40;
	//private int num5 = 50;
}

class Child extends Parent {
	int num2 = 20;
	int num = 15;

	// super();

	public void m1() {
		System.out.println("Child " + num);
		System.out.println("Child " + this.num);
		System.out.println("Parent " + super.num);
	}
}

class GrandChild extends Child{
	
}

public class App {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.num);
		System.out.println(obj.num2);
		obj.m1();

		System.out.println(Parent.num4);
		Child.num4 = 45;
		System.out.println(Child.num4);
//		System.out.println(obj.num4);
//		System.out.println(obj.num5);
//		System.out.println(Parent.num5);
	}
}
