package com.yash.oops.example8;

public class Client {
	public static void main(String[] args) {

		Electornics ee = new Mobile(1, "Pure", "05/08/1997");

		System.out.println(ee);
		
		Electornics ee1 = new Laptop(1, "Pure", "05/08/1997");
		
		System.out.println(ee1);
		
		Electornics ee2 = new LCD(1, "Pure", "05/08/1997");
		
		System.out.println(ee2);

	}
}
