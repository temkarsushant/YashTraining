package com.yash.string;

public class Example7 {
	public void finalize() {

		System.out.println("Garbage Collection");

	}

	public static void main(String[] args) {

		Example7 gc = new Example7();

		Example7 gc1 = new Example7();

	//	 gc=null;

	//	 gc1=null;

		gc1 = gc;

		System.gc();

	}
}
