package com.logics;

public class SumOfDigits {

	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);
		int firstDigit = number / 10;
		int secondDigit = number % 10;
		System.out.println("Sum of Digits = " + (firstDigit + secondDigit));
	}

}
