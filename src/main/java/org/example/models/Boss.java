package org.example.models;

import org.example.models.abstracts_models.AbstractEmployee;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Objects;

public class Boss extends Employee{
	
	private int numberOfSubordinates;
	public Boss(String name, String midName, String surName, String position, int phone, int age, int salary, int experience, String nameCompany, int numberOfSubordinates) {
		super(name, midName, surName, position, phone, age, salary, experience, nameCompany);
		this.numberOfSubordinates = numberOfSubordinates;
	}
	
	
	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}
	
	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}
	
	public static void upSalary(@NotNull ArrayList<Employee> employees) {
		for (Employee e:
		     employees) {
			if (e != null) {
				if (!(e instanceof Boss)) {
					e.setSalary((e.getSalary()*2));
				}
			}
		}
		System.out.println("\nОдин из начальников решил увеличить всем зарплату\n");
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Boss boss)) return false;
		if (!super.equals(o)) return false;
		return getNumberOfSubordinates() == boss.getNumberOfSubordinates();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getNumberOfSubordinates());
	}
	
	@Override
	public String toString() {
		return "Boss{" +
				"numberOfSubordinates=" + numberOfSubordinates +
				'}';
	}
}
