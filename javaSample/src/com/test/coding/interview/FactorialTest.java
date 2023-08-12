package com.test.coding.interview;

public class FactorialTest {
public static void main(String[] args) {
	System.out.println(factorialNumber(8));
	System.out.println(factorialRecursive(8));
}
public static int factorialNumber(int number) {
	int result=1;
	while(number !=0) {
		result=result*number;
		number--;
	}
	return result;
	
}

public static int factorialRecursive(int number) {
	if(number ==0) {
		return 1;
	}
	return number*factorialRecursive(number-1);
	
}

}
