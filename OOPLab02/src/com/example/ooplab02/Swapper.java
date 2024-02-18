package com.example.ooplab02;

public class Swapper {
	public static void main(String[] args) {
		int a = 5, b = 2;
		System.out.println("a = " + a + ", b = " + b);
//		int temp = a;
//		a = b;
//		b = temp;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);
	}
}
