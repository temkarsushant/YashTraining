package com.yash.arrays;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {

		System.out.println("enter the any number:");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();

		System.out.println("Enter the number");
		int y1 = sc.nextInt();

		int x, y, hcf = 0, lcm = 1;
		x = x1;
		y = y1;

		for (int i = 1; i <= x && i <= y; i++) {

			if (x % i == 0 && y % i == 0) {
				hcf = i;
			}
		}
		lcm = (x1 * y1) / hcf;
		{
			System.out.println(x1 + "  and " + y1 + " HCM is: " + hcf);
		}
		{
			System.out.println(x1 + " and " + y1 + " LCM is: " + lcm);
		}
	}
}
