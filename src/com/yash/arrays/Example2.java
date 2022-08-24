package com.yash.arrays;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 2, 6, 8, 9, 4, 8 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : num) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
	}

}
