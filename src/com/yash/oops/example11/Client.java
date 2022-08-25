package com.yash.oops.example11;

import java.util.Date;

public class Client {
	public static void main(String[] args) {

		Employee ee = new Employee(1, "Sushant", "100", "Pune", new Date(), new Date());

		System.out.println(ee.toString());
	}
}
