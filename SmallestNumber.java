package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
        
		System.out.print("Enter The Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter The Number : ");
        int num2 = scan.nextInt();
        System.out.print("Enter The Number : ");
        int num3 = scan.nextInt();

        if(num1<num2 && num1<num3) 
            System.out.println(num1+" is the Smallest");
        else if (num2<num3)
            System.out.println(num2+" is the Smallest");
        else
            System.out.println(num3+" is the Smallest");

    }

}
