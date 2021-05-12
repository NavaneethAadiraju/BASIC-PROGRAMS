package com.logics;

public class GreatestNumber {

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);

		if (firstNum > secondNum) {
			System.out.println(firstNum + " Is Greater");
		} else if (firstNum < secondNum) {
			System.out.println(secondNum + " Is Greater");
		} else {
			System.out.println("Both Are Same");
		}

	}

}
