package com.yash.arrays;

public class Example1 {
	public static void main(String[] args) {

		int[] intarray = { 90, 60, 50, 70, 40, 10, 100 };
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0; i < intarray.length; i++) {
			for (j = 0; j < intarray.length; j++) {
				if (intarray[i] > intarray[j]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}

		}
		for (int r = 0; r < intarray.length; r++) {
			if (r == 2)
				System.out.println(intarray[r]);
		}

	}

}
