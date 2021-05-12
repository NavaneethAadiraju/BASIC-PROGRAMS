package com.corejava;

public class Checker {

	public static void main(String[] args) {
		//Student s = new Student(123,"John Smit",100.0);
		Student s = new DayScholar(123,"John Smit",100.0,500);
		System.out.println(s.displayDetails());
		System.out.println("Total amount you have to pay "+s.payFee(5000));
		
		Hosteller s1 = new Hosteller(123,"John Smit",100.0,5000);
		System.out.println(s1.displayDetails());
		System.out.println("Total amount you have to pay "+s1.payFee(10000));
		
	}

}
