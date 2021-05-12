package com.logics;

public class SameLastDigit {

	private static boolean sameLastDigit(int num1, int num2) {
		if (num1 % 10 == num2 % 10) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(sameLastDigit(27, 57));
		System.out.println(sameLastDigit(25, 57));
	}
}
