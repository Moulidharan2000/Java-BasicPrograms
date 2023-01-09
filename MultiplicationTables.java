package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" X "+i+" = "+ num*i);
		}
	}
}
