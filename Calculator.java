package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter the Second Number : ");
		int num2 = scan.nextInt();
		
		System.out.print("Choose an Option\n 1.Addition\n 2.Subraction\n 3.Multiplication\n 4.Division\n");
		System.out.print("Enter the Option : ");
		int Option = scan.nextInt();
		
		switch(Option) {
			case 1 : System.out.println("Sum of the Numbers is : "+(num1 + num2));
			break;
			
			case 2 : System.out.println("Subraction of the Numbers is : "+(num1 - num2));
			break;
			
			case 3 : System.out.println("Product of the Numbers is : "+(num1 * num2));
			break;
			
			case 4 : System.out.println("Division of the Numbers is : "+(num1 / num2));
			break;
			
			default : System.out.println("Invalid Option");
			break;
		}
	}
}
