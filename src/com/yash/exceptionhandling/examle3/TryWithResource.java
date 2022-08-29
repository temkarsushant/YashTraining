package com.yash.exceptionhandling.examle3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\sushant.temkar\\git\\YashTraining\\Reaources\\Test";
		readFromFile(path);
	}

	static String readFromFile(String path) throws IOException {
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
			return br.readLine();
		}
	}
}
