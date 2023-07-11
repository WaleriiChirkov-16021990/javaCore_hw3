package org.example.models;

public class Company {
	private String name;
	private Employee[] employees;
	private int countEmployee;
	private int countManager;
	private int countBoss;
	private int countEmployees;
	
	public Company(String name, Employee[] employees, int countEmployee, int countManager, int countBoss) {
		this.name = name;
		this.employees = employees;
		this.countEmployee = countEmployee;
		this.countManager = countManager;
		this.countBoss = countBoss;
		this.countEmployees = countEmployee + countManager + countBoss;
	}
}
