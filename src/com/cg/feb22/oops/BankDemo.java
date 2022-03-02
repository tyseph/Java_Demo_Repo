package com.cg.feb22.oops;

interface FinMin{
	abstract void empRules();
}

abstract class Rbi {

	void payInterest() {
		System.out.println("Payment Done");
	}

	abstract void kyc();
}

class HdfcBank extends Rbi implements FinMin {

	@Override
	void kyc() {
		System.out.println("Aadhaar");

	}

	@Override
	public void empRules() {
		System.out.println("Doc_1");
		
	}

}

class AxisBank extends Rbi implements FinMin {

	@Override
	void kyc() {
		System.out.println("PAN");

	}

	@Override
	public void empRules() {
		System.out.println("Doc_2");
		
	}

}

public class BankDemo {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.payInterest();
		obj.kyc();
		
		AxisBank obj2 = new AxisBank();
		obj2.payInterest();
		obj2.kyc();
	}
}
