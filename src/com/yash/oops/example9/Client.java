package com.yash.oops.example9;

public class Client {
	public static void main(String[] args) {

		Employee ee = new Employee();
		Employee ee2 = new Employee();
		
		Client cc=new Client();
//		System.out.println(cc.finalize());
		
		

	}

	@Override
	protected void finalize() throws Throwable {
//displaying some message to the user
		
	}
}
