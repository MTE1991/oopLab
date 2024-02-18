package com.example.ooplab02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you class roll >> ");
		int roll = sc.nextInt();
		
		System.out.print("Enter your name >> ");
		String name = sc.next();
		
		System.out.print("Enter your CGPA >> ");
		double cgpa = sc.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("CGPA: " + cgpa);
		
	}
}
