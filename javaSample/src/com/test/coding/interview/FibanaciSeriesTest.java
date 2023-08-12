package com.test.coding.interview;

import java.util.Arrays;
import java.util.Iterator;

public class FibanaciSeriesTest {
	public static void main(String[] args) {
		int number = 10;
		
		  for(int i=1; i<=number; i++){
	            System.out.print(fibonacciRecursion(i) +" ");
	        }
	
}
	
	private static int fibonacci(int number) {
		if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci; //Fibonacci number
	}
	
	 public static int fibonacciRecursion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	      
	        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
	    }


}
