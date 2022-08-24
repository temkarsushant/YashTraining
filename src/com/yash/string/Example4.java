package com.yash.string;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
	public static void main(String[] args) {
		String str = "sushant";
		char array[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (char c : array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
