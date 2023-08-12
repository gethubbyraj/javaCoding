package com.test.coding.interview;

public class PolindromeTest {
	public static void main(String[] args) {
		// reverse the string
		// compare

		String str = "rar";
		System.out.println(reverse(str));
		System.out.println();
		if(str.equals(reverse(str))) {
			System.out.println("**** Polindrome ****");
		}else {
			System.out.println("**** Not Polindrome ****");

		}
		if(121==numberpolindrome(121)) {
			System.out.println("******** Number Polindrome *********");
		}else {
			System.out.println("******** Number Not Polindrome *********");

		}
		
	}

	public static String reverse(String input) {
		if (input == null | input.isEmpty()) {
			return input;
		}
		char charAt = input.charAt(input.length() - 1);
		return charAt + reverse(input.substring(0, input.length()-1));
	}
	
	public static int numberpolindrome(int number) {
		int result=0;
		int mod=0;
		while (number!=0) {
			mod=number%10;
			result=result*10+mod;
		number=number/10;
		}
		return number;
		
	}

}
