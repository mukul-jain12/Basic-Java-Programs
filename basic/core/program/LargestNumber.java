package com.basic.core.program;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a: ");
        int a = sc.nextInt();
		System.out.println("Enter value of a: ");
        int b = sc.nextInt();
		System.out.println("Enter value of a: ");
        int c = sc.nextInt();
        
        //using ternary operator
        int res = a>b?a:b;

        int largest = c>res?c:res; 

        System.out.println("Largest among three num is " + largest);
        
        sc.close();
    }
}
