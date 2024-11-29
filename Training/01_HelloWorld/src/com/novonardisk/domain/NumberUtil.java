package com.novonardisk.domain;

public class NumberUtil {
	public int getLargest(int n1, int n2, int n3) {

		// int result = number * number;
		if (n1 >= n2 && n1 >= n3) 
			return n1;

		if (n2 >= n1 && n2 >= n3) 
			return n2;
		else
			return n3;
	}
}
