package com.yash.arrays;

public class Example4 {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 3, 4, 6, 5, 7 };

		int a, b, c;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = i + 2; k < n; k++) {
					a = arr[i];
					b = arr[j];
					c = arr[k];
					if (a * a + b * b == c * c)
						System.out.println(a + "  " + b + "  " + c);
				}
			}
		}

	}
}
