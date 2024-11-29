package com.novonordisk.main;

import com.novonordisk.domain.Account;

public class AccountMain {
	public static void main(String[] args) {

		// Account account = new Account ();

		Account account = new Account(101, "Ajay", 1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		System.out.println("___________________");
		Account account2 = new Account();

		account2.setAccountNumber(102);
		account2.setName("Kumar");
		account2.setBalance(100000);

		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		System.out.println("___________________");

		Account account3 = new Account(103, "Aj", 10001);
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getName());
		System.out.println(account3.getBalance());

	}
}
