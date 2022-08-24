package com.yash.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {

		System.out.println("Enter the , saperated array elements");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String array[] = number.split(",");

		addMoreElements(array);

	}

	public static void addMoreElements(String array[]) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("If you want more numbers to insert, Please insert , saperated " + "elements else type exit");

		String NewArrayEle = sc.next();

		String[] c = null;

		if (!NewArrayEle.equals("exit")) {
			String[] newArray = NewArrayEle.split(",");

			int a1 = array.length;
			int b1 = newArray.length;
			int c1 = a1 + b1;

			c = new String[c1];
			System.arraycopy(array, 0, c, 0, a1);
			System.arraycopy(newArray, 0, c, a1, b1);
			System.out.println("Existing array elements are : " + Arrays.toString(c));
			addMoreElements(c);
		} else {
			System.out.println("Existing array elements are : " + Arrays.toString(array));
			System.exit(0);

		}

	}
}
