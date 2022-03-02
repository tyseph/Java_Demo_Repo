package com.cg.feb22.oops;

//Abstract

/*
 * Concrete Method - normal Method(All till now)
 * method signature and method body
 * 
 * What to do? - target - method signature - add two numbers
 * How to do it? - method body - actual process of adding two integers
 * 
 * Abstract 
 * has abstract keyword
 * Abstract Method - Only method signature
 * What to do? - target - method signature - add two numbers
 * Can be created within abstract class and in interface, but not in 
 * concrete class
 * 
 * Abstract Class
 * has abstract keyword
 * its object cannot be created
 * can be inherited and abstract method can be overridden in the child class
 */

abstract class AbsClass {
	abstract public void addNums(int i, int j); //announcement by PM
}

public class AbstractDemo extends AbsClass {

	@Override
	public void addNums(int i, int j) { //actual implementation
		System.out.println(i + j);
	}

	public static void main(String[] args) {
//		AbsClass obj = new AbsClass(); //Cannot instantiate the type abstract
		AbstractDemo obj = new AbstractDemo();
		obj.addNums(10, 20); //here you take the vaccine
	}
}
