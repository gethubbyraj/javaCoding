package com.test.coding.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateValuesPrint {

	public static void main(String[] args) {
		String str = "rajkumar";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			if (map.get(character) > 1) {
				System.out.println("Duplicate charectors " + character + " :" + map.get(character));

			}
		}
	}

}
