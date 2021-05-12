package com.logics;

public class NextMultipleOfHundred {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		while (true) {
			if (number % 100 == 0) {
				break;
			}
			number++;
		}
		System.out.println("Next Multiple of 100 is : " + number);

	}

}
