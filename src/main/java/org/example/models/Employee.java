package org.example.models;

import org.example.models.abstracts_models.AbstractEmployee;

import java.util.Objects;

public class Employee extends AbstractEmployee {
	
	private String nameCompany;
	
	
	public Employee(String name, String midName, String surName, String position, int phone, int age, int salary, int experience, String nameCompany) {
		super(name, midName, surName, position, phone, age, salary, experience);
		this.nameCompany = nameCompany;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee employee)) return false;
		if (!super.equals(o)) return false;
		return Objects.equals(getNameCompany(), employee.getNameCompany());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getNameCompany());
	}
	
	public String getNameCompany() {
		return nameCompany;
	}
	
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"nameCompany='" + nameCompany + '\'' +
				'}';
	}
}
