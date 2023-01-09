package com.BridgeLabz.JavaBasics;

import java.util.Scanner;

public class NumberswithTypes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an Byte Value : ");
		byte num1 = scan.nextByte();

		System.out.print("Enter an Interger Value : ");
		int num2 = scan.nextInt();
		
		System.out.print("Enter an Float Value : ");
		float num3 = scan.nextFloat();
		
		System.out.print("Enter an Double Value : ");
		double num4 = scan.nextDouble();
		
		System.out.print("Enter an Long Value : ");
		long num5 = scan.nextLong();
		
		System.out.print("Enter a String Value : ");
		String str1 = scan.next();
		
		System.out.print("Enter a Character Value : ");
		char str2 = scan.next().charAt(0);
		
		System.out.print("Enter an Boolean Value : ");
		Boolean value = scan.nextBoolean();
		
		scan.close();
		
		System.out.println("\n"+num1+" is in "+((Object)num1).getClass().getSimpleName()+" Type\n");
		
		System.out.println(num2+" is in "+((Object)num2).getClass().getSimpleName()+" Type\n");

		System.out.println(num3+" is in "+((Object)num3).getClass().getSimpleName()+" Type\n");

		System.out.println(num4+" is in "+((Object)num4).getClass().getSimpleName()+" Type\n");

		System.out.println(num5+" is in "+((Object)num5).getClass().getSimpleName()+" Type\n");

		System.out.println(str1+" is in "+((Object)str1).getClass().getSimpleName()+" Type\n");

		System.out.println(str2+" is in "+((Object)str2).getClass().getSimpleName()+" Type\n");

		System.out.println(value+" is in "+((Object)value).getClass().getSimpleName()+" Type\n");
  }

}
