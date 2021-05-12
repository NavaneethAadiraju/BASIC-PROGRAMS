package new111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1 implements Comparable {
	int empNo;
	String ename;

	public Employee1() {

		System.out.println("default constructor");
	}

	public Employee1(int empNo, String ename) {
		this.empNo = empNo;
		this.ename = ename;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int CompareTo(Object arg0) {
		Employee1 e = (Employee1) arg0;
		return this.empNo - e.empNo;
	}

	@Override
	public int compareTo(Object o) {
// TODO Auto-generated method stub
		return 0;
	}

}

public class Comparable1 {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		List<Employee1> empList = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1(10, "harsha");
		Employee1 e2 = new Employee1(20, "varsha");
		Employee1 e3 = new Employee1(30, "barsha");
		Employee1 e4 = new Employee1(40, "arsha");
		Employee1 e5 = new Employee1(50, "marsha");
		Employee1 e6 = new Employee1(60, "parsha");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		System.out.println("before sorting employee data");
		empList.forEach(x -> System.out.println(x.getEmpNo() + "" + x.getEname()));
		Collections.sort(empList);
		System.out.println("after sorting employee data");
		empList.forEach(x -> System.out.println(x.getEmpNo() + "" + x.getEname()));

	}

}