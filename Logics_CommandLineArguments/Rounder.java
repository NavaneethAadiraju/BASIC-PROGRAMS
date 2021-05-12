package com.logics;

public class Rounder {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if (number != 0) {
			if (number > 0) {
				if (number % 2 != 0) {
					System.out.println("Odd Number");
				} else {
					while (true) {
						if (number % 10 == 0) {
							break;
						}
						number++;
					}
					System.out.println("Next Multiple of 10 is : " + number);
				}
			} else {
				System.out.println("Error");
			}
		} else {
			System.out.println("Zero");
		}

	}

}
