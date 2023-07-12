package org.example.models.abstracts_models;

import org.example.models.Company;

import java.util.Objects;

public abstract class AbstractEmployee {
	
	
	private static int id = 0;
	private String name;
	private String midName;
	private String surName;
	private String position;
	private int phone;
	private int age;
	private int salary;
	private int experience;
	
	
	public AbstractEmployee(String name, String midName, String surName, String position, int phone, int age, int salary, int experience) {
		this.name = name;
		this.midName = midName;
		this.surName = surName;
		this.position = position;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
		this.experience = experience;
		AbstractEmployee.id +=1;
	}
	
	
	@Override
	public String toString() {
		return "AbstractEmployee{" +
				"name='" + name + '\'' +
				", midName='" + midName + '\'' +
				", surName='" + surName + '\'' +
				", position='" + position + '\'' +
				", phone=" + phone +
				", age=" + age +
				", salary=" + salary +
				", experience=" + experience +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof AbstractEmployee that)) return false;
		return getPhone() == that.getPhone() && getAge() == that.getAge() && getSalary() == that.getSalary() && getExperience() == that.getExperience() && Objects.equals(getName(), that.getName()) && Objects.equals(getMidName(), that.getMidName()) && Objects.equals(getSurName(), that.getSurName()) && Objects.equals(getPosition(), that.getPosition());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getMidName(), getSurName(), getPosition(), getPhone(), getAge(), getSalary(), getExperience());
	}
	
	
	public static int getId() {
		return id;
	}
	
//	public static void setId(int id) {
//		AbstractEmployee.id = id;
//	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMidName() {
		return midName;
	}
	
	public void setMidName(String midName) {
		this.midName = midName;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
