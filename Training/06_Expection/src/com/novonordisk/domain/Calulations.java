package com.novonordisk.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calulations {
	private int number1;
	private int number2;
	private int result;

	public void accept() {
		try {
			System.out.println("accept() start()");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number1");
			number1 = scanner.nextInt();
			System.out.println("Enter number2");
			number2 = scanner.nextInt();
			System.out.println("accept() end()");
		}
		catch (InputMismatchException i) {
			System.out.println("Invalid Input From User");
			System.out.println("please enter valid number");
		}
	}

	public void calculateResult() {
		System.out.println("calculateResult() start()");
		result = number1 + number2;
		System.out.println("calculateResult() end()");
	}

	public void dispaly() {
		System.out.println("dispaly() start()");
		System.out.println("Result = " + result);
		System.out.println("dispaly() end()");
	}
}
