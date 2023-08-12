package com.test.coding.interview;

public class PrimeNumberTest {

	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(21));
	}
	
	public static boolean isPrimeNumber(int number) {
		boolean flag = true;
		if (number == 2 || number == 3) {
			return flag = true;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;

	}
}
