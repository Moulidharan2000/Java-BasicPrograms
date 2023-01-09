package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		int count = 0;
		
		do {
			num = num/10;
			count++;
		}while(num != 0);
		System.out.println("Count is : "+count);
	}

}
