package com.cg.feb22.misc;

public enum State {

	MAHARASHTRA("MH", 1), TELANGANA("TS", 2), KARNATAKA("KA", 3), OTHER_STATE("OS", 4);

	public final String stateCode;
	public final int n;

	State(String stateCode, int n) {
		this.stateCode = stateCode;
		this.n = n;
	}

	public String getStateCode() {
		return this.stateCode;
	} 
	public int getNum() {
		return this.n;
	}
}
