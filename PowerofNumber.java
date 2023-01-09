package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class PowerofNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		System.out.print("Enter the Power : ");
		int power = scan.nextInt();
		
		int result = 1;
		
		for(int i=0; i<=power; i++) {
			result = result*num;
		}
		System.out.print("Result is : "+result);
	}

}
