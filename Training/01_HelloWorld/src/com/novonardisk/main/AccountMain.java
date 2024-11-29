package com.novonardisk.main;

import java.util.Scanner;

import com.novonardisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter AccountNumber");
		accountNumber = scanner.nextInt();
		
		System.out.println("Enter Name");
		name = scanner.next();
		
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		Account account = new Account();
		account.display();
		
	}
}
