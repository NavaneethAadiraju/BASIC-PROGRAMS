package com.logics;

public class RoundedSum {

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int ThirdNum = Integer.parseInt(args[2]);
		while (true) {
			if (firstNum % 10 == 0) {
				break;
			}
			firstNum++;
		}
		while (true) {
			if (secondNum % 10 == 0) {
				break;
			}
			firstNum++;
		}
		while (true) {
			if (ThirdNum % 10 == 0) {
				break;
			}
			firstNum++;
		}
		int sum = firstNum + secondNum + ThirdNum;
		System.out.println("SUM : " + sum);

	}

}
