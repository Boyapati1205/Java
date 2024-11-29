package com.novonordisk.main;

import java.util.Scanner;

import com.novonordisk.domain.EmployeeCRUD;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeCRUD employeeCRUD = new EmployeeCRUD();

		int employeedId;
		String name;
		double salary;
		Scanner scanner = new Scanner(System.in);

		employeeCRUD.getAllEmployees();
		System.out.println("------------");

		System.out.println("Enter employeeId");
		employeedId = scanner.nextInt();

		// Update
//		System.out.println("Enter new employeeId");
//		employeedId = scanner.nextInt();
//		System.out.println("Enter new name");
//		name = scanner.next();
//		System.out.println("Enter new salary");
//		salary = scanner.nextDouble();

		employeeCRUD.deleteEmployee(employeedId);
		System.out.println("------------");
		employeeCRUD.getAllEmployees();

//		System.out.println("Enter employeeId");
//		employeedId = scanner.nextInt();
//		System.out.println("Enter name");
//		name = scanner.next();
//		System.out.println("Enter salary");
//		salary = scanner.nextDouble();
//
//		employeeCRUD.createEmployee(employeedId, name, salary);
//		System.out.println("------------");
//		employeeCRUD.getAllEmployees();

//		Select one employee
//		System.out.println("Enter EmployeeId");
//		employeedId = scanner.nextInt();
//		employeeCRUD.getEmployeeByEmployeedId(employeedId);

	}
}
