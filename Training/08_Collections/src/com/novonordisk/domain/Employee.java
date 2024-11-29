package com.novonordisk.domain;

public class Employee {
	private int employeedId;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeedId, String name, double salary) {
		super();
		this.employeedId = employeedId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeedId() {
		return employeedId;
	}

	public void setEmployeedId(int employeedId) {
		this.employeedId = employeedId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
