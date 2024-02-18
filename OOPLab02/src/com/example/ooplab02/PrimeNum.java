package com.example.ooplab02;

import java.util.Scanner;

public class PrimeNum {
	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i*i <= num; i++) {
			if (i % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number >> ");
		int n = sc.nextInt();
		if (isPrime(n) == true) {
			System.out.println(n + " is prime.");
		} else {
			System.out.println(n + " isn't prime.");
		}

	}

}
