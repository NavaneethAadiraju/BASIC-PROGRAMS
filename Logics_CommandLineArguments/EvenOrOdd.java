package com.logics;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
