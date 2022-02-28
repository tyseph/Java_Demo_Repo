package com.cg.feb22.oops;

/*
 * Method overloading
 * applicable to static and non static
 * same name and return type
 * but the argument should be different
 * can be done in same class or super0sub classes
 */

public class PolyDemo {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.add(10, 20);
		calc.add(10, 20, 30);
		calc.add(10, 20, 30, 40);
	}
}
