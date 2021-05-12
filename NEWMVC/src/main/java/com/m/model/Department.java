package com.m.model;
import javax.persistence.*;
@Entity
@Table(name="departments")
public class Department {
	@Id
	@Column(name="department_id")
	private int id;
	private String name;

}
