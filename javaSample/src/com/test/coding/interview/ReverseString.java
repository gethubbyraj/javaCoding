package com.test.coding.interview;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("rajkumar"));
		System.out.println(reverStringRecurssion("rajkumar"));
	}

	public static String reverseString(String str) {
		String revers = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			revers = revers + str.charAt(i);
		}
		return revers;

	}
	
	
	public static String reverStringRecurssion(String str) {
		if(str.isEmpty() || str==null) {
			return str;
		}
		return str.charAt(str.length()-1)+reverStringRecurssion(str.substring(0,str.length()-1));
		
	}
}
