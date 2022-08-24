package com.yash.string;

public class Example2 {
	public static void main(String[] args) {

		int a = 65;
		int b = 90;

		String s1 = "Sushant";
		char[] temp = s1.toCharArray();

		int tempInt1 = 0;
		int tempInt2 = 0;

		String s2 = new String();
		String temp3 = new String();

		for (int i = 0; i < s1.length() - 1; i++) {

			tempInt1 = temp[i];
			for (int j = i + 1; j < s1.length() - 1; j++) {
				tempInt2 = temp[j];

				if (tempInt1 > tempInt2) {
					temp3 = Character.toString(tempInt2);
					// s2=s2+Character.toString(tempInt2);
				} else {
					temp3 = Character.toString(tempInt1);
					// s2=s2+Character.toString(tempInt1);
				}
			}
			s2 = s2 + temp3;
			temp3 = null;
		}
		System.out.println(s2);
	}
}
