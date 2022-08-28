package com.yash.oops.exceptionhandling.example8;

import java.util.regex.Pattern;

public class PasswordConstraint {

	public static void main(String[] args) throws PasswordFormatException {

		String password = "Sushant$32S";

		int capiltalLetterCount = 0;
		int smallLetterCount = 0;
		int digitsCount = 0;
		int specialCharCount = 0;
		int count = 0;

		String regex_caps = "^[A-Z]+$";
		String regex_small = "^([a-z])$";
		String regex_digits = "^([0-9])$";
		String regex_splchars = "^([!@#&()–[{}]:;',?/*~$^+=<>])$";

		char[] pass = password.toCharArray();
		String s = new String();

		for (int i = 0; i < pass.length; i++) {
			count++;
			s = String.valueOf(pass[i]);
			if (s.matches(regex_caps)) {
				capiltalLetterCount++;
			} else if (s.matches(regex_small)) {
				smallLetterCount++;
			} else if (s.matches(regex_digits)) {
				digitsCount++;
			} else if (s.matches(regex_splchars)) {
				specialCharCount++;
			}
		}

		if (capiltalLetterCount < 2 || smallLetterCount < 2 || digitsCount < 2 || specialCharCount < 2 || count < 8
				|| count > 14) {
			throw new PasswordFormatException("Please Enter password in specified format");
		} else {
			System.out.println("Password set successful.");
		}
	}
}
