package com.novonardisk.domain;

public class LoginDetails {
	public boolean validate(String username, String Password){
		if(username.equals("admin") && Password.equals("admin@123"))
			return true;
		else
			return false;
	}
}
