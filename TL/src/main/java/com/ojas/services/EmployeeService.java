package com.ojas.services;

import java.util.List;

import com.ojas.model.Employee;

public interface EmployeeService {
public List<Employee> findAll();
public void save(Employee theEmployee);
public void deletebyId(Long theId);
}
