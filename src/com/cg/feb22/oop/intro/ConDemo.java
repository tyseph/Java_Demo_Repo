package com.cg.feb22.oop.intro;

//constructor

//Special type of method
//It does not have any return types
//name is same as class name
//Each class has its own constructor(default by java)
//We can create our own constructor
//if we create our own constructor java will not provide default constructor
///constructor is necessary to create object

public class ConDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.eid = 101;
		e1.firstName = "Sonu";
		e1.salary = 50000;
		System.out.println(e1.toString());
		e1.work();

		Employee e2 = new Employee();
		e2.eid = 102;
		e2.firstName = "Monu";
		e2.salary = 60000;
		System.out.println(e2.toString());

		Employee e3 = new Employee(103, "Tonu", 55000);
		System.out.println(e3.toString());
		
		Employee e4 = new Employee(104, "chonu");
		System.out.println(e4.toString());
		
		Customer c1 = new Customer(101, "Sajal");
		System.out.println(c1.toString());
		
	}
}
