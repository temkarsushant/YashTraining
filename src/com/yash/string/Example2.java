package com.yash.string;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = in.nextLine();
		str = str.toLowerCase();
		int len = str.length();

		String sortedStr = ""; // Empty String
		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i < len; i++) {
				char strCh = str.charAt(i);
				if (ch == strCh) {
					sortedStr += strCh;
				}
			}
		}

		System.out.println("Ascending order:");
		System.out.println(sortedStr);

		char rev[] = sortedStr.toCharArray();
		StringBuffer descOrder = new StringBuffer();

		for (int i = rev.length - 1; i >= 0; i--) {
			descOrder.append(rev[i]);
		}
		System.out.println("Descending order:");
		System.out.println(descOrder.toString());

	}
}
