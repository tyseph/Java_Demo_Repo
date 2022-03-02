package com.cg.feb22.doubts;

/*
 * final
 * variable - value cannot change
 * method - cannot be Over Ridden
 * class - Cannot be extended
 */

class ParentClass{
	final void m1() {
		System.out.println("m1");
	}
}

class ChildClass{
//	@Override
//	void m1() {
//		System.out.println("m2");
//	}
	// Not alllowed because final keyword
}
public class FinalDemo {

}
