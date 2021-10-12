package com.logical.program;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {

		//variables
		int num1=0;
		int num2=1;
		int num3;

		//taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms: ");
		int noofterms = sc.nextInt();    

		System.out.print("Fibonacci Series till the " + noofterms + "th term : ");
		//printing 1st and 2nd value of F.S.
		System.out.print(num1+" "+num2);

		//executing for loop
		for(int i=2; i<noofterms; i++)
		{    
			num3 = num1 + num2;
			System.out.print(" "+num3);    
			num1 = num2;
			num2 = num3;
		}

		sc.close();
	}
}
