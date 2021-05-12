package com.ojas;
import java.util.*;
class Employee{
	private int empno;
	private String ename;
	private double Salary;
	public String toString() {
		
	}
}

class ListOperations{
		List<Employee> list;
		ListOperations(){
			list=new ArrayList<>();
		}
		void addEmployee(Employee e) {
			list.add(e);
			System.out.println("addes sucessfully");
		}
		void deleteEmployee(int num) {
			list.remove(--num);
			System.out.println("added sucessfully");
		}
		void updateEmployee(int ind,Employee e) {
			list.set(--ind,e);
			System.out.println("Updated sucessfully");
		}
		void lstEmployee() {
			
			System.out.println("Updated sucessfully");
			for(Employee e:list) {
				System.out.println(e.toString());
			}
		}
		void menu() {
			String m="Menu Driven Application\n";
			m+="1.Add Employee\n";
			m+="2.delete Employee\n";
			m+="3.update Employee\n";
			m+="4.List Employee\n";
			m+="5.Exit\n";
			m+="Select Any option\n";
			System.out.println(m);
		}
		void accept() {
			System.out.println("enter yor num,name,salary ");
		}
}
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		Scanner s=new Scanner(System.in);
		ListOperations obj=new ListOperations();
		for(;;) {
			obj.menu();
			in
			case 2:
				System.out.println("enter your num to delte");
				obj.deleteEmployee(sc.nextInt());;
				break;
			case 3:
				obj.accept();
				obj.deleteEmployee(sc.nextInt());;
				break;
		
		}

	}

}