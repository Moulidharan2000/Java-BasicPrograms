package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=2; i<=num; i++) {
			boolean isPrime = true;
			
			for(int j=2; j<=i/2; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				System.out.println(i);
			}
		}
	}
}
