package com.novonordisk.main;

import java.util.*;
import com.novonordisk.domain.*;

public class DocumentDownloadMain {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String option;
			do {
				System.out.println("Choose Your Formate");
				System.out.println("1.Download PDF");
				System.out.println("2.Download CSV");
				System.out.println("3.Download XLS");
				System.out.println("Enter your Choise");
				int choice = scan.nextInt();
				PDF pdf = new PDF();
				XLS xls = new XLS();
				CSV csv = new CSV();

				switch (choice) {
				case 1:
					pdf.downloadDocument();
					break;
				case 2:
					csv.downloadDocument();
					break;
				case 3:
					xls.downloadDocument();
					break;
				default:
					System.out.println("Incorrect choice");
					break;
				}
				System.out.println("Do you want to continue y || n");
				option = scan.next();
			} while (option.equals("y"));
		}
		System.out.println("Thank you");
	}

}
