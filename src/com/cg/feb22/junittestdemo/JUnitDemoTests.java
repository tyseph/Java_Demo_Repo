package com.cg.feb22.junittestdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cg.feb22.junitdemo.JUnitDemo;

public class JUnitDemoTests {

	private static JUnitDemo obj = null;

	@BeforeAll
	public static void setUp() {
		System.out.println("Setup");
		obj = new JUnitDemo();
	}

	@AfterAll
	public static void tearDown() {
		obj = null;
		System.out.println("closed");
	}

	@BeforeEach
	public void runBeforeEachTestCase() {
//		System.out.println("Before each test case");
	}

	@AfterEach
	public void runAfterEachTestCase() {
//		System.out.println("After each test case");
	}

	@Test
	public void testAddNums() {
//		System.out.println("Test_1.1");
		int expected = 30;
		int actual = obj.addNums(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() {
//		System.out.println("Test_1.2");
		int unexpected = 40;
		int actual = obj.addNums(10, 20);
		assertNotEquals(unexpected, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	public void testAddNums2(int num) {
//		System.out.println("Test_1.3");
		int expected = num + num;
		int actual = obj.addNums(num, num);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums() {
//		System.out.println("Test_2.1");
		int expected = -10;
		int actual = obj.subNums(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums2() {
//		System.out.println("Test_2.2");
		int unexpected = 40;
		int actual = obj.subNums(10, 20);
		assertNotEquals(unexpected, actual);
	}
}
