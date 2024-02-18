package com.example.classwork2;

public class Person {
	private String name;
	private int age;
	private String dob; // date of birth
	
	public Person(String name, int age, String dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDateOfBirth() {
		return dob;
	}
}
