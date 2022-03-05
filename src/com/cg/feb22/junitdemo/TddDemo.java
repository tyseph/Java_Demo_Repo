package com.cg.feb22.junitdemo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TddDemo {

	// add two integers

	@Test
	public void testAddition() {
		JUnitDemo obj = new JUnitDemo();
		assertEquals(obj.addition(10, 20), 30);
	}
	
	@Test
	public void testAddition2() {
		JUnitDemo obj = new JUnitDemo();
		assertNotEquals(obj.addition(10, 20), 31);
	}
}
