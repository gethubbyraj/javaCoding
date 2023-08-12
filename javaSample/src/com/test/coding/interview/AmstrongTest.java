package com.test.coding.interview;

public class AmstrongTest {
public static void main(String[] args) {
	if(armstrong(372)) {
		System.out.println("***** Amstrong ******");
	}else {
		System.out.println("***** Not Amstrong ******");

	}
}
public static boolean armstrong(int number) {
	// count the mode of number
	//divide to the number
	int result=0;
	int original=number;
	while (number!=0) {
		int mod=number%10;
		result=result+(mod*mod*mod);
		number=number/10;
	}
	 if(original==result) {
		return true;
	 }else {
		 return false;
	 }
}
}
