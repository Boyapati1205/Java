package com.novonordisk.main;

import java.util.Scanner;

public class WhileLoopMain {
	public static void main(String[] args) {
		
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i = i + 1;
//		}
//		System.out.println("Outside Loop");
		
		// Accept number from user
		//print multiplication table
		
		
		int number;
		int i = 1;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		number = scanner.nextInt();

		while (i <= 10) {
			result = number * i;
			i = i + 1;
			//System.out.println(i);
			System.out.println(number + "*" + i + result);
		}
		
	}
}
