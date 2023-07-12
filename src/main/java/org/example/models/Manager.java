package org.example.models;

import java.util.Objects;

public class Manager extends Employee {
	private int salesPlan;
	
	public Manager(String name, String midName, String surName, String position, int phone, int age, int salary, int experience, String nameCompany, int salesPlan) {
		super(name, midName, surName, position, phone, age, salary, experience, nameCompany);
		this.salesPlan = salesPlan;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Manager manager)) return false;
		if (!super.equals(o)) return false;
		return salesPlan == manager.salesPlan;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), salesPlan);
	}
	
	public int getSalesPlan() {
		return salesPlan;
	}
	
	@Override
	public String toString() {
		return "Manager{" +
				"salesPlan=" + salesPlan +
				'}';
	}
	
	public void setSalesPlan(int salesPlan) {
		this.salesPlan = salesPlan;
	}
}
