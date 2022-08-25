package com.yash.oops.abstractction.interfacedemo;

public class D implements A, B, C {

	@Override
	public String displayC() {
		// TODO Auto-generated method stub
		return "displayC";
	}

	@Override
	public String displayB() {
		// TODO Auto-generated method stub
		return "displayB";
	}

	@Override
	public String displayA() {
		return "displayA";
	}

	public static void main(String[] args) {

		A a = new D();
		System.out.println(a.displayA());
	}
}
