package org.example.models;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Employee> employees;
	private int countEmployee;
	private int countManager;
	private int countBoss;
	private int countEmployees;
	
	public Company(String name, ArrayList<Employee> employees, int countEmployee, int countManager, int countBoss) {
		this.name = name;
		this.employees = employees;
		this.countEmployee = countEmployee;
		this.countManager = countManager;
		this.countBoss = countBoss;
		this.countEmployees = countEmployee + countManager + countBoss;
		employeesGeneration();
		
	}
	
	
	public void employeesGeneration() {
		employeeGeneration();
		managerGeneration();
		bossGeneration();
	}
	
	public void employeeGeneration() {
		for (int i = 0; i < getCountEmployee(); i++) {
			this.employees.add(new Employee("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 30000 + i, 7 + i, this.getName()));
		}
	}
	
	public void employeeGeneration(int countEmployee) {
		for (int i = 0; i < countEmployee; i++) {
			this.employees.add(new Employee("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 30000 + i, 7 + i, this.getName()));
		}
	}
	
	public void managerGeneration() {
		for (int i = 0; i < getCountManager(); i++) {
			this.employees.add(new Manager("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 40000 + i, 7 + i, this.getName(), 400000 * i));
		}
	}
	
	public void managerGeneration(int countManager) {
		for (int i = 0; i < countManager; i++) {
			this.employees.add(new Manager("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 40000 + i, 7 + i, this.getName(), 400000 * i));
		}
	}
	
	public void bossGeneration() {
		for (int i = 0; i < getCountBoss(); i++) {
			this.employees.add(new Boss("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 60000 + i, 7 + i, this.getName(), 3 * i));
		}
	}
	
	public void bossGeneration(int countBoss) {
		for (int i = 0; i < countBoss; i++) {
			this.employees.add(new Boss("Ivan", "Ivanovitch", "Chekov", "lawyer", 5555 + i, 23 + i, 60000 + i, 7 + i, this.getName(), 3 * i));
		}
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public int getCountEmployee() {
		return countEmployee;
	}
	
	public void setCountEmployee(int countEmployee) {
		this.countEmployee = countEmployee;
	}
	
	public int getCountManager() {
		return countManager;
	}
	
	public void setCountManager(int countManager) {
		this.countManager = countManager;
	}
	
	public int getCountBoss() {
		return countBoss;
	}
	
	public void setCountBoss(int countBoss) {
		this.countBoss = countBoss;
	}
	
	public int getCountEmployees() {
		return countEmployees;
	}
	
	public void setCountEmployees(int countEmployees) {
		this.countEmployees = countEmployees;
	}
	
	public void showEmployeeSalary() {
		for (Employee e :
				this.getEmployees()) {
			if (e != null) {
				if (e instanceof Boss) {
					System.out.printf("Начальник %s , полчаемая зарплата %d \n", e.getName(), e.getSalary());
				} else if (e instanceof Manager) {
					System.out.printf("Менеджер %s , полчаемая зарплата %d\n", e.getName(), e.getSalary());
				} else {
					System.out.printf("Рабочий %s , полчаемая зарплата %d \n", e.getName(), e.getSalary());
				}
			}
		}
	}
}
