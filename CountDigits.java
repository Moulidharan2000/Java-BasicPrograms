package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			count ++;
		}
		System.out.println("Number of Digits : "+count);
	}
}
