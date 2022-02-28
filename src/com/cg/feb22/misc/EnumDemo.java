package com.cg.feb22.misc;
/*
 * types == datatypes
 * primitive types - 8 - raaw types, 
 * 
 * reference types made up iof primitive or reference types - user defined
 * class interface enum array String
 */

enum trialTest {
	words, wordsss, morewords;
}

public class EnumDemo {

	public static void main(String[] args) {

		//int num = 10;

		// variable
		// constant

//		final int num2 = 20; // constant(Value does not change)
		final int NUM_OF_VALUE = 20; //Capitals for variable
		
		System.out.println(NUM_OF_VALUE);
		// num2 = 25;

		final String[] weekDay = { "Mon", "Tue", "Wed" };
		System.out.println(weekDay[0]);

		weekDays today = weekDays.Thursday;
		System.out.println(today.ordinal());
		weekDays[] someday = weekDays.values();
		for (weekDays days : someday) {
			System.out.print(days + ", ");
		}

		trialTest[] test = trialTest.values();
		for (trialTest t : test) {
			System.out.print(t + " ");
		}
	}
}
