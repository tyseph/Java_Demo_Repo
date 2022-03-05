package com.cg.feb22.oops.ex;

public class VoterNotEligibleException extends Exception {

	// ignore
	private static final long serialVersionUID = 1L;

	public VoterNotEligibleException() {

	}

	public VoterNotEligibleException(String message) {
		super(message);

	}

}
//package com.cg.feb22.oop.ex;
//
////unchecked exception 
//public class VoterNotEligibleException extends RuntimeException {
//
//	private static final long serialVersionUID = 1L;
//
//	public VoterNotEligibleException() {
//
//	}
//
//	public VoterNotEligibleException(String message) {
//		super(message);
//
//	}
//
//}