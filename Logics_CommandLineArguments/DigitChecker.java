package com.logics;

public class DigitChecker {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int firstDigit = number / 10;
		int secondDigit = number % 10;

		System.out.println((firstDigit == secondDigit) + " result is : " + "0");

		System.out.println((firstDigit != secondDigit) + " result is : " + Math.abs(firstDigit - secondDigit));
	}

}
