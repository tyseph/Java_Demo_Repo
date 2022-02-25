package com.cg.feb22.oop.intro;

public class Employee {

	int eid;
	String firstName;
	double salary;

	Employee() {
		System.out.println("First constructor called");
	}

	Employee(int a, String b, double c) {
		System.out.println("Second constructor called");
	}

	void work() {
		System.out.println(firstName + " works...");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
