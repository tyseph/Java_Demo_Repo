package com.cg.feb22.misc;
/*
 * types == datatypes
 * primitive types - 8 - raaw types, 
 * 
 * reference types made up iof primitive or reference types - user defined
 * class interface enum array String
 */
public class EnumDemo {

	public static void main(String[] args) {
		
		int num = 10;
		
		//variable
		//constant
		
		final int num2 = 20; //constant(Value does not change)
		//num2 = 25;
		
		final String[] weekDay = {"Mon", "Tue", "Wed"};
		System.out.println(weekDay[0]);
		
		weekDays today = weekDays.Monday;
		System.out.println(today);
		weekDays[] someday = weekDays.values();
		for(weekDays days: someday) {
			System.out.println(days);
		}
		
	}
}
