package com.logics;

public class ThreeDPalindrome {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int firstDigit = number / 100;
		int thirdDigit = number % 10;
		System.out.println(firstDigit == thirdDigit);
		// System.out.println(firstDigit + " " + thirdDigit);
	}

}
