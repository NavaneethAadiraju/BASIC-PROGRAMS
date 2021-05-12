package com.oops;
abstract class Student1 {
	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;
	
	Student1(){
		studentName = null;
		studentClass = null;
	}
	
	public Student1(String studentName, String studentClass) {
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	abstract int getPercentage();

	int getTotalNoOfStudents() {
		return totalNoOfStudents;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
}

class PhysicsStudent extends Student1{
	int physiceMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	
	public PhysicsStudent(String name, String classname, int physiceMarks, int chemistryMarks, int mathsMarks) {
		super(name, classname);
		this.physiceMarks = physiceMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}



	int getPercentage() {
		int sum = physiceMarks + chemistryMarks + mathsMarks;
		return sum / 3;
	}



	@Override
	public String toString() {
		return "PhysicsStudent [physiceMarks=" + physiceMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
	
	
}

class ChemistryStudent extends Student1{
	int historyMarks;
	int civicsMarks;

	
	public ChemistryStudent(String name, String classname, int historyMarks, int civicsMarks) {
		super(name,classname);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}


	int getPercentage() {
		int sum = historyMarks + civicsMarks;
		return sum / 2;
	}


	@Override
	public String toString() {
		return "ChemistryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", studentName="
				+ studentName + ", studentClass=" + studentClass + "]";
	}
	
	
	
}
public class College_Student {
	
	public static void main(String[] args) {
		ChemistryStudent s= new ChemistryStudent("Ramu", "HEC", 40, 50);
		s.totalNoOfStudents = 30;
		System.out.println("Total students are: " + s.getTotalNoOfStudents());
		System.out.println(s.toString());
		System.out.println("Student percentage = " + s.getPercentage());
		PhysicsStudent s2 = new PhysicsStudent("Krishna", "MPC", 50, 60, 70);
		s2.totalNoOfStudents = 70;
		System.out.println("Total students are: " + s2.getTotalNoOfStudents());
		System.out.println(s2.toString());
		System.out.println("Student percentage = " + s2.getPercentage());
		
	}

}
