package com.yash.oops.example1;

public class Client {
	public static void main(String[] args) {

		Department[] dd = new Department[2];
		dd[0] = new Department(1, 0, "Test");
		dd[1] = new Department(2, 0, "Test");
//        dd[2] = new Department(3, 0, "Test");

		Department dd2 = new Department(4, 0, "Test");

		Employee ee2 = new Employee(1, "Test", "Test", "Test", 0, "Test", "Test", dd2, 0, "Test");

		Customer cc = new Customer(1, "Test", "Test", "Test", 0, "Test", 0, "Test");

		System.out.println(cc);
		System.out.println(ee2);

	}

}
