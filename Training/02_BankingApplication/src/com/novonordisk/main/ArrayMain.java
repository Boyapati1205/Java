package com.novonordisk.main;

public class ArrayMain {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 10;
		numbers[2] = 101;
		numbers[3] = 1001;
		numbers[4] = 10001;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("_______________");
		System.out.println();
		//For each - use with Array only
		for(int i : numbers) {
			System.out.println(i);
		}
	}
}
