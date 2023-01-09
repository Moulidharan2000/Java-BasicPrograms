package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		int fact = 1;
		
		for(int i=num; i>1; i-- ) {
			fact = fact*i;
		}
		System.out.println("Factorial of a Given Number is : "+fact);
	}
}
