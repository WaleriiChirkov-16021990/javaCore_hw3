package org.example;

import org.example.models.Boss;
import org.example.models.Company;
import org.example.models.Employee;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
		Company company1 = new Company("Prima", new ArrayList<Employee>(),4,9,2);
		company1.showEmployeeSalary();
		Boss.upSalary(company1.getEmployees());
		company1.showEmployeeSalary();
	}
}