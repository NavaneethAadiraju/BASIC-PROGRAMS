package com.inheritence;

public class Student {
	int studentId;
	String name;
	double examFee;

	public String displayDetails() {
		return null;

	}

	Student() {

	}

	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}

}

class DayScholor extends Student {
	double transportFee;

	DayScholor() {

	}

	public DayScholor(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	public String displayDetails() {
		return "DayScholor [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amount) {
		if (amount < examFee + transportFee)
			return (examFee + transportFee) - amount;
		else
			return amount - (examFee + transportFee);
	}

}

class Hosteller extends Student {
	double hostelFee;

	Hosteller() {

	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amount) {
		if (amount < examFee + hostelFee)
			return (examFee + hostelFee) - amount;
		else
			return amount - (examFee + hostelFee);
	}

}
