package com.logics;

public class Sum {

	public static void main(String[] args) {
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		secondNum += Integer.parseInt(args[2]) + firstNum;
		secondNum += Integer.parseInt(args[3]);
		System.out.println(secondNum);

	}

}
