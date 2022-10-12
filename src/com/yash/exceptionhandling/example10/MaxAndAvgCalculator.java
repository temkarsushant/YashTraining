package com.yash.exceptionhandling.example10;

public class MaxAndAvgCalculator extends MaxCalculater {

	public int maxCalculator(int m1, int m2) throws NumberFormatException, NullPointerException {
		int avg = (m1 + m2) / 2;
//		int a[]=new int[1];
//		System.out.println(a[7]);
//		m2=(Integer) null;
		System.out.println("Average is: " + avg);
		if (m1 > m2) {
			return m1;
		} else {
			return m2;
		}

	}

}
