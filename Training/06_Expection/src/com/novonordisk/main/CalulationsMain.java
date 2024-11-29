package com.novonordisk.main;

import com.novonordisk.domain.Calulations;

public class CalulationsMain {
	public static void main(String[] args) {
		System.out.println("main start");

		Calulations calulations = new Calulations();

		calulations.accept();
		calulations.calculateResult();
		calulations.dispaly();
		System.out.println("main end");

	}
}
