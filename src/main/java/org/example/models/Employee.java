package org.example.models;

import org.example.models.abstracts_models.AbstractEmployee;

public class Employee extends AbstractEmployee {
	
	private String nameCompany;
	
	
	public Employee(String name, String midName, String surName, String position, int phone, int age, int salary, int experience, String nameCompany) {
		super(name, midName, surName, position, phone, age, salary, experience);
		this.nameCompany = nameCompany;
	}
	
	public String getNameCompany() {
		return nameCompany;
	}
	
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
}
