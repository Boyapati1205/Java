package com.novonardisk.main;

import java.util.Scanner;

import com.novonardisk.domain.Addition;

public class AdditionMain {
	public static void main(String[] args) {
		int n1,n2;
		System.out.println("AdditionMain start");
	
	
		//Initialization
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number 1");
		n1 = scanner.nextInt();
		System.out.println("Enter a number 2");
		n2 = scanner.nextInt();
		
		
		//Create object of Addition class and Accept function
		Addition addObject = new Addition();
		addObject.accept(n1, n2);
		System.out.println("AdditionMain end");
		
		
	}
}
