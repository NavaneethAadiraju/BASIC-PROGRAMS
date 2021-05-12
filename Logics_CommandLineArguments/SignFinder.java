package com.logics;

public class SignFinder {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num > 0) {
			System.out.println("Positive value");
		}
		if (num < 0) {
			System.out.println("Negetive value");
		}
		if (num == 0) {
			System.out.println("Zero");
		}
	}

}
