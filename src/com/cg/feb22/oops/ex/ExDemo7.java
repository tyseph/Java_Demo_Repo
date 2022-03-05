package com.cg.feb22.oops.ex;

public class ExDemo7 {

	static void checkEligibility(int age) throws VoterNotEligibleException, ArithmeticException{
		System.out.println(10 / 0);
		if (age >= 18)
			System.out.println("You can vote");
		else
			throw new VoterNotEligibleException("You may not vote");
	}

	public static void main(String[] args) {
		System.out.println("start");

		try {
			ExDemo7.checkEligibility(17);
		} catch (VoterNotEligibleException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
