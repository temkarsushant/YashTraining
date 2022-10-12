package com.yash.exceptionhandling.example10;

public class MaxCalculater {

	public int maxCalculator(int m1, int m2) throws NullPointerException,ArrayIndexOutOfBoundsException{

		
		if (m1 > m2) {
			return m1;
		} else {
			return m2;
		}

	}
}
