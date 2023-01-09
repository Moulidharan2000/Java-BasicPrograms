package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Percentage : ");
		int percent = scan.nextInt();

		if (percent >= 70 && percent <= 100)
			System.out.println("Passed in First Class with Distinction");
		else if (percent >= 60 )
			System.out.println("Passed in First Class");
		else if (percent >= 50)
			System.out.println(" Passed in Second Class");
		else if (percent < 50 && percent >= 35)
			System.out.println("Just Pass");
		else 
			System.out.println("Fail");
	 }

}
