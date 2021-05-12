package com.arrays;

public class Student {

		public int studentId;
		public String studentName;
		private double marks;
		private char grade;
		
		public Student() 
		{
			studentId = 0;
			studentName = null;
			marks = 0;
			grade = ' ';
		}
		public Student(int studentId, String studentName, double marks) 
		{
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.marks = marks;
			calculateGrade();
		}
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		public char getGrade() {
			return grade;
		}

		public String displayDetails()
		{
			return "Student [name="+ studentName + " ,studentId=" + studentId + " , marks=" + marks + ", grade= "+ grade+"]";
		}
		private void calculateGrade()
		{
			if(marks > 90)
			{
				grade = 'A';
			}
			else if(marks > 80 && marks <= 90)
			{
				grade = 'B';
			}
			else if(marks > 70 && marks <= 80)
			{
				grade = 'C';
			}
			else if(marks > 60 && marks <= 70)
			{
				grade = 'D';
			}
			else
			{
				grade = 'E';
			}
		}
	}

