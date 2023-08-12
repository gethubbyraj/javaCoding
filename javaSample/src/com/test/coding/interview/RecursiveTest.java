package com.test.coding.interview;

public class RecursiveTest {
	static int sum = 0;

	public static void main(String[] args) {
		int number = 123456;
		sum(number);
		System.out.println("Sum of number :"+sum);
	}

	private static int sum(int number) {
		sum = sum + (number % 10);
		number = number / 10;
		if(number<10) {
			return sum;
		}
		sum(number);
		return number;
	}
}
