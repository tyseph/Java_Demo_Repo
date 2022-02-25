package com.cg.feb22.oop.intro;

class Class1{
	
	static int num;
	int num2;

	static  void m1() {
		System.out.println(Class1.num);
		Class1 obj = new Class1();
		System.out.println(obj.num2);
	}
	
	void m2() {
		System.out.println(Class1.num);
		System.out.println(this.num2);
	}
}
public class Employee {
	
	
	int eid;
	String firstName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName) {
		super();
		this.eid = eid;
		this.firstName = firstName;
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	void work() {
		System.out.println(firstName + " works...");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
