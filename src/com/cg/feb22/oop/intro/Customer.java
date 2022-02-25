package com.cg.feb22.oop.intro;

public class Customer {

	int custId;
	String firstName;
	double bill;

	public Customer() {
		super();
	}

	public Customer(int custId, String firstName) {
		super();
		this.custId = custId;
		this.firstName = firstName;
	}

	public Customer(int custId, String firstName, double bill) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.bill = bill;
	}

	void printBill() {
		System.out.println("Customer [custId=" + custId + ", firstName=" + firstName + ", bill=" + bill + "]");
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", bill=" + bill + "]";
	}

}
