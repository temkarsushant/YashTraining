package com.yash.exceptionhandling.example10;

public class Client {
	public static void main(String[] args) {
		
//		MaxCalculater mc = new MaxCalculater();
		MaxCalculater mc = new MaxAndAvgCalculator();
		System.out.println("Max is : "+mc.maxCalculator(3, 6));
	}
}
