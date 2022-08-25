package com.yash.oops.abstractction.abstractclass;

public class D extends C{

	public static void main(String[] args) {

		D d=new D();
		System.out.println(d.display());
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Hello";
	}
}
