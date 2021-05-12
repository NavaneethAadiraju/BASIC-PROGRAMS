package com.ojas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employe implements Serializable {
	int eno;
	String ename;
	double salary;

	public Employe(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

}

public class Empp {

	public static void main(String[] args) {
		List<Employe> li = new ArrayList<Employe>();
		li.add(new Employe(107, "Nava", 55000.00));
		li.add(new Employe(106, "hari", 65000.00));
		li.add(new Employe(103, "Ravi", 95000.00));
		li.add(new Employe(104, "Suma", 35000.00));
		li.add(new Employe(105, "Lala", 20000.00));
		li.add(new Employe(101, "Ram", 15000.00));
		// li.stream().forEach(System.out::println);
		// li.stream().sorted(Comparator.comparing(Employe::getSalary)).forEach(System.out::println);
		// li.stream().filter(x->x.getSalary()>20000).forEach(System.out::println);
		 li.stream().sorted(Comparator.comparing(Employe::getEno)).forEach(System.out::println);
		//li.stream().sorted(Comparator.comparing(Employe::getEname)).forEach(System.out::println);
	}

}