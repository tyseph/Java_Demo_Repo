package com.cg.feb22.oops;

interface Int1 {
	
	public static void m1() {
		System.out.println("Int1, method1");
	}
	
	public abstract void m2();
}

interface Int2 {

	public abstract void m1();

	public static void m3() {
		System.out.println("m3");
	}

	public default void m4() {

	}
}

class Class5 {

	void m1() {

	}
}

class Class6 extends Class5 implements Int1, Int2 {

	@Override
	public final void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("Class6, Int1");
		
	}

}

class Class7 implements Int1, Int2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		System.out.println("Class7, Int1");
		
	}

}

public class IntersDemo {

	public static void main(String[] args) {
		Int2.m3();
		Class6 obj = new Class6();
		obj.m2();
		Class7 obj2 = new Class7();
		obj2.m2();
	}

}
