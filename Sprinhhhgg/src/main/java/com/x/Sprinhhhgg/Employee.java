package com.x.Sprinhhhgg;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> sillset;
	private Map<String,String> projects;
	private Set<String> phno;
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
	public List<String> getSillset() {
		return sillset;
	}
	public void setSillset(List<String> sillset) {
		this.sillset = sillset;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	public Set<String> getPhno() {
		return phno;
	}
	public void setPhno(Set<String> phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sillset=" + sillset + ", projects=" + projects + ", phno="
				+ phno + "]";
	}
}
