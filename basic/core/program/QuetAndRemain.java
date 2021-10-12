package com.basic.core.program;

import java.util.Scanner;

public class QuetAndRemain {
	public static void main(String args[]) {   

		Scanner sc = new Scanner(System.in);
		
		//enter dividend and divisor in console
		System.out.println("Enter the Dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter the Divisor : ");
		int divisor = sc.nextInt();

		//calculate quotient and remainder
		double quotient = (double) dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient + " || Remainder = " + remainder);

		sc.close();
	}
}
