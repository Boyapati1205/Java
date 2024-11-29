package com.novonordisk.main;

import com.novonordisk.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		System.out.println(myClass.getData());

		int[] numbers = new int[3];
		numbers[0] = 12;
		numbers[1] = 23;
		numbers[2] = 34;

		myClass.setData(numbers);
		// System.out.println(myClass.getData());
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("Values from class"); // 11,23,34
		for (int i : myClass.getData()) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("Changein array of main");
		numbers[1] = 100;
		System.out.println("----------------");
		System.out.println("Values from class"); // 11,23,34
		for (int i : myClass.getData()) {
			System.out.println(i);
		}
		System.out.println("Values from main"); // 11,100,34
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
