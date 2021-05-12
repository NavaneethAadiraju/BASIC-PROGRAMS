package com.sstudentt.model;

public class Student {
	private int id;
	private String name;
	private String marks;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public Student(String name, String marks, String address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public Student(int id, String name, String marks, String address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
