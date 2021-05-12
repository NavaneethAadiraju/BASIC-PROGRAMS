package com.logics;

public class EvenFinder {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if (number % 2 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
