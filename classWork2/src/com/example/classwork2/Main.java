package com.example.classwork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Ekleel", 22, "20.04.2002");
		Person p2 = new Person("Rahim", 20, "06.05.2004");
		
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge() + "yrs old");
		System.out.println("Date of birth: " + p1.getDateOfBirth() + "\n");
		
		System.out.println("Name: " + p2.getName());
		System.out.println("Age: " + p2.getAge() + "yrs old");
		System.out.println("Date of birth: " + p2.getDateOfBirth() + "\n");
	}

}
