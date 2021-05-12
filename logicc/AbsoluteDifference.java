package com.corejava;

public class AbsoluteDifference {

	
	public static int diff21(int num) {
		  if(num <= 21)
		    return 21-num;
		  else
		    return (num - 21)*2;
		}
	public static void main(String[] args) {
		int num = 10;
		System.out.println(diff21(num));
	}

}
