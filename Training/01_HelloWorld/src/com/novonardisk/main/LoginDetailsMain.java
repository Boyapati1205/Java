package com.novonardisk.main;

import java.util.Scanner;

import com.novonardisk.domain.LoginDetails;

public class LoginDetailsMain {
	public static void main(String[] args) {
		//1. Declare Variables
		String username,Password;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter username");
		username = scanner.next();
		System.out.println("Enter password");
		Password = scanner.next();
		
		LoginDetails logindetails = new LoginDetails();
		boolean result = logindetails.validate(username, Password);
		System.out.println(result);
		if (result == true)
			System.out.println("Login Successfull");
		else 
			System.out.println("Login Failed");
	}

}
