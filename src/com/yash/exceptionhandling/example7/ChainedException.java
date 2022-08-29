package com.yash.exceptionhandling.example7;

import java.io.IOException;

public class ChainedException {
	public static void main(String[] args) throws Throwable {
		try {
			throw new ArithmeticException("Top Level Exception in chained exception.").initCause(new IOException("IO caused the exception."));
		} catch (ArithmeticException ae) {
			System.out.println("Caught in : " + ae);
			System.out.println("Actual caused by: " + ae.getCause());
		}
	}
}
