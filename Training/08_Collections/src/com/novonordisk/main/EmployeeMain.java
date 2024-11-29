package com.novonordisk.main;

import java.util.HashSet;

import com.novonordisk.domain.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee employee1 = new Employee(101, "Employee 1", 100000);
		Employee employee2 = new Employee(102, "Employee 2", 100000);
		Employee employee3 = new Employee(103, "Employee 3", 100000);

		HashSet<Employee> employeeSet = new HashSet<Employee>();

		System.out.println(employeeSet);

		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);

		System.out.println(employeeSet);
		for (Employee i : employeeSet) {
			System.out.println(i.getEmployeedId() + " " + i.getName() + " " + i.getSalary() + " ");
		}
	}
}
