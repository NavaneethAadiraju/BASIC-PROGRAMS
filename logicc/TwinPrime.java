package com.corejava;

public class TwinPrime {

	public static boolean isPrime(int num)
	{
		int count = 0;
		if(num==0 || num==1)
			return false;
		else
			for (int i = 2; i < num; i++) {
				if(num%i==0)
					count++;	
			}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if(isPrime(i) && isPrime(i+2))
				System.out.println(i + " " + (i+2));
		}
		
		
		

	}

}
